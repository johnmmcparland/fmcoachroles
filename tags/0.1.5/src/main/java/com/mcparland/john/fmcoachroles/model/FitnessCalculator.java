/*
 * This file is part of FM Coach Roles.
 * 
 * FM Coach Roles is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FM Coach Roles is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with FM Coach Roles.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.mcparland.john.fmcoachroles.model;

import org.apache.log4j.Logger;

import com.mcparland.john.fmcoachroles.logic.INonPlayer;

/**
 * Fitness calculator (strength of aerobic)
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public class FitnessCalculator implements Calculator {

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(FitnessCalculator.class);

    /**
     * Name of this calculator
     */
    private String name = "Fitness";

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.model.Calculator#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.model.Calculator#setName(java.lang.String
     * )
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.model.Calculator#calculate(com.mcparland
     * .john.fmcoachroles.logic.INonPlayer)
     */
    @Override
    public float calculate(INonPlayer nonPlayer) {
        LOGGER.debug(getName() + " calculated for non player: " + nonPlayer);
        // Fitness * 9 + ddm * 2
        int val = nonPlayer.getFitness() * 9
                + (nonPlayer.getDetermination() + nonPlayer.getLevelOfDiscipline() + nonPlayer.getMotivating()) * 2;
        LOGGER.debug(getName() + " calculated value: " + val);
        if (270 <= val) {
            return 5.0f;
        } else if (240 <= val) {
            return 4.5f;
        } else if (210 <= val) {
            return 4.0f;
        } else if (180 <= val) {
            return 3.5f;
        } else if (150 <= val) {
            return 3.0f;
        } else if (120 <= val) {
            return 2.5f;
        } else if (90 <= val) {
            return 2.0f;
        } else if (60 <= val) {
            return 1.5f;
        } else if (30 <= val) {
            return 1.0f;
        } else {
            return 0.5f;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name + " Calculator";
    }

}

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

import com.mcparland.john.fmcoachroles.logic.INonPlayer;

/**
 * A calculator for a given role
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public interface Calculator {

    /**
     * Get the name
     * 
     * @return the name of the calculator
     */
    public String getName();

    /**
     * Set the name
     * 
     * @param name
     *            the name of the calculator
     */
    public void setName(String name);

    /**
     * Calculate the proficiency of the nonPlayer
     * 
     * @param nonPlayer
     *            the non-player
     * @return the proficiency, rated between 0 and 5 with half values permitted
     */
    public float calculate(INonPlayer nonPlayer);

}

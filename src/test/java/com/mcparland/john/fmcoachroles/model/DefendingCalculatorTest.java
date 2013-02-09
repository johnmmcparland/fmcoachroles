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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mcparland.john.fmcoachroles.logic.NonPlayer;
import com.mcparland.john.fmcoachroles.logic.NonPlayerImpl;

/**
 * Test class for {@link DefendingCalculator}
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public class DefendingCalculatorTest {

    /**
     * Test method for
     * {@link com.mcparland.john.fmcoachroles.model.DefendingCalculator#getName()}
     * .
     */
    @Test
    public void testGetName() {
        final String name = "Defensive Coaching";
        DefendingCalculator calc = new DefendingCalculator();
        calc.setName(name);
        assertEquals(name, calc.getName());
    }

    /**
     * Test method for {@link DefendingCalculator#calculate(NonPlayer)}
     */
    public void testCalculate() {
        // Defending * 8 + (Tactical + ddm) * 3
        Calculator calc = new DefendingCalculator();
        final NonPlayer nonPlayer = new NonPlayerImpl();
        nonPlayer.setDefending(1);
        nonPlayer.setTactical(1);
        nonPlayer.setDetermination(1);
        nonPlayer.setLevelOfDiscipline(1);
        nonPlayer.setMotivating(1);
        assertEquals(0.5f, calc.calculate(nonPlayer), 0.1f);
    }

}

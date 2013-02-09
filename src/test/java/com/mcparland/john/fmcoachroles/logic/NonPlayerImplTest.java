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

package com.mcparland.john.fmcoachroles.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link NonPlayerImpl}
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public class NonPlayerImplTest {

    /**
     * Test method for
     * {@link com.mcparland.john.fmcoachroles.logic.NonPlayerImpl#getTacticalKnowledge()}
     * .
     */
    @Test
    public void testGetTacticalKnowledge() {
        final int tacticalKnowledge = 20;
        NonPlayer nonPlayer = new NonPlayerImpl();
        nonPlayer.setTacticalKnowledge(tacticalKnowledge);
        assertEquals(tacticalKnowledge, nonPlayer.getTacticalKnowledge());
    }

}

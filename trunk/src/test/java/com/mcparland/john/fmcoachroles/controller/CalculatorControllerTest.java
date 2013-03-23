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

package com.mcparland.john.fmcoachroles.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.junit.Test;

import com.mcparland.john.fmcoachroles.logic.NonPlayer;
import com.mcparland.john.fmcoachroles.model.Calculator;
import com.mcparland.john.fmcoachroles.model.CalculatorService;
import com.mcparland.john.fmcoachroles.model.CalculatorServiceImpl;
import com.mcparland.john.fmcoachroles.model.DefendingCalculator;

/**
 * Test method for {@link CalculatorController}
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public class CalculatorControllerTest {

    /**
     * Test method for
     * {@link com.mcparland.john.fmcoachroles.controller.CalculatorController#calculate(com.mcparland.john.fmcoachroles.logic.NonPlayer, javax.servlet.http.HttpSession)}
     * .
     */
    @Test
    public void testCalculate() {
        final Collection<Calculator> calcs = new ArrayList<Calculator>();
        calcs.add(new DefendingCalculator());

        final CalculatorService calculatorService = new CalculatorServiceImpl();
        calculatorService.setCalculators(calcs);

        final CalculatorController controller = new CalculatorController();
        controller.setCalculatorService(calculatorService);

        final HttpSession ses = mock(HttpSession.class);

        final NonPlayer nonPlayer = new NonPlayer();
        nonPlayer.setDefending(1);
        nonPlayer.setTactical(1);
        nonPlayer.setDetermination(1);
        nonPlayer.setLevelOfDiscipline(1);
        nonPlayer.setMotivating(1);
        nonPlayer.setAdaptability(1);

        Map<String, Object> response = controller.calculate(nonPlayer, ses);
        assertEquals(2, response.size());
        assertEquals(true, response.get("success"));
        @SuppressWarnings("unchecked")
        List<Recommendation> recs = (List<Recommendation>) response.get("assignments");
        assertEquals(1, recs.size());
        Recommendation rec = recs.get(0);
        assertEquals("Defending", rec.getRole());
        assertEquals(0.5d, rec.getStars(), 0.0d);
    }
}

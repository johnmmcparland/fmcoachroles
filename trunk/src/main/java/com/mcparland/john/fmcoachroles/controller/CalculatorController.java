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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mcparland.john.fmcoachroles.logic.NonPlayer;
import com.mcparland.john.fmcoachroles.model.Calculator;

/**
 * Controller for the calculator
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (johnmcparland@gmail.com)
 * 
 */
@Controller
public class CalculatorController {

    /**
     * Does it!
     * 
     * @return true
     */
    public boolean doIt() {
        return true;
    }

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(CalculatorController.class);

    /**
     * The calculators
     */
    @Autowired
    private Collection<Calculator> calculators;

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> calculate(NonPlayer nonPlayer, HttpSession ses) {
        LOGGER.info("Input non-player: " + nonPlayer);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("success", true);
        for (Calculator calc : calculators) {
            response.put(calc.getName(), calc.calculate(nonPlayer));
        }
        return response;
    }

}

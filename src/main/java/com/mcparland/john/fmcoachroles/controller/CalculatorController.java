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
import com.mcparland.john.fmcoachroles.model.CalculatorService;

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
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(CalculatorController.class);

    /**
     * The calculator service
     */
    @Autowired
    private CalculatorService calculatorService = null;

    /**
     * Calculate the coach assignment values for the given non-player
     * 
     * @param nonPlayer
     *            the non player to calculate for
     * @param ses
     *            the http session
     * @return JSON response containing the calculated values. Like this
     * 
     *         <pre>
     *     {
     *     "success":true,
     *     "assignments":[
     *         {
     *             "role":"Attacking",
     *             "stars":5.0
     *         },
     *         {
     *             "role":"Defending",
     *             "stars":4.5
     *         },
     *         {
     *             "role":"Tactical",
     *             "stars":4.0
     *         },
     *         {
     *             "role":"Ball Control",
     *             "stars":3.5
     *         },
     *         {
     *             "role":"Shooting",
     *             "stars":3.0
     *         },
     *         {
     *             "role":"Strength",
     *             "stars":2.5
     *         },
     *         {
     *             "role":"Aerobic",
     *             "stars":2.0
     *         },
     *         {
     *             "role":"GK - Shot Stopping",
     *             "stars":1.5
     *         },
     *         {
     *             "role":"GK - Handling",
     *             "stars":1.0
     *         }
     *     ]
     * }
     * </pre>
     */
    @RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Map<String, Object> calculate(NonPlayer nonPlayer, HttpSession ses) {
        LOGGER.info("Input non-player: " + nonPlayer);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("success", true);
        for (Calculator calc : calculatorService.getCalculators()) {
            float rating = calc.calculate(nonPlayer);
            LOGGER.info("Calculated " + rating + " for " + calc.getName());
            // TODO: Look at
            // http://www.mkyong.com/webservices/jax-rs/integrate-jackson-with-resteasy/
            response.put(calc.getName(), calc.calculate(nonPlayer));
        }
        return response;
    }

    /**
     * Set the calculator service
     * 
     * @param calculatorService
     *            the calculator service
     */
    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /**
     * Get the calculator service
     * 
     * @return the calculator service
     */
    public CalculatorService getCalculatorService() {
        return calculatorService;
    }

}

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

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

/**
 * Calculator Service
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
@Repository(value = "calculatorService")
public class CalculatorServiceImpl implements CalculatorService, InitializingBean {

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(CalculatorServiceImpl.class);

    /**
     * Calculators
     */
    @Resource(name = "calculators")
    private Collection<Calculator> calculators = null;

    /**
     * Create the service
     */
    public CalculatorServiceImpl() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.model.CalculatorService#getCalculators()
     */
    @Override
    public Collection<Calculator> getCalculators() {
        // Just return the static calcs - they'll never change!
        return calculators;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.model.CalculatorService#setCalculators
     * (java.util.Collection)
     */
    @Override
    public void setCalculators(Collection<Calculator> calculators) {
        this.calculators = calculators;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        String calcsString = calculators.size() + " calculators: \n";
        for (Calculator calc : calculators) {
            calcsString += calc.getName() + "\n";
        }
        return calcsString;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.debug(toString());
    }

}

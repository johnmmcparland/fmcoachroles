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

/**
 * A recommendation.
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public class Recommendation implements IRecommendation {

    /**
     * The role
     */
    private String role = null;

    /**
     * The star rating
     */
    private double stars = 0.0d;

    /**
     * Create a Recommendation
     */
    public Recommendation() {

    }

    /**
     * Create a Recommendation
     * 
     * @param role
     *            the role
     * @param stars
     *            the star rating
     */
    public Recommendation(String role, double stars) {
        this.role = role;
        this.stars = stars;
    }

    /* (non-Javadoc)
     * @see com.mcparland.john.fmcoachroles.controller.IRecommendation#getRole()
     */
    @Override
    public String getRole() {
        return role;
    }

    /* (non-Javadoc)
     * @see com.mcparland.john.fmcoachroles.controller.IRecommendation#setRole(java.lang.String)
     */
    @Override
    public void setRole(String role) {
        this.role = role;
    }

    /* (non-Javadoc)
     * @see com.mcparland.john.fmcoachroles.controller.IRecommendation#getStars()
     */
    @Override
    public double getStars() {
        return stars;
    }

    /* (non-Javadoc)
     * @see com.mcparland.john.fmcoachroles.controller.IRecommendation#setStars(double)
     */
    @Override
    public void setStars(double stars) {
        this.stars = stars;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return role + ": " + stars + " stars";
    }

}

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

/**
 * A non-player in Football Manager
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public class NonPlayer implements INonPlayer {

    /**
     * Attacking coaching
     */
    private int attacking = 0;

    /**
     * Defending coaching
     */
    private int defending = 0;

    /**
     * Fitness coaching
     */
    private int fitness = 0;

    /**
     * Goalkeeper coaching
     */
    private int goalkeepers = 0;

    /**
     * Man Management
     */
    private int manManagement = 0;

    /**
     * Mental coaching
     */
    private int mental = 0;

    /**
     * Tactical coaching
     */
    private int tactical = 0;

    /**
     * Technical coaching
     */
    private int technical = 0;

    /**
     * Working with youngsters
     */
    private int workingWithYoungsters = 0;

    /**
     * Adaptability
     */
    private int adaptability = 0;

    /**
     * Determination
     */
    private int determination = 0;

    /**
     * Judging Player Ability
     */
    private int judgingPlayerAbility = 0;

    /**
     * Judging Player Potential
     */
    private int judgingPlayerPotential = 0;

    /**
     * Level Of Discipline
     */
    private int levelOfDiscipline = 0;

    /**
     * Motivating
     */
    private int motivating = 0;

    /**
     * Physiotherapy
     */
    private int physiotherapy = 0;

    /**
     * Tactical knowledge
     */
    private int tacticalKnowledge = 0;

    /**
     * Create a NonPlayerImpl
     */
    public NonPlayer() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getDefending()
     */
    @Override
    public int getDefending() {
        return defending;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setDefending(int)
     */
    @Override
    public void setDefending(int defending) {
        this.defending = defending;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getAttacking()
     */
    @Override
    public int getAttacking() {
        return attacking;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setAttacking(int)
     */
    @Override
    public void setAttacking(int attacking) {
        this.attacking = attacking;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getFitness()
     */
    @Override
    public int getFitness() {
        return fitness;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setFitness(int)
     */
    @Override
    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getGoalkeepers()
     */
    @Override
    public int getGoalkeepers() {
        return goalkeepers;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setGoalkeepers(int)
     */
    @Override
    public void setGoalkeepers(int goalkeepers) {
        this.goalkeepers = goalkeepers;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getManManagement()
     */
    @Override
    public int getManManagement() {
        return manManagement;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setManManagement(int)
     */
    @Override
    public void setManManagement(int manManagement) {
        this.manManagement = manManagement;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getMental()
     */
    @Override
    public int getMental() {
        return mental;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setMental(int)
     */
    @Override
    public void setMental(int mental) {
        this.mental = mental;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getTactical()
     */
    @Override
    public int getTactical() {
        return tactical;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setTactical(int)
     */
    @Override
    public void setTactical(int tactical) {
        this.tactical = tactical;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getTechnical()
     */
    @Override
    public int getTechnical() {
        return technical;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setTechnical(int)
     */
    @Override
    public void setTechnical(int technical) {
        this.technical = technical;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#getWorkingWithYoungsters
     * ()
     */
    @Override
    public int getWorkingWithYoungsters() {
        return workingWithYoungsters;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setWorkingWithYoungsters
     * (int)
     */
    @Override
    public void setWorkingWithYoungsters(int workingWithYoungsters) {
        this.workingWithYoungsters = workingWithYoungsters;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getAdaptability()
     */
    @Override
    public int getAdaptability() {
        return adaptability;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setAdaptability(int)
     */
    @Override
    public void setAdaptability(int adaptability) {
        this.adaptability = adaptability;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getDetermination()
     */
    @Override
    public int getDetermination() {
        return determination;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setDetermination(int)
     */
    @Override
    public void setDetermination(int determination) {
        this.determination = determination;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#getJudgingPlayerAbility()
     */
    @Override
    public int getJudgingPlayerAbility() {
        return judgingPlayerAbility;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setJudgingPlayerAbility
     * (int)
     */
    @Override
    public void setJudgingPlayerAbility(int judgingPlayerAbility) {
        this.judgingPlayerAbility = judgingPlayerAbility;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#getJudgingPlayerPotential
     * ()
     */
    @Override
    public int getJudgingPlayerPotential() {
        return judgingPlayerPotential;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setJudgingPlayerPotential
     * (int)
     */
    @Override
    public void setJudgingPlayerPotential(int judgingPlayerPotential) {
        this.judgingPlayerPotential = judgingPlayerPotential;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#getLevelOfDiscipline()
     */
    @Override
    public int getLevelOfDiscipline() {
        return levelOfDiscipline;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setLevelOfDiscipline(int)
     */
    @Override
    public void setLevelOfDiscipline(int levelOfDiscipline) {
        this.levelOfDiscipline = levelOfDiscipline;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getMotivating()
     */
    @Override
    public int getMotivating() {
        return motivating;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#setMotivating(int)
     */
    @Override
    public void setMotivating(int motivating) {
        this.motivating = motivating;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mcparland.john.fmcoachroles.logic.NonPlayer#getPhysiotherapy()
     */
    @Override
    public int getPhysiotherapy() {
        return physiotherapy;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setPhysiotherapy(int)
     */
    @Override
    public void setPhysiotherapy(int physiotherapy) {
        this.physiotherapy = physiotherapy;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#getTacticalKnowledge()
     */
    @Override
    public int getTacticalKnowledge() {
        return tacticalKnowledge;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mcparland.john.fmcoachroles.logic.NonPlayer#setTacticalKnowledge(int)
     */
    @Override
    public void setTacticalKnowledge(int tacticalKnowledge) {
        this.tacticalKnowledge = tacticalKnowledge;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "Attacking: " + attacking + " \n" + "Defending: " + defending + " \n" + "Fitness: " + fitness + " \n"
                + "Goalkeepers: " + goalkeepers + " \n" + "Man Management: " + manManagement + " \n" + "Mental: "
                + mental + " \n" + "Tactical: " + tactical + " \n" + "Technical: " + technical + " \n"
                + "Working with youngsters: " + workingWithYoungsters + " \n" + "Adaptability: " + adaptability + " \n"
                + "Determination: " + determination + " \n" + "Judging Player Ability: " + judgingPlayerAbility + " \n"
                + "Judging Player Potential: " + judgingPlayerPotential + " \n" + "Level of Discipline: "
                + levelOfDiscipline + " \n" + "Motivating: " + motivating + " \n" + "Physiotherapy: " + physiotherapy
                + " \n" + "Tactical Knowledge: " + tacticalKnowledge + " \n";

    }
}

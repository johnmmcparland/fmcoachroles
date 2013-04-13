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
 * A non-player in football manager. The fields directly relate to their
 * attributes in-game.
 * <p>
 * 
 * @copy; John McParland
 *        </p>
 * @author John McParland (john.mcparland@gmail.com)
 */
public interface INonPlayer {

    /**
     * Get their defending attribute
     * 
     * @return defending attribute
     */
    int getDefending();

    /**
     * Set their defending attribute
     * 
     * @param defending
     *            defending attribute
     */
    void setDefending(int defending);

    /**
     * Set their tactical knowledge attribute
     * 
     * @param tacticalKnowledge
     *            tactical knowledge attribute
     */
    void setTacticalKnowledge(int tacticalKnowledge);

    /**
     * Get their tactical knowledge attribute
     * 
     * @return tactical knowledge attribute
     */
    int getTacticalKnowledge();

    /**
     * Set their physiotherapy attribute
     * 
     * @param physiotherapy
     *            physiotherapy attribute
     */
    void setPhysiotherapy(int physiotherapy);

    /**
     * Get their physiotherapy attribute
     * 
     * @return physiotherapy attribute
     */
    int getPhysiotherapy();

    /**
     * Set their motivating attribute
     * 
     * @param motivating
     *            motivating attribute
     */
    void setMotivating(int motivating);

    /**
     * Get their motivating attribute
     * 
     * @return motivating attribute
     */
    int getMotivating();

    /**
     * Set their level of discipline attribute
     * 
     * @param levelOfDiscipline
     *            levelOfDiscipline attribute
     */
    void setLevelOfDiscipline(int levelOfDiscipline);

    /**
     * Get their level of discipline attribute
     * 
     * @return level of discipline attribute
     */
    int getLevelOfDiscipline();

    /**
     * Set their judging player potential attribute
     * 
     * @param judgingPlayerPotential
     *            judging player potential attribute
     */
    void setJudgingPlayerPotential(int judgingPlayerPotential);

    /**
     * Get their judging player potential attribute
     * 
     * @return judging player potential attribute
     */
    int getJudgingPlayerPotential();

    /**
     * Set their judging player ability attribute
     * 
     * @param judgingPlayerAbility
     *            judging player ability attribute
     */
    void setJudgingPlayerAbility(int judgingPlayerAbility);

    /**
     * Get their judging player ability attribute
     * 
     * @return judging player ability attribute
     */
    int getJudgingPlayerAbility();

    /**
     * Set their determination attribute
     * 
     * @param determination
     *            determination attribute
     */
    void setDetermination(int determination);

    /**
     * Get their determination attribute
     * 
     * @return determination attribute
     */
    int getDetermination();

    /**
     * Set their adaptability attribute
     * 
     * @param adaptability
     *            adaptability attribute
     */
    void setAdaptability(int adaptability);

    /**
     * Get their adaptability attribute
     * 
     * @return adaptability attribute
     */
    int getAdaptability();

    /**
     * Set their working with youngsters attribute
     * 
     * @param workingWithYoungsters
     *            working with youngsters attribute
     */
    void setWorkingWithYoungsters(int workingWithYoungsters);

    /**
     * Get their working with youngsters attribute
     * 
     * @return working with youngsters attribute
     */
    int getWorkingWithYoungsters();

    /**
     * Set their technical attribute
     * 
     * @param technical
     *            technical attribute
     */
    void setTechnical(int technical);

    /**
     * Get their technical attribute
     * 
     * @return technical attribute
     */
    int getTechnical();

    /**
     * Set their tactical attribute
     * 
     * @param tactical
     *            tactical attribute
     */
    void setTactical(int tactical);

    /**
     * Get their tactical attribute
     * 
     * @return tactical attribute
     */
    int getTactical();

    /**
     * Set their mental attribute
     * 
     * @param mental
     *            mental attribute
     */
    void setMental(int mental);

    /**
     * Get their mental attribute
     * 
     * @return mental attribute
     */
    int getMental();

    /**
     * Set their man management attribute
     * 
     * @param manManagement
     *            man management attribute
     */
    void setManManagement(int manManagement);

    /**
     * Get their man management attribute
     * 
     * @return man management attribute
     */
    int getManManagement();

    /**
     * Set their goalkeepers attribute
     * 
     * @param goalkeepers
     *            goalkeepers attribute
     */
    void setGoalkeepers(int goalkeepers);

    /**
     * Get their goalkeepers attribute
     * 
     * @return goalkeepers attribute
     */
    int getGoalkeepers();

    /**
     * Set their fitness attribute
     * 
     * @param fitness
     *            fitness attribute
     */
    void setFitness(int fitness);

    /**
     * Get their fitness attribute
     * 
     * @return fitness attribute
     */
    int getFitness();

    /**
     * Set their attacking attribute
     * 
     * @param attacking
     *            attacking attribute
     */
    void setAttacking(int attacking);

    /**
     * Get their attacking attribute
     * 
     * @return attacking attribute
     */
    int getAttacking();

}

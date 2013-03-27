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
Ext.application({

    requires: ['FMCoachRoles.view.CoachAssignmentChart',
               'FMCoachRoles.view.NonPlayerForm',
               'FMCoachRoles.view.Viewport',
               'Ext.data.reader.Json'],

    appFolder: 'app',
    controllers: ['CalculatorController'],
    stores: ['AssignmentStore'],
    models: ['Assignment'],
    views: ['Viewport', 'NonPlayerForm','CoachAssignmentChart'],

    name: 'FMCoachRoles',
    autoCreateViewport: true,

    launch: function() {
        console.log("Launching " + this.name);
    }
});

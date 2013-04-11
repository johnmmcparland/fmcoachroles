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
Ext.define('FMCoachRoles.view.Viewport', {
	extend : 'Ext.container.Viewport',
	requires : [ 'FMCoachRoles.view.CoachAssignmentChart',
			'FMCoachRoles.view.NonPlayerForm' ],
	layout : 'fit',

	initComponent : function() {
		this.items = {
			xtype : 'panel',
			title : 'FM Coach Roles',
			layout : 'column',
			// This is what's shown in the box
			items : [ {
				xtype : 'panel',
			columnWidth : 0.25,
				items : [ 
				{
					xtype: 'panel',
					html: '<h1>Find your coaches best assignment</h1><br /><ol><li>Enter their attribute values in the form below</li><li>Press Calculate</li><li>View the chart</li></ol><br /><p>Written by John McParland</p><p>Licenced under LGPLv3</p><br /><p>Formula\'s taken from BonzoLLM on <a target="_blank" href="http://www.thedugout.tv/community/showthread.php?t=61551">The Dugout</a></p>'
				},{
					xtype : 'nonPlayerBox'
				} 
				 ]
			}, {
				columnWidth : 0.75,
				xtype : 'coachAssignmentChart'

			} ]
		};
		this.callParent();
	}
});
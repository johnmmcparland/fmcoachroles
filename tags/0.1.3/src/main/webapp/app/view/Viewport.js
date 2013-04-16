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
			layout : 'border',
			defaults: {
			    collapsible: true,
			    split: true,
			    bodyStyle: 'padding: 15px'
		    },
			// This is what's shown in the box
			items : [ 
			         {
			            title: 'About',
			            region: 'south',
			            height: '100',
			            minSzie: '75',
			            maxSize: '75',
			            margins: '5 0 0 0',
			            html: '<p>Created by John McParland</p><p>Source code licensed under LGPLv3, stored on <a target="_blank" href="http://code.google.com/p/fmcoachroles">Google Code</a></p><p>Formulas courtesy of BonzoLLM at <a target="_blank" href="http://www.thedugout.tv/community/showthread.php?t=61551">The Dugout</a></p>'
			         },
			         {
			        	title: 'Help',
			        	region: 'west',
			            margins: '5 0 0 0',
			            cmargins: '5 5 0 0',
			            width: 320,
			            minSize: 100,
			            maxSize: 320,
			            html: '<h3>Find a coach/assistant manager\'s best role</h3><br /><ol><li>Enter their attribute values in the Non Player form</li><li>Hit Calculate</li><li>View the results on the chart</li></ol>'
			         },
			         {
			            collapsible: false,
			            region: 'center',
			            margins: '5 0 0 0',
			            layout: 'column',
			            items: [
			                {
							    xtype : 'nonPlayerBox',
						        columnWidth : 0.25
						    }, 
						    {
							    xtype : 'coachAssignmentChart',
							    columnWidth : 0.75
						    } ]
					 }
						    
            ] };
		this.callParent();
	}
});
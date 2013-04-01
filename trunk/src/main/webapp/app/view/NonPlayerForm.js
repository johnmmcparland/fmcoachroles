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
Ext.require('Ext.form.field.Number');

Ext.define('FMCoachRoles.view.NonPlayerForm', {
	extend : 'Ext.form.Panel',
	alias : 'widget.nonPlayerBox',
	title : 'Non Player',
	width : 400,
	bodyPadding : 5,
	id : 'nonPlayerForm',
	fieldDefaults : {
		msgTarget : 'side',
		labelWidth : 100
	},
	defaultType : 'textfield',
	// NOTE: The URL maps to the fmcoachroles servlet in the web.xml
	// file!
	url : 'calculate.form',
	items : [ {
		fieldLabel : 'Attacking',
		name : 'attacking',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Defending',
		name : 'defending',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Fitness',
		name : 'fitness',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Goalkeepers',
		name : 'goalkeepers',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Man Management',
		name : 'manManagement',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Mental',
		name : 'mental',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Tactical',
		name : 'tactical',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Technical',
		name : 'technical',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Working With Youngsters',
		name : 'workingWithYoungsters',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Adaptability',
		name : 'adaptability',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Determination',
		name : 'determination',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Judging Player Ability',
		name : 'judgingPlayerAbility',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Judging Player Potential',
		name : 'judgingPlayerPotential',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Level of Discipline',
		name : 'levelOfDiscipline',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Motivating',
		name : 'motivating',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Physiotherapy',
		name : 'physiotherapy',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}, {
		fieldLabel : 'Tactical Knowledge',
		name : 'tacticalKnowledge',
		xtype : 'numberfield',
		value : 1,
		minValue : 1,
		maxValue : 20
	}

	],
	buttons : [ {
		text : 'Calculate',
		action : 'calculate'
	}, {
		text : 'Reset',
		// Here's how to do a Reset on a form
		handler : function() {
			this.up('form').getForm().reset();
		}
	} ]
});

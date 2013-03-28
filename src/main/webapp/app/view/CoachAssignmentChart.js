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
Ext.require('Ext.chart.*');
Ext.require('FMCoachRoles.store.AssignmentStore');

Ext.define('FMCoachRoles.view.CoachAssignmentChart', {
    extend:'Ext.chart.Chart',
    alias:['widget.coachAssignmentChart'],

    width:800,
    height:600,
    animate:true,
    store: 'AssignmentStore',
    shadow:true,

    initComponent: function() {
        Ext.applyIf(this, {
            axes: [
                {
                    type: 'Category',
                    fields: [
                        'role'
                    ],
                    position: 'bottom'
                },
                {
                    type: 'Numeric',
                    fields: [
                        'stars'
                    ],
                    position: 'left',
                    minimum:0.0,
                    maximum: 5.0
                }
            ],
            series: [
                {
                    type: 'column',
                    label: {
                        display: 'insideEnd',
                        field: 'stars',
                        color: '#333',
                        'text-anchor': 'middle'
                    },
                    xField: 'role',
                    yField: ['stars'],
                    tips: {
                        trackMouse: true,
                        width: 75,
                        height: 30,
                        renderer: function(storeItem, item) {
                            this.setTitle(storeItem.get('stars') + ' stars');
                        }
                    }
                }
            ]
        });

        this.callParent(arguments);
    }
    /*

    axes:[
        {
            type:'Numeric',
            position:'left',
            fields:['stars'],
            title:'Stars',
            grid:true,
            minimum:0.0,
            maximum: 5.0
        },
        {
            type:'Category',
            position:'bottom',
            fields:['role'],
            title:'Role'
        }
    ],
    series:[
        {
            type:'column',
            axis:'bottom',
            highlight:true,
            xField:'role',
            yField:'stars',
            tips: {
                trackMouse: true,
                width: 75,
                height: 30,
                renderer: function(storeItem, item) {
                    this.setTitle(storeItem.get('stars') + ' stars');
                }
            }
        }
    ]
    */
});

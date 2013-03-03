/**
 * Created with JetBrains WebStorm.
 * User: t0135292
 * Date: 28/02/13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
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

})
;

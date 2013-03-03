Ext.define('FMCoachRoles.view.Viewport', {
    extend : 'Ext.container.Viewport',
    requires : [
        'FMCoachRoles.view.CoachAssignmentChart',
        'FMCoachRoles.view.NonPlayerForm'
        ],
    layout : 'fit',

    initComponent : function() {
        this.items = {
            xtype : 'panel',
            title : 'FM Coach Roles',
            layout : 'column',
            // This is what's shown in the box
            items : [{
                xtype : 'nonPlayerBox',
                columnWidth: 0.25
            },
                {
                    columnWidth: 0.75,
                    xtype: 'coachAssignmentChart'
                }]
        };
        this.callParent();
    }
});

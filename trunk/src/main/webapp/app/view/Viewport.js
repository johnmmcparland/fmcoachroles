Ext.define('ChartExample.view.Viewport', {
    extend : 'Ext.container.Viewport',
    requires : [
        'ChartExample.view.MyChart',
        'ChartExample.view.NonPlayerForm'
        ],
    layout : 'fit',

    initComponent : function() {
        this.items = {
            xtype : 'panel',
            title : 'Chart Example Form',
            layout : 'column',
            // This is what's shown in the box
            items : [{
                xtype : 'nonPlayerBox',
                columnWidth: 0.25
            },
                {
                    columnWidth: 0.75,
                    xtype: 'myChart'
                   // title: 'chartPanel',
                    //xtype: 'panel',
                    //html: 'Chart panel'
                    //items: [{
                    //    xtype: 'myChart'
                    //}]
                }]
        };
        this.callParent();
    }
});

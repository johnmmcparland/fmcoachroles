/**
 * Created with JetBrains WebStorm.
 * User: t0135292
 * Date: 28/02/13
 * Time: 14:00
 * To change this template use File | Settings | File Templates.
 */
Ext.define('ChartExample.view.MyOtherChart' ,{
    extend: 'Ext.chart.Chart',
    alias : 'widget.myOtherChart',
    id: 'myOtherChart',

    height: 500,
    width: 800,
    animate: true,
    shadow: true,
    store : 'Cities',
    theme: 'Base:gradients',
    legend: {
        position: 'right'
    },
    insetPadding: 25,

    series: [{
        type: 'pie',
        field: 'population',
        highlight: true,
        showInLegend: true,
        tips: {
            trackMouse: true,
            width: 200,
            height: 40,
            renderer: function(storeItem, item) {
                this.setTitle(storeItem.get('name') + ' current Year<br/>Population is ' + storeItem.get('population'));
            }
        },
        label: {
            display: 'rotate',
            field: 'name',
            font: '18px Arial',
            contrast: true
        },
        highlight: {
            segment: {
                margin: 20
            }
        },
    }]

});
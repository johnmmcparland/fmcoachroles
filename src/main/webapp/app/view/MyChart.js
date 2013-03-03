/**
 * Created with JetBrains WebStorm.
 * User: t0135292
 * Date: 26/02/13
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */
Ext.require('Ext.chart.*');

Ext.define('ChartExample.view.MyChart', {
    extend: 'Ext.chart.Chart',
    alias: ['widget.myChart'],

    height: 600,
    width: 600,
    animate: true,

    // Attacking,
    // Defending,
    // Tactical,
    // Strength,
    // Aerobic,
    // GK - Shot Stopping,
    // GK - Handling,
    // Ball Control,
    //

    store: Ext.create('Ext.data.Store',
        {
            data: [
                {
                    "CASTClose": 22.0,
                    "CASTRunTime": "2012-11-01 00:00:00.0",
                    "CASTProject": "CAST",
                    "CASTStartWork": 6.0,
                    "CASTAnalyse": 2.0,
                    "CASTSubmit": 24.0,
                    "CASTSolve": 17.0,
                    "CASTAccept": 4.0,
                    "CASTRunTimeText": "Nov 12",
                    "CASTVerify": 0.0
                },
                {
                    "CASTClose": 25.0,
                    "CASTRunTime": "2012-12-01 00:00:00.0",
                    "CASTProject": "CAST",
                    "CASTStartWork": 9.0,
                    "CASTAnalyse": 1.0,
                    "CASTSubmit": 26.0,
                    "CASTSolve": 25.0,
                    "CASTAccept": 5.0,
                    "CASTRunTimeText": "Dec 12",
                    "CASTVerify": 0.0
                },
                {
                    "CASTClose": 27.0,
                    "CASTRunTime": "2013-01-01 00:00:00.0",
                    "CASTProject": "CAST",
                    "CASTStartWork": 10.0,
                    "CASTAnalyse": 3.0,
                    "CASTSubmit": 20.0,
                    "CASTSolve": 38.0,
                    "CASTAccept": 6.0,
                    "CASTRunTimeText": "Jan 13",
                    "CASTVerify": 0.0
                },
                {
                    "CASTClose": 38.0,
                    "CASTRunTime": "2013-02-01 00:00:00.0",
                    "CASTProject": "CAST",
                    "CASTStartWork": 4.0,
                    "CASTAnalyse": 1.0,
                    "CASTSubmit": 15.0,
                    "CASTSolve": 40.0,
                    "CASTAccept": 7.0,
                    "CASTRunTimeText": "Feb 13",
                    "CASTVerify": 0.0
                }
            ],
            fields: [
                "CASTProject",
                "CASTRunTime",
                "CASTRunTimeText",
                "CASTSubmit",
                "CASTAnalyse",
                "CASTAccept",
                "CASTStartWork",
                "CASTSolve",
                "CASTVerify",
                "CASTClose"
            ]
        }),
    title: 'SPCRByState',
    insetPadding: 15,
    legend: {
        position: 'bottom',
        itemSpacing: 0,
        padding: 0,
        boxStrokeWidth: 0,
        labelFont: '10px Helvetica sans-serif'
    },
    axes: [
        {
            type: 'Numeric',
            position: 'left',
            fields: [
                'CASTProject',
                'CASTRunTime',
                'CASTRunTimeText',
                'CASTSubmit',
                'CASTAnalyse',
                'CASTAccept',
                'CASTStartWork',
                'CASTSolve',
                'CASTVerify',
                'CASTClose'
            ],
            title: 'NumberofPCRs'
        },
        {
            type: 'Category',
            position: 'bottom',
            fields: [
                'CASTRunTimeText'
            ],
            title: 'Date',
            label: {
                rotate: {
                    degrees: 315
                }
            }
        }
    ],
    series: [
        {
            type: 'area',
            axis: 'left',
            xField: 'CASTRunTimeText',
            yField:[
                'CASTProject',
                'CASTRunTime',
                'CASTRunTimeText',
                'CASTSubmit',
                'CASTAnalyse',
                'CASTAccept',
                'CASTStartWork',
                'CASTSolve',
                'CASTVerify',
                'CASTClose'
            ]
        }
    ]
});

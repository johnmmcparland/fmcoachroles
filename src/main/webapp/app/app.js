Ext.application({

    requires: ['ChartExample.view.MyChart'],

    appFolder: 'app',
    controllers: ['CalculatorController'],
    name: 'ChartExample',
    autoCreateViewport: true,

    launch: function() {
        console.log("Launching " + this.name);
    }
});

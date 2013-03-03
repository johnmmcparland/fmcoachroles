Ext.application({

    requires: ['FMCoachRoles.view.CoachAssignmentChart', 'FMCoachRoles.store.AssignmentStore'],

    appFolder: 'app',
    controllers: ['CalculatorController'],
    stores: ['AssignmentStore'],

    name: 'FMCoachRoles',
    autoCreateViewport: true,

    launch: function() {
        console.log("Launching " + this.name);
    }
});

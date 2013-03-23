Ext.require('FMCoachRoles.store.AssignmentStore');

Ext.define('FMCoachRoles.controller.CalculatorController', {
    extend : 'Ext.app.Controller',

    stores: ['AssignmentStore'],

    // Initialize!
    init : function() {
        this.control({
            'nonPlayerBox button[action=calculate]' : {
                click : this.calculate
            }
        });
    },

    // Calculate
    calculate : function(button) {
        console.log("Calculating...");
        var form = button.up('form').getForm();// get the basic form

        if (form.isValid()) { // make sure the form contains valid data before
            console.log("Form is valid: " + form);
            form.add
            // submitting
            form.submit({
                // success is based on the "success" property returned by
                // CalculatorController.java
                success:function (form, action) {
                    //console.log(action);
                    console.log(action.result);
                    loadAssignmentsData(action.result);
                    //console.log(action.result.msg);
                    Ext.Msg.alert('Success', 'Look at the recommended assignments');
                },
                // failure is based on the "success" property returned by
                // AuthenticationController.java
                failure:function (form, action) {
                    console.log(action.result);
                    var msg = action.result.msg;
                    Ext.Msg.alert('Error', 'Sorry there was a problem determining the coach assignments');
                }
            });
        } else { // display error alert if the data is invalid
            Ext.Msg.alert('Invalid Data', 'Please correct form errors.');
        }
    },

    loadAssignmentsData: function(result) {
        this.getAssignmentStoreStore().loadData(result);
    }
});

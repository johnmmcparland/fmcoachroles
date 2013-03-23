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

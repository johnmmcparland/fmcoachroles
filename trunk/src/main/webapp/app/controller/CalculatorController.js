Ext.define('FMCoachRoles.controller.CalculatorController', {
	extend : 'Ext.app.Controller',
	init : function() {
		this.control({
			'nonPlayerBox button[action=calculate]' : {
				click : this.calculate
			}
		});
	},
	calculate : function(button) {
		console.log("Calculating...");
		var form = button.up('form').getForm();// get the basic form
		if (form.isValid()) { // make sure the form contains valid data before
								// submitting
			form.submit({
				// success is based on the "success" property returned by
				// CalculatorController.java
				success : function(form, action) {
					Ext.Msg.alert('Success', action.result.msg);
				},
				// failure is based on the "success" property returned by
				// AuthenticationControoler.java
				failure : function(form, action) {
					console.log(action.result);
					var msg = action.result.msg;

					Ext.Msg.alert('Failed', msg);
				}
			});
		} else { // display error alert if the data is invalid
			Ext.Msg.alert('Invalid Data', 'Please correct form errors.');
		}
	}
});
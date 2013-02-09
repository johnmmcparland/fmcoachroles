Ext.define('FMCoachRoles.view.NonPlayerForm', {
			extend : 'Ext.form.Panel',
			alias : 'widget.nonPlayerBox',
			title : 'Non Player',
			width : 250,
			bodyPadding : 5,
			fieldDefaults : {
				msgTarget : 'side',
				labelWidth : 75
			},
			defaultType : 'textfield',
			// NOTE: The URL maps to the fmcoachroles servlet in the web.xml
			// file!
			url : 'calculate.form',
			items : [{
						fieldLabel : 'Login',
						name : 'login',
						allowBlank : false
					}, {
						fieldLabel : 'Password',
						name : 'password'
					}],
			buttons : [{
						text : 'Submit',
						action : 'calculate'
					}, {
						text : 'Reset'
					}]
		});
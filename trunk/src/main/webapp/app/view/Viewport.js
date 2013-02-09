Ext.define('FMCoachRoles.view.Viewport', {
			extend : 'Ext.container.Viewport',
			requires : ['FMCoachRoles.view.AuthenticationForm'],
			layout : 'fit',
			initComponent : function() {
				this.items = {
					xtype : 'panel',
					title : 'Football Manager Coach Roles',
					height : 800,
					width : '100%',
					layout : {
						type : 'hbox',
						align : 'middle',
						pack : 'center'
					},
					// This is what's shown in the box
					items : [{
								xtype : 'nonPlayerBox'
							}]
				};
				this.callParent();
			}
		});
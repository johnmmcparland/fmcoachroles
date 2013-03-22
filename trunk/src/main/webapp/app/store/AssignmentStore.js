Ext.define('FMCoachRoles.store.AssignmentStore', {
    extend:'Ext.data.Store',
    model:'FMCoachRoles.model.Assignment',
    autoLoad:true,

    // http://docs.sencha.com/ext-js/4-1/#!/api/Ext.data.Store-event-load
    proxy:{
        type:'ajax',
        api:{
            read:'data/assignments.json'
        },
        reader:{
            type:'json',
            root:'assignments',
            successProperty:'success'
        }
    },
    sorters:[
        { property:'role'
        }
    ]
});

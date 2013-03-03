Ext.define('FMCoachRoles.store.AssignmentStore', {
    extend:'Ext.data.Store',
    model:'FMCoachRoles.model.Assignment',
    autoLoad:true,

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

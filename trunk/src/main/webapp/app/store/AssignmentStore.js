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
Ext.define('FMCoachRoles.store.AssignmentStore', {
    extend:'Ext.data.Store',
    model:'FMCoachRoles.model.Assignment',
    storeId: 'store.assignmentStore',

    autoLoad:false,
    // http://docs.sencha.com/ext-js/4-1/#!/api/Ext.data.Store-event-load
    proxy:{
        type:'ajax',
        //api:{
        //    read:'data/assignments.json'
        //},
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

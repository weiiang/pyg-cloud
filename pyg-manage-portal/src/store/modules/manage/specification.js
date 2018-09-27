import {  getSpecificationPage,getSpecificationInfo ,editSpecification, delSpecification} from 'api/manage/specification';

export default {
    actions: {
        manage_getSpecificationPage({commit}, params){
            return new Promise((resolve, reject) => {
                getSpecificationPage(params).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },

        manage_getSpecificationInfo({commit}, params){
            return new Promise((resolve, reject) => {
                getSpecificationInfo(params).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },

        manage_editSpecification({commit}, data){
            return new Promise((resolve, reject) => {
                editSpecification(data).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },

        manage_delSpecification({commit}, ids){
            return new Promise((resolve, reject) => {
                delSpecification(ids).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        }
    }
}
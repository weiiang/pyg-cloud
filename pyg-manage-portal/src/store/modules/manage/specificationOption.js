import {  getSpecificationOptionBySpecId,editSpecificationOption} from 'api/manage/specificationOption';

export default {
    actions: {
        manage_getSpecificationOptionBySpecId({commit}, params){
            return new Promise((resolve, reject) => {
                getSpecificationOptionBySpecId(params).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },

        manage_editSpecificationOption({commit}, params){
            return new Promise((resolve, reject) => {
                editSpecificationOption(params).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },
    }
}
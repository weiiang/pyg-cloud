import { getBrandList, getBrandPage,editBrand } from 'api/manage/brand';

export default {
    actions: {
        manage_brandList({commit}, params){
            return new Promise((resolve, reject) => {
                getBrandList(params).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },

        manage_brandPage({commit}, params){
            return new Promise((resolve, reject) => {
                getBrandPage(params).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },

        manage_editBrand({commit}, data){
            return new Promise((resolve, reject) => {
                editBrand(data).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        }
    }
}
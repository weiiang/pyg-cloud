import {  getBrandPage,editBrand ,getBrandInfo, delBrand} from 'api/manage/brand';

export default {
    actions: {
        manage_brandInfo({commit}, params){
            return new Promise((resolve, reject) => {
                getBrandInfo(params).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        },

        // manage_brandList({commit}, params){
        //     return new Promise((resolve, reject) => {
        //         getBrandList(params).then(response => {
        //             resolve(response);
        //         }).catch(error => {
        //             reject(error);
        //         });
        //     });
        // },

        manage_brandPage({commit}, params){
            return new Promise((resolve, reject) => {
                getBrandPage(params).then(response => {
                    console.log("response"+JSON.stringify(response))
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
        },

        manage_delBrand({commit}, data){
            return new Promise((resolve, reject) => {
                delBrand(data).then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        }
    }
}
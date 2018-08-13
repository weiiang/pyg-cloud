import { getBrandList } from 'api/manage/brand';

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
        }
    }
}
import { getBrandList } from 'api/manage/brand';

export default {
    actions: {
        manage_brandList({commit}){
            return new Promise((resolve, reject) => {
                getBrandList().then(response => {
                    resolve(response);
                }).catch(error => {
                    reject(error);
                });
            });
        }
    }
}
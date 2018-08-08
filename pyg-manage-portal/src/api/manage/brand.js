import fetch from 'utils/fetch';


//获取品牌列表
export function getBrandList() {
    return fetch({
        url: '/brand/list',
        method: 'get'
    });
}
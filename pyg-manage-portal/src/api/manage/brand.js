import fetch from 'utils/fetch';


//获取品牌列表
export function getBrandList(params) {
    return fetch({
        url: '/brand/list',
        method: 'get',
        params: params,
    });
}
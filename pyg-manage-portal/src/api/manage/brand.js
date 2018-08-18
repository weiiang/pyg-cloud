import fetch from 'utils/fetch';


//获取品牌列表
export function getBrandList(params) {
    return fetch({
        url: '/brand/list',
        method: 'get',
        params: params,
    });
}

//获取品牌列表+条件查询
export function getBrandPage(params) {
    return fetch({
        url: '/brand/page',
        method: 'get',
        params: params,
    });
}
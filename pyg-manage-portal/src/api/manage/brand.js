import fetch from 'utils/fetch';


// //获取品牌列表
// export function getBrandList(params) {
//     return fetch({
//         url: '/brand/list',
//         method: 'get',
//         params: params,
//     });
// }

//获取品牌列表+条件查询
export function getBrandPage(params) {
    return fetch({
        url: process.env.ServerName_MANAGE_WEB_SERVICE+'/brand/list',
        method: 'get',
        params: params,
    });
}


//获取详情
export function getBrandInfo(params) {
    return fetch({
        url: process.env.ServerName_MANAGE_WEB_SERVICE+'/brand/info',
        method: 'get',
        params: params,
    });
}

//添加修改品牌信息
export function editBrand(data) {
    return fetch({
        url: process.env.ServerName_MANAGE_WEB_SERVICE+'/brand',
        method: 'post',
        data: data,
        dataType: 'json'
    });
}

//添加修改品牌信息
export function delBrand(ids) {
    return fetch({
        url: process.env.ServerName_MANAGE_WEB_SERVICE+'/brand/del',
        method: 'delete',
        params: {ids},
    });
}
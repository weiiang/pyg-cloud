import fetch from 'utils/fetch';

//获取规格列表分页
export function getSpecificationPage(params) {
    return fetch({
        url: process.env.ServerName_GOODS_SERVICE+'/specification/page',
        method: 'get',
        params: params,
    });
}


//获取规格详情
export function getSpecificationInfo(params) {
    return fetch({
        url: process.env.ServerName_GOODS_SERVICE+'/specification/info',
        method: 'get',
        params: params,
    });
}

//编辑规格信息
export function editSpecification(data) {
    return fetch({
        url: process.env.ServerName_GOODS_SERVICE+'/specification/edit',
        method: 'post',
        data: data,
    });
}

//删除规格信息
export function delSpecification(ids) {
    return fetch({
        url: process.env.ServerName_MANAGE_WEB_SERVICE+'/specification/del',
        method: 'delete',
        params: {ids},
    });
}
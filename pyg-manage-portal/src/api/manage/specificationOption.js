import fetch from 'utils/fetch';

//根据规格ID获取规格详情
export function getSpecificationOptionBySpecId(specId) {
    return fetch({
        url: process.env.ServerName_GOODS_SERVICE+'/specification-option/spec-list',
        method: 'get',
        params: specId,
    });
}


//批量插入规格详情
export function editSpecificationOption(params) {
    return fetch({
        url: process.env.ServerName_GOODS_SERVICE+'/specification-option/edit-option-list',
        method: 'get',
        params: {specId: params.specId},
        data: params.specificationOptionList
    });
}


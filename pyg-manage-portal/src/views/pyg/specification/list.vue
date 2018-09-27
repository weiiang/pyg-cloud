<template>
    <div>
        <Row>
            <div class="toolspan-btnGroup">
                <Button type="primary" @click="add" v-if="isAdd">
                    <Icon type="plus-round"></Icon>
                    添加
                </Button>
                <Button type="error" @click="batchDel" v-if="isBatchdel">
                    <Icon type="minus-round"></Icon>
                    删除选中项
                </Button>
            </div>
            <Table :columns="tableColums" :data="tableData.records" border></Table>
            <div style="position:absolute;top:0px;width:100%;height:100%;display: flex;
                            align-items: center;
                            justify-content: center;background: rgba(210, 216, 222, 0.5);" v-if="list_loadding">
                <Spin size="large"></Spin>
                <h6 style="color:#2d8cf0;margin-top:10px;">正在获取数据...</h6>
            </div>
        </Row>
        <Row>
            <div>
                <div class="toolspan">
                    <Page class="toolspan-pager" show-total  show-elevator
                          :page-size="tableData.size"
                          :current="tableData.current"
                          :total="tableData.total"
                          @on-change="setInitPage"
                          @on-page-size-change="pageSizeChange" ref="listPager"></Page>
                </div>
            </div>
        </Row>
    </div>

</template>

<script>
    export default {
        data() {
            return {
                listQueryParams:{},
                //操作权限
                isDel: true,
                isAdd: true,
                isBatchdel: true,
                isEdit: true,
                showDetails: true,
                list_loadding: "",
                tableData:[],
                tableColums:[{type: 'selection',width: 60,align: 'center'},
                    {title:"序号",width:65,align:"center",
                        render:(h,params)=>{
                            return h('div', (this.tableData.current-1)*this.tableData.size+params.index+1 );
                        }
                    },
                    {
                        title: '规格分类',
                        key: 'spec_name'
                    },
                    {
                        title: "操作",
                        key: "action",
                        width: 250,
                        align: "center",
                        render: (h, params)=> {
                            const btns=[];
                            if(this.isEdit){
                                btns.push(h('Button', {
                                    props: {
                                        type: 'primary',
                                        size: 'small'
                                    },
                                    style: {
                                        marginRight: '5px'
                                    },
                                    on: {
                                        click: () => {
                                            this.edit(params.index, params.row.id)
                                        }
                                    }
                                }, '编辑'));
                            }
                            if(this.isDel){
                                btns.push(h('Button', {
                                    props: {
                                        type: 'error',
                                        size: 'small'
                                    },
                                    style: {
                                        marginRight: '5px'
                                    },
                                    on: {
                                        click: () => {
                                            this.remove(params.index, params.row.id)
                                        }
                                    }
                                }, '删除'));
                            }
                            if(this.showDetails){
                                btns.push(h('Button', {
                                    props: {
                                        type: 'success',
                                        size: 'small'
                                    },
                                    style: {
                                        marginRight: '5px'
                                    },
                                    on: {
                                        click: () => {
                                            this.getDetails(params.index, params.row.id)
                                        }
                                    }
                                }, '查看详情'));
                            }
                            return h('div', btns);
                        }
                    }
                ],
            }
        },

        methods:{
            getPageList(){
                this.$store.dispatch("manage_getSpecificationPage", this.listQueryParams).then(res =>{
                    this.tableData = res.data;
                });
            },
            /**
             * 添加和编辑，当ID为空的时候添加，当ID不为空的时候编辑
             */
            add(index, id){
                this.$layer.iframe({
                    content: {
                        content: editBrand, //传递的组件对象
                        parent: this,//当前的vue对象
                        data:{
                            id:id,
                        } //props
                    },
                    area:['350px','250px'],
                    title:"添加品牌信息",
                    shadeClose: false,
                });
            },

            edit(index, id){
                this.$layer.iframe({
                    content: {
                        content: editBrand, //传递的组件对象
                        parent: this,//当前的vue对象
                        data:{
                            id:id,
                        } //props
                    },
                    area:['350px','250px'],
                    title:"修改品牌信息",
                    shadeClose: false,
                });
            },

            remove(index, id){
                alert(id);
                let ids = [];
                ids.push(id);
                this.$Modal.confirm({
                    title:"温馨提醒",
                    content:"您确定删除当前选中的数据吗？",
                    onOk: ()=>{
                        this.$store.dispatch("manage_delBrand",ids).then(res=>{
                            this.$layer.msg("成功删除"+res.data.data+"条数据！");
                        });
                        this.getListData();
                    }
                });

            },
            batchDel(){

            },

            setInitPage(pageIndex){
                this.listQueryParams.current=pageIndex;
                this.getPageList();
            },
            pageSizeChange(pageSize) {
                this.listQueryParams.size = pageSize;
                this.getPageList();
            },
        },

        mounted(){
            this.getPageList();
        },
    }
</script>

<style>

</style>
<template>
    <div>
        <Row>
            <div class="toolspan-btnGroup">
                <Button type="primary" @click="edit" v-if="isAdd">
                    <Icon type="plus-round"></Icon>
                    添加
                </Button>
                <Button type="error" @click="batchDel" v-if="isBatchdel">
                    <Icon type="minus-round"></Icon>
                    删除选中项
                </Button>
            </div>
            <Table :columns="brandTableColums" :data="tableData.records" border></Table>
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
                    <Page class="toolspan-pager" show-total show-sizer show-elevator
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
    import editBrand from "./editBrand"
    export default {

        data () {
            return {
                listQueryParams: {},
                //按钮权限控制变量
                isAdd: true,
                isDel: true,
                isEdit: true,
                isBatchdel: true,
                list_loadding:"",
                tableData: [],
                brandTableColums: [
                    {type: 'selection',width: 60,align: 'center'},
                    {title:"序号",width:65,align:"center",
                        render:(h,params)=>{
                            return h('div', (this.tableData.current-1)*this.tableData.size+params.index+1 );
                        }
                    },
                    {
                        title: '品牌名称',
                        key: 'name'
                    },
                    {
                        title: '首字母',
                        key: 'first_char'
                    },
                    {
                        title: "操作",
                        key: "action",
                        width: 150,
                        align: "center",
                        render: (h, params) => {
                            const btns = [];
                            if (this.isEdit){
                                btns.push(h,("Button", {
                                    props:{
                                      type: "primary",
                                      size: "small",
                                    },
                                    style: {
                                        marginRight: "5px",
                                    },
                                    on: {
                                        click:() =>{
                                            this.edit(params.row.id, params.index);
                                        }
                                    }
                                },"编辑"));
                            }
                            if (this.isDel){
                                btns.push(h, ("Button",{
                                    props: {
                                      type: "error",
                                      size:"small",
                                    },
                                    style: {
                                        marginRight: "5px",
                                    },
                                    on: {
                                        click: () =>{
                                            this.del(params.row.index, params.row.id);
                                        }
                                    },
                                }, "删除"));
                            }
                        }
                    },
                ],
            }
        },

        methods: {
            getListData(){
                this.list_loadding = true;
                this.$store.dispatch("manage_brandPage",this.listQueryParams).then(res =>{
                    this.tableData = res.data;
                    console.log(res)
                }).catch(err =>{
                    this.$Message.error(err)
                })
                this.list_loadding = false;
            },
            setInitPage(pageIndex){
                this.listQueryParams.current=pageIndex;
                this.getListData();
            },
            pageSizeChange(pageSize){
                this.listQueryParams.size=pageSize;
                this.getListData();
            },
            /**
             * 添加和编辑，当ID为空的时候添加，当ID不为空的时候编辑
             */
            edit(id, index){
                alert(1)
                this.$layer.iframe({
                    content: {
                        content: editBrand, //传递的组件对象
                        parent: this,//当前的vue对象
                    },
                    area:['300px','400px'],
                    title:"添加品牌信息"
                });
            },
            batchDel(){

            },
            del(index, id){

            },

        },
        mounted(){
            this.getListData();
        }
    }
</script>

<style>

</style>
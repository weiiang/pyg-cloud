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
    export default {
        data () {
            return {
                listQueryParams: {},
                //按钮权限控制变量
                isAdd: true,
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
                    }
                ],
            }
        },

        methods: {
            getListData(){
                this.list_loadding = true;
                this.$store.dispatch("manage_brandList",this.listQueryParams).then(res =>{
                    this.tableData = res.data;
                    console.log(res)
                }).catch(err =>{
                    this.$Message.error(err)
                })
                this.list_loadding = false;
            },
            setInitPage(pageSize){
                this.listQueryParams.size=pageSize;
                this.getListData();
            },
            pageSizeChange(){
                this.listQueryParams.current=pageIndex;
                this.getListData();
            },
            add(){

            },
            batchDel(){

            },

        },
        mounted(){
            this.getListData();
        }
    }
</script>

<style>

</style>
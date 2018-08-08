<template>
    <Table :columns="brandTableColums" :data="tableData" border></Table>
</template>

<script>
    export default {
        data () {
            return {
                tableData: [],
                brandTableColums: [
                    {type: 'selection',width: 60,align: 'center'},
                    // {title:"序号",width:65,align:"center",
                    //     render:(h,params)=>{
                    //         return h('div', (this.tableData.current-1)*this.tableData.size+params.index+1 );
                    //     }
                    // },
                    {
                        title: '编号',
                        key: 'id'
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

        },
        mounted(){
            this.$store.dispatch("manage_brandList").then(res =>{
                this.tableData = res.data;
                console.log(res)
            }).catch(err =>{
                this.$Message.error(err)
            })
        }
    }
</script>

<style>

</style>
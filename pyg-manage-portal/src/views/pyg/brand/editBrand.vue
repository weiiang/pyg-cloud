<template>
    <div class="animated fadeIn">
        <Form :model="formValidate" :label-width="80" inline>
            <Form-item label="首字母：">
                <Input v-model="formValidate.first_char" />
            </Form-item>

            <Form-item label="品牌名称：">
                <Input v-model="formValidate.name" />
            </Form-item>
        </Form>
        <div style="text-align: center">
            <Button type="primary" @click="handleSubmit('formValidate')" :loading="modal_loading">确定</Button>
            <Button type="ghost" @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
        </div>
    </div>
</template>

<script type="es6">
export default {
    props:{
        layerid:"",
        id:"",
    },
    data(){
        return {
            modal_loading:false,
            formValidate:{},
        }
    },

    methods:{
        handleSubmit(name){
            this.$store.dispatch("manage_editBrand",this.formValidate).then(res =>{
                alert(res);
                this.$layer.close(this.layerid)
                this.$parent.getListData();
            })
        }
    },
    mounted(){

    }
}
</script>

<style>

</style>
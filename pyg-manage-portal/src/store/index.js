import Vue from 'vue';
import Vuex from 'vuex';
import app from './modules/app';
import user from './modules/user';
import permission from './modules/permission';
import getters from './getters';


/*品优购后台*/
import brand from './modules/manage/brand'
import specification  from './modules/manage/specification'
import specificationOption from './modules/manage/specificationOption'

Vue.use(Vuex);

const store = new Vuex.Store({
  modules: {
    app,
    user,
    permission,

      brand,
      specification,
      specificationOption,
  },
  getters
});

export default store

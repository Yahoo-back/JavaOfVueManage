webpackJsonp([32],{"0S4O":function(e,t,a){var n=a("rCtH");"string"==typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);a("rjj0")("bfd4ec88",n,!0)},BC5B:function(e,t,a){"use strict";function n(e){a("J4lk"),a("0S4O")}Object.defineProperty(t,"__esModule",{value:!0});var r=a("Tz9z"),o=a("EMzT"),s=a("VU/8"),c=n,i=s(r.a,o.a,c,"data-v-0186e2e6",null);t.default=i.exports},EMzT:function(e,t,a){"use strict";var n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("el-card",{staticClass:"box-card"},[a("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[a("span",{staticClass:"title"},[e._v(e._s(1==this.$route.query.view?"客户详情":2==this.$route.query.view?"修改客户信息":""))]),e._v(" "),a("div",{staticClass:"operation"})]),e._v(" "),1==this.$route.query.view?[a("el-form",{attrs:{"label-width":"150px"}},[a("el-row",[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"手机号：",prop:"mobile"}},[e._v("\n              "+e._s(this.mobile)+"\n          \t")])],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"注册时间："}},[e._v("\n              "+e._s(this.time)+"\n          \t")])],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"职业："}},[e._v("\n              "+e._s(this.job)+"\n\t\t\t\t\t\t\t")])],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"芝麻分："}},[e._v("\n              "+e._s(this.zhima_score)+"\n              ")])],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"认证状态："}},[e._v("\n              "+e._s(this.mobile_auth)+"\n              ")])],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"银行卡号："}},[e._v("\n              "+e._s(this.bank_card)+"\n              ")])],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"银行卡开户行："}},[e._v("\n              "+e._s(this.bank_open)+"\n              ")])],1)],1),e._v(" "),a("el-row",[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"状态："}},[e._v("\n              "+e._s(this.status)+"\n\t\t\t\t\t\t\t")])],1)],1),e._v(" "),a("el-form-item",{attrs:{label:"身份证信息："}},[a("div",{staticClass:"demo-image"},e._l(e.attach,function(t,n){return a("div",[a("span",{staticClass:"demonstration"},[e._v(e._s("0"==t.type?"身份证人像":"1"==t.type?"身份证国徽面":"2"==t.type?"手持身份证":""))]),e._v(" "),a("el-image",{staticStyle:{width:"100px",height:"100px"},attrs:{src:t.path,fit:e.type}})],1)}))]),e._v(" "),a("div",{staticStyle:{float:"right","margin-top":"25px","margin-bottom":"20px"}},[a("el-button",{staticStyle:{float:"right","margin-bottom":"20px"},on:{click:e.reback}},[e._v("取消")])],1)],1)]:e._e(),e._v(" "),2==this.$route.query.view?[a("el-form",{ref:"form",attrs:{model:e.form,"label-width":"150px"}},[a("el-row",[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"姓名：",prop:"user_name"}},[a("el-input",{model:{value:e.form.user_name,callback:function(t){e.$set(e.form,"user_name",t)},expression:"form.user_name"}})],1)],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"身份证号：",prop:"id_card"}},[a("el-input",{model:{value:e.form.id_card,callback:function(t){e.$set(e.form,"id_card",t)},expression:"form.id_card"}})],1)],1)],1),e._v(" "),a("div",{staticStyle:{float:"right","margin-top":"25px","margin-bottom":"20px"}},[a("el-button",{attrs:{type:"primary"},on:{click:e.handleSubmit}},[e._v("保存")]),e._v(" "),a("el-button",{on:{click:e.reback}},[e._v("取消")])],1)],1)]:e._e()],2)},r=[],o={render:n,staticRenderFns:r};t.a=o},J4lk:function(e,t,a){var n=a("YxmT");"string"==typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);a("rjj0")("71c0ccec",n,!0)},Tz9z:function(e,t,a){"use strict";var n=a("mMlH");t.a={data:function(){return{user_name:"",id_card:"",time:"",mobile:"",create_time:"",sex:"",job:"",zhima_score:"",mobile_auth:"",bank_card:"",bank_open:"",status:"",attach:"",form:{user_name:"",id_card:"",mobile:"",create_time:"",sex:"",job:"",zhima_score:"",mobile_auth:"",bank_card:"",bank_open:"",status:"",attach:[]},customerInfo:"",imageUrl:"",activeNames:["1"],context:""}},methods:{dateFormat:function(e,t){var a=new Date(e.createTime).toJSON();return new Date(+new Date(a)+288e5).toISOString().replace(/T/g," ").replace(/\.[\d]{3}Z/,"")},handleQry:function(){var e=this,t=this.$route.query.view;1!=t&&2!=t||a.i(n.g)({id:this.$route.query.id}).then(function(t){if(200==t.data.code){e.customerInfo=t.data.data,e.create_time=e.customerInfo.create_time;var a=new Date(e.create_time).toJSON();e.time=new Date(+new Date(a)+288e5).toISOString().replace(/T/g," ").replace(/\.[\d]{3}Z/,""),e.sex=e.customerInfo.sex,e.mobile=e.customerInfo.mobile,e.job=e.customerInfo.job,e.zhima_score=e.customerInfo.zhima_score,e.mobile_auth=e.customerInfo.mobile_auth,e.bank_card=e.customerInfo.bank_card,e.bank_open=e.customerInfo.bank_open,e.status=e.customerInfo.status,e.user_name=e.customerInfo.user_name,e.id_card=e.customerInfo.id_card,e.attach=e.customerInfo.attach;e.attach;e.form.user_name=e.customerInfo.user_name,e.form.id_card=e.customerInfo.id_card}})},handleSubmit:function(e){var t=this,r=this.$route.query.id;console.log(r),this.$refs.form.validate(function(e){if(!e)return!1;a.i(n.h)({id:r,user_name:t.form.user_name,id_card:t.form.id_card}).then(function(e){if(200!=e.data.code)return t.$message.error(""+e.data.message),!1;t.$message.success(""+e.data.message),t.$router.push("/customer/list")}).catch(function(e){t.$message.error(""+e.message,"ERROR!")})})},reback:function(){this.$router.go(-1)},onSubmit:function(){console.log("submit!")},handleAvatarSuccess:function(e,t){this.imageUrl=URL.createObjectURL(t.raw)},beforeAvatarUpload:function(e){var t=e.size/1024/1024<2;return t||this.$message.error("上传头像图片大小不能超过 2MB!"),t}},created:function(){this.handleQry(this.$route.params.id)},mounted:function(){},watch:{$route:function(){this.handleQry(this.$route.params.id)}}}},YxmT:function(e,t,a){t=e.exports=a("FZ+f")(!0),t.push([e.i,"\n.title[data-v-0186e2e6]{\n    font-size:20px;\n}\n.operation[data-v-0186e2e6]{\n    float: right;\n}\n.avatar-uploader .el-upload[data-v-0186e2e6] {\n    border: 1px dashed #ccc;\n    border-radius: 6px;\n    cursor: pointer;\n    position: relative;\n    overflow: hidden;\n}\n.avatar-uploader .el-upload[data-v-0186e2e6]:hover {\n    border-color: #409EFF;\n}\n.avatar-uploader-icon[data-v-0186e2e6] {\n    font-size: 28px;\n    color: #8c939d;\n    width: 178px;\n    height: 178px;\n    line-height: 178px;\n    text-align: center;\n}\n.avatar[data-v-0186e2e6] {\n    width: 178px;\n    height: 178px;\n    display: block;\n}\n","",{version:3,sources:["E:/ROOT/src/view/customer/customerInfo.vue"],names:[],mappings:";AACA;IACI,eAAe;CAClB;AACD;IACI,aAAa;CAChB;AACD;IACI,wBAAwB;IACxB,mBAAmB;IACnB,gBAAgB;IAChB,mBAAmB;IACnB,iBAAiB;CACpB;AACD;IACI,sBAAsB;CACzB;AACD;IACI,gBAAgB;IAChB,eAAe;IACf,aAAa;IACb,cAAc;IACd,mBAAmB;IACnB,mBAAmB;CACtB;AACD;IACI,aAAa;IACb,cAAc;IACd,eAAe;CAClB",file:"customerInfo.vue",sourcesContent:["\n.title[data-v-0186e2e6]{\n    font-size:20px;\n}\n.operation[data-v-0186e2e6]{\n    float: right;\n}\n.avatar-uploader .el-upload[data-v-0186e2e6] {\n    border: 1px dashed #ccc;\n    border-radius: 6px;\n    cursor: pointer;\n    position: relative;\n    overflow: hidden;\n}\n.avatar-uploader .el-upload[data-v-0186e2e6]:hover {\n    border-color: #409EFF;\n}\n.avatar-uploader-icon[data-v-0186e2e6] {\n    font-size: 28px;\n    color: #8c939d;\n    width: 178px;\n    height: 178px;\n    line-height: 178px;\n    text-align: center;\n}\n.avatar[data-v-0186e2e6] {\n    width: 178px;\n    height: 178px;\n    display: block;\n}\n"],sourceRoot:""}])},mMlH:function(e,t,a){"use strict";function n(e){return a.i(_.a)({url:"/customer/qryCustomerList?pageSize="+e.pageSize+"&pageNum="+e.pageNum+"&mobile_cnd="+e.mobile_cnd+"&user_name_cnd="+e.user_name_cnd+"&id_card_cnd="+e.id_card_cnd+"&bank_card_cnd="+e.bank_card_cnd+"&user_auth_cnd="+e.user_auth_cnd+"&status_cnd="+e.status_cnd+"&source_cnd="+e.source_cnd+"&create_time_FROM_cnd="+e.create_time_FROM_cnd+"&create_time_TO_cnd="+e.create_time_TO_cnd+"&pay_time_FROM_cnd="+e.pay_time_FROM_cnd+"&pay_time_TO_cnd="+e.pay_time_TO_cnd,method:"get",data:e})}function r(e){return a.i(_.a)({url:"/customer/qryCustomerMoneyAllSys?pageSize="+e.pageSize+"&pageNum="+e.pageNum+"&name_cnd="+e.name_cnd,method:"post",data:e})}function o(e){return a.i(_.a)({url:"/dataSource/qrySourceAll",method:"get",data:e})}function s(e){return a.i(_.a)({url:"/customer/qryCustomerMoneyAll?pageSize="+e.pageSize+"&pageNum="+e.pageNum+"&mobile_cnd="+e.mobile_cnd+"&user_name_cnd="+e.user_name_cnd+"&id_card_cnd="+e.id_card_cnd+"&bank_card_cnd="+e.bank_card_cnd+"&user_auth_cnd="+e.user_auth_cnd+"&status_cnd="+e.status_cnd+"&source_cnd="+e.source_cnd+"&create_time_FROM_cnd="+e.create_time_FROM_cnd+"&create_time_TO_cnd="+e.create_time_TO_cnd+"&pay_time_FROM_cnd="+e.pay_time_FROM_cnd+"&pay_time_TO_cnd="+e.pay_time_TO_cnd,method:"post",data:e})}function c(e){return a.i(_.a)({url:"/customer/exportCustomerList?pageSize="+e.pageSize+"&pageNum="+e.pageNum+"&mobile_cnd="+e.mobile_cnd+"&user_name_cnd="+e.user_name_cnd+"&id_card_cnd="+e.id_card_cnd+"&bank_card_cnd="+e.bank_card_cnd+"&user_auth_cnd="+e.user_auth_cnd+"&status_cnd="+e.status_cnd+"&source_cnd="+e.source_cnd+"&create_time_FROM_cnd="+e.create_time_FROM_cnd+"&create_time_TO_cnd="+e.create_time_TO_cnd+"&pay_time_FROM_cnd="+e.pay_time_FROM_cnd+"&pay_time_TO_cnd="+e.pay_time_TO_cnd,method:"get",data:e})}function i(e){return a.i(_.a)({url:"/customer/updateProduct?id="+e.id+"&status="+e.status,method:"post",data:e})}function d(e){return a.i(_.a)({url:"/customer/qryCustomerById/"+e.id,method:"get",data:e})}function m(e){return a.i(_.a)({url:"/customer/updateCustomerById",method:"post",data:e})}t.d=n,t.a=r,t.c=o,t.e=s,t.b=c,t.f=i,t.g=d,t.h=m;var _=a("Vo7i")},rCtH:function(e,t,a){t=e.exports=a("FZ+f")(!0),t.push([e.i,"\n.el-collapse-item__header {\n  font-size: 15px;\n}\n.main .single-page-con {\n  background: #fff;\n}\n","",{version:3,sources:["E:/ROOT/src/view/customer/customerInfo.vue"],names:[],mappings:";AACA;EACE,gBAAgB;CACjB;AACD;EACE,iBAAiB;CAClB",file:"customerInfo.vue",sourcesContent:["\n.el-collapse-item__header {\n  font-size: 15px;\n}\n.main .single-page-con {\n  background: #fff;\n}\n"],sourceRoot:""}])}});
//# sourceMappingURL=32.91fb1bc5892a64d30fe8.js.map
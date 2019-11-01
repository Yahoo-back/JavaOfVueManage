webpackJsonp([6,45],{"5a6z":function(e,t,a){var r=a("96Yh");"string"==typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);a("rjj0")("87bbf0de",r,!0)},"8OoA":function(e,t,a){"use strict";function r(e){if(Array.isArray(e)){for(var t=0,a=Array(e.length);t<e.length;t++)a[t]=e[t];return a}return Array.from(e)}var o=a("uzBN");t.a={name:"ImageUpload",props:{value:String,dataType:{type:String,default:"json"},numLimit:{type:Number,default:5},sizeLimit:{type:Number,default:2097152},fileType:{type:Object,default:function(){return{extensions:"jpg,jpeg,png,gif",accept:"image/jpg,image/jpeg,image/png,image/gif"}}},token:""},watch:{value:function(){this.init()}},computed:{allowAdd:function(){return this.images.length<this.numLimit}},data:function(){return{images:[],uploading:!1}},mounted:function(){this.init()},methods:{init:function(){if(!this.value)return void(this.images=[]);if("json"==this.dataType)this.images=JSON.parse(this.value);else{for(var e=this.value.split(","),t=[],a=0;a<e.length;a++)t[a]={url:e[a]};this.images=t}},toleft:function(e){if(0!=e){var t=[].concat(r(this.images)),a=t[e];t[e]=t[e-1],t[e-1]=a,this.images=t,this.emitInput()}},deleteItem:function(e){for(var t=[],a=0;a<this.images.length;a++)e!=a&&t.push(this.images[a]);this.images=t,this.emitInput()},toright:function(e){if(e!=this.images.length-1){var t=[].concat(r(this.images)),a=t[e];t[e]=t[e+1],t[e+1]=a,this.images=t,this.emitInput()}},selectFile:function(){this.$refs.fileSelect.click()},uploadImage:function(){var e=this;e.uploading=!0,a.i(o.a)(this.$refs.fileSelect.files[0],{sizeLimit:this.sizeLimit,extensions:this.fileType.extensions,success:function(t){e.images.push({url:t}),e.uploading=!1,e.emitInput()},fail:function(t){e.$toast({title:t,type:"error"}),e.uploading=!1}}),this.$refs.fileSelect.value=""},emitInput:function(){if("json"==this.dataType)this.$emit("input",JSON.stringify(this.images));else{for(var e=[],t=0;t<this.images.length;t++)e[t]=this.images[t].url;this.$emit("input",e.join(","))}}}}},"96Yh":function(e,t,a){t=e.exports=a("FZ+f")(!0),t.push([e.i,"\n.title[data-v-68a20d26]{\n    font-size:20px;\n}\n.operation[data-v-68a20d26]{\n    float: right;\n}\n\n","",{version:3,sources:["E:/ROOT/src/view/product/productInfo.vue"],names:[],mappings:";AACA;IACI,eAAe;CAClB;AACD;IACI,aAAa;CAChB",file:"productInfo.vue",sourcesContent:["\n.title[data-v-68a20d26]{\n    font-size:20px;\n}\n.operation[data-v-68a20d26]{\n    float: right;\n}\n\n"],sourceRoot:""}])},Fu0i:function(e,t,a){var r=a("IpYf");"string"==typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);a("rjj0")("6081c5dc",r,!0)},I2BB:function(e,t,a){"use strict";var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("ul",{staticClass:"image-upload-view"},[e._l(e.images,function(t,r){return[a("li",{staticClass:"item"},[a("a",{attrs:{href:t.url,target:"_blank"}},[a("img",{attrs:{src:t.url}})]),e._v(" "),a("div",{staticClass:"item-btn"},[r>0?a("span",{staticClass:"left",on:{click:function(t){e.toleft(r)}}},[e._v("←")]):e._e(),a("span",{staticClass:"delete",on:{click:function(t){e.deleteItem(r)}}},[e._v("删除")]),r<e.images.length-1?a("span",{staticClass:"right",on:{click:function(t){e.toright(r)}}},[e._v("→")]):e._e()])])]}),e._v(" "),e.allowAdd?a("li",{staticClass:"item-add"},[e.uploading?a("div",{staticClass:"loading"}):a("a",{staticClass:"add",attrs:{href:"javascript:"},on:{click:e.selectFile}},[e._v("+")])]):e._e()],2),e._v(" "),a("div",{staticClass:"image-upload-file"},[a("input",{ref:"fileSelect",attrs:{type:"file",accept:e.fileType.accept},on:{change:e.uploadImage}})])])},o=[],i={render:r,staticRenderFns:o};t.a=i},IpYf:function(e,t,a){t=e.exports=a("FZ+f")(!0),t.push([e.i,"\n@keyframes rotateZ-data-v-d26f176e {\n0% {\n    transform: rotateZ(0);\n}\n100% {\n    transform: rotateZ(360deg);\n}\n}\n.image-upload-view[data-v-d26f176e] {\n  list-style: none;\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-pack: start;\n      justify-content: flex-start;\n  -ms-flex-wrap: wrap;\n      flex-wrap: wrap;\n}\n.image-upload-view li[data-v-d26f176e] {\n  width: 200px;\n  height: 200px;\n  margin-right: 22px;\n  margin-bottom: 10px;\n  border: 1px dashed #d9d9d9;\n  border-radius: 0;\n  display: block;\n  cursor: pointer;\n  position: relative;\n}\n.image-upload-view .item-add[data-v-d26f176e] {\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-pack: center;\n      justify-content: center;\n  -ms-flex-align: center;\n      align-items: center;\n}\n.image-upload-view .item-add .loading[data-v-d26f176e] {\n  width: 60px;\n  height: 60px;\n  border-bottom: 6px solid #ccc;\n  border-top: 6px solid #ccc;\n  border-left: 6px solid transparent;\n  border-right: 6px solid transparent;\n  border-radius: 100%;\n  animation: rotateZ-data-v-d26f176e 1s linear infinite;\n  /*animation-fill-mode: both;*/\n}\n.image-upload-view .item-add a[data-v-d26f176e] {\n  display: block;\n  width: 100%;\n  height: 100%;\n  line-height: 200px;\n  text-align: center;\n  font-size: 60px;\n  color: #ccc;\n  text-decoration: none;\n}\n.image-upload-view .item-add:hover a[data-v-d26f176e] {\n  color: #666;\n}\n.image-upload-view .item[data-v-d26f176e] {\n  overflow: hidden;\n}\n.image-upload-view .item img[data-v-d26f176e] {\n  width: 100%;\n  height: 100%;\n}\n.image-upload-view .item .item-btn[data-v-d26f176e] {\n  position: absolute;\n  left: 0;\n  bottom: -30px;\n  width: 100%;\n  height: 30px;\n  line-height: 30px;\n  text-align: center;\n  background: rgba(0, 0, 0, 0.5);\n  transition: .3s;\n  color: rgba(255, 255, 255, 0.6);\n}\n.image-upload-view .item .item-btn .left[data-v-d26f176e] {\n  position: absolute;\n  left: 10px;\n  top: 0px;\n}\n.image-upload-view .item .item-btn .right[data-v-d26f176e] {\n  position: absolute;\n  right: 10px;\n  top: 0px;\n}\n.image-upload-view .item:hover .item-btn[data-v-d26f176e] {\n  bottom: 0;\n}\n.image-upload-file[data-v-d26f176e] {\n  display: none;\n}\n","",{version:3,sources:["E:/ROOT/src/view/product/components/uploadImg.vue"],names:[],mappings:";AACA;AACA;IACI,sBAAsB;CACzB;AACD;IACI,2BAA2B;CAC9B;CACA;AACD;EACE,iBAAiB;EACjB,qBAAqB;EACrB,cAAc;EACd,qBAAqB;MACjB,4BAA4B;EAChC,oBAAoB;MAChB,gBAAgB;CACrB;AACD;EACE,aAAa;EACb,cAAc;EACd,mBAAmB;EACnB,oBAAoB;EACpB,2BAA2B;EAC3B,iBAAiB;EACjB,eAAe;EACf,gBAAgB;EAChB,mBAAmB;CACpB;AACD;EACE,qBAAqB;EACrB,cAAc;EACd,sBAAsB;MAClB,wBAAwB;EAC5B,uBAAuB;MACnB,oBAAoB;CACzB;AACD;EACE,YAAY;EACZ,aAAa;EACb,8BAA8B;EAC9B,2BAA2B;EAC3B,mCAAmC;EACnC,oCAAoC;EACpC,oBAAoB;EACpB,sDAAsD;EACtD,8BAA8B;CAC/B;AACD;EACE,eAAe;EACf,YAAY;EACZ,aAAa;EACb,mBAAmB;EACnB,mBAAmB;EACnB,gBAAgB;EAChB,YAAY;EACZ,sBAAsB;CACvB;AACD;EACE,YAAY;CACb;AACD;EACE,iBAAiB;CAClB;AACD;EACE,YAAY;EACZ,aAAa;CACd;AACD;EACE,mBAAmB;EACnB,QAAQ;EACR,cAAc;EACd,YAAY;EACZ,aAAa;EACb,kBAAkB;EAClB,mBAAmB;EACnB,+BAA+B;EAC/B,gBAAgB;EAChB,gCAAgC;CACjC;AACD;EACE,mBAAmB;EACnB,WAAW;EACX,SAAS;CACV;AACD;EACE,mBAAmB;EACnB,YAAY;EACZ,SAAS;CACV;AACD;EACE,UAAU;CACX;AACD;EACE,cAAc;CACf",file:"uploadImg.vue",sourcesContent:["\n@keyframes rotateZ-data-v-d26f176e {\n0% {\n    transform: rotateZ(0);\n}\n100% {\n    transform: rotateZ(360deg);\n}\n}\n.image-upload-view[data-v-d26f176e] {\n  list-style: none;\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-pack: start;\n      justify-content: flex-start;\n  -ms-flex-wrap: wrap;\n      flex-wrap: wrap;\n}\n.image-upload-view li[data-v-d26f176e] {\n  width: 200px;\n  height: 200px;\n  margin-right: 22px;\n  margin-bottom: 10px;\n  border: 1px dashed #d9d9d9;\n  border-radius: 0;\n  display: block;\n  cursor: pointer;\n  position: relative;\n}\n.image-upload-view .item-add[data-v-d26f176e] {\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-pack: center;\n      justify-content: center;\n  -ms-flex-align: center;\n      align-items: center;\n}\n.image-upload-view .item-add .loading[data-v-d26f176e] {\n  width: 60px;\n  height: 60px;\n  border-bottom: 6px solid #ccc;\n  border-top: 6px solid #ccc;\n  border-left: 6px solid transparent;\n  border-right: 6px solid transparent;\n  border-radius: 100%;\n  animation: rotateZ-data-v-d26f176e 1s linear infinite;\n  /*animation-fill-mode: both;*/\n}\n.image-upload-view .item-add a[data-v-d26f176e] {\n  display: block;\n  width: 100%;\n  height: 100%;\n  line-height: 200px;\n  text-align: center;\n  font-size: 60px;\n  color: #ccc;\n  text-decoration: none;\n}\n.image-upload-view .item-add:hover a[data-v-d26f176e] {\n  color: #666;\n}\n.image-upload-view .item[data-v-d26f176e] {\n  overflow: hidden;\n}\n.image-upload-view .item img[data-v-d26f176e] {\n  width: 100%;\n  height: 100%;\n}\n.image-upload-view .item .item-btn[data-v-d26f176e] {\n  position: absolute;\n  left: 0;\n  bottom: -30px;\n  width: 100%;\n  height: 30px;\n  line-height: 30px;\n  text-align: center;\n  background: rgba(0, 0, 0, 0.5);\n  transition: .3s;\n  color: rgba(255, 255, 255, 0.6);\n}\n.image-upload-view .item .item-btn .left[data-v-d26f176e] {\n  position: absolute;\n  left: 10px;\n  top: 0px;\n}\n.image-upload-view .item .item-btn .right[data-v-d26f176e] {\n  position: absolute;\n  right: 10px;\n  top: 0px;\n}\n.image-upload-view .item:hover .item-btn[data-v-d26f176e] {\n  bottom: 0;\n}\n.image-upload-file[data-v-d26f176e] {\n  display: none;\n}\n"],sourceRoot:""}])},TIYx:function(e,t,a){"use strict";function r(e){return a.i(y.a)({url:"/product/qryProductList?pageSize="+e.pageSize+"&pageNum="+e.pageNum+"&name_cnd="+e.name_cnd+"&is_hot_cnd="+e.is_hot_cnd+"&classify_cnd="+e.classify_cnd+"&position_cnd="+e.position_cnd+"&status_cnd="+e.status_cnd+"&create_time_FROM_cnd="+e.create_time_FROM_cnd+"&create_time_TO_cnd="+e.create_time_TO_cnd,method:"get",data:e})}function o(e){return a.i(y.a)({url:"/product/qryProductClassifyAll",method:"get",data:e})}function i(e){return a.i(y.a)({url:"/dictConfig/qryDictByDataType?data_type="+e.data_type,method:"get",data:e})}function n(e){return a.i(y.a)({url:"/product/exportProductList?pageSize="+e.pageSize+"&pageNum="+e.pageNum+"&name_cnd="+e.name_cnd+"&is_hot_cnd="+e.is_hot_cnd+"&classify_cnd="+e.classify_cnd+"&position_cnd="+e.position_cnd+"&status_cnd="+e.status_cnd+"&create_time_FROM_cnd="+e.create_time_FROM_cnd+"&create_time_TO_cnd="+e.create_time_TO_cnd,method:"get",data:e})}function s(e){return a.i(y.a)({url:"/product/topPosition?id="+e.id,method:"post",data:e})}function l(e){return a.i(y.a)({url:"/product/cancelPosition?id="+e.id,method:"post",data:e})}function c(e){return a.i(y.a)({url:"/product/basePosition?id="+e.id,method:"post",data:e})}function m(e){return a.i(y.a)({url:"/product/updateProduct?id="+e.id+"&status="+e.status,method:"post",data:e})}function d(e){return a.i(y.a)({url:"/product/qryProductById/"+e.id,method:"get",data:e})}function u(e){return a.i(y.a)({url:"/product/saveProduct",method:"post",data:e})}function f(e){return a.i(y.a)({url:"/main/upload",credentials:"include",method:"post",data:e})}function p(e){return a.i(y.a)({url:"/productVisitManage/qryProductVisitManageList?pageSize="+e.pageSize+"&pageNum="+e.pageNum+"&name_cnd="+e.name_cnd+"&create_time_FROM_cnd="+e.create_time_FROM_cnd+"&create_time_TO_cnd="+e.create_time_TO_cnd,method:"get",data:e})}function g(e){return a.i(y.a)({url:"/productVisitManage/updateProductVisitManage?id="+e.id+"&status="+e.status,method:"post",data:e})}function h(e){return a.i(y.a)({url:"/productVisitManage/saveProductVisitManage",method:"post",data:e})}function v(e){return a.i(y.a)({url:"/productVisitManage/qryVisitProductListAll",method:"get",data:e})}function A(e){return a.i(y.a)({url:"/productVisitManage/qryProductVisitCount/"+e.id,method:"get",data:e})}t.k=r,t.g=o,t.h=i,t.p=n,t.m=s,t.o=l,t.n=c,t.l=m,t.f=d,t.j=u,t.i=f,t.a=p,t.b=g,t.e=h,t.c=v,t.d=A;var y=a("Vo7i")},W3pr:function(e,t,a){t=e.exports=a("FZ+f")(!0),t.push([e.i,"\n.avatar-uploader .el-upload {\n  border: 1px dashed #d9d9d9;\n  border-radius: 6px;\n  cursor: pointer;\n  position: relative;\n  overflow: hidden;\n}\n.avatar-uploader .el-upload:hover {\n  border-color: #409EFF;\n}\n.avatar-uploader-icon {\n  font-size: 28px;\n  color: #8c939d;\n  width: 178px;\n  height: 178px;\n  line-height: 178px;\n  text-align: center;\n}\n.avatar {\n  width: 178px;\n  height: 178px;\n  display: block;\n}\n.el-collapse-item__header {\n  font-size: 15px;\n}\n.main .single-page-con {\n  background: #fff;\n}\n","",{version:3,sources:["E:/ROOT/src/view/product/productInfo.vue"],names:[],mappings:";AACA;EACE,2BAA2B;EAC3B,mBAAmB;EACnB,gBAAgB;EAChB,mBAAmB;EACnB,iBAAiB;CAClB;AACD;EACE,sBAAsB;CACvB;AACD;EACE,gBAAgB;EAChB,eAAe;EACf,aAAa;EACb,cAAc;EACd,mBAAmB;EACnB,mBAAmB;CACpB;AACD;EACE,aAAa;EACb,cAAc;EACd,eAAe;CAChB;AACD;EACE,gBAAgB;CACjB;AACD;EACE,iBAAiB;CAClB",file:"productInfo.vue",sourcesContent:["\n.avatar-uploader .el-upload {\n  border: 1px dashed #d9d9d9;\n  border-radius: 6px;\n  cursor: pointer;\n  position: relative;\n  overflow: hidden;\n}\n.avatar-uploader .el-upload:hover {\n  border-color: #409EFF;\n}\n.avatar-uploader-icon {\n  font-size: 28px;\n  color: #8c939d;\n  width: 178px;\n  height: 178px;\n  line-height: 178px;\n  text-align: center;\n}\n.avatar {\n  width: 178px;\n  height: 178px;\n  display: block;\n}\n.el-collapse-item__header {\n  font-size: 15px;\n}\n.main .single-page-con {\n  background: #fff;\n}\n"],sourceRoot:""}])},euW8:function(e,t,a){"use strict";function r(e){a("Fu0i")}Object.defineProperty(t,"__esModule",{value:!0});var o=a("8OoA"),i=a("I2BB"),n=a("VU/8"),s=r,l=n(o.a,i.a,s,"data-v-d26f176e",null);t.default=l.exports},jc5f:function(e,t,a){"use strict";var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("el-card",{staticClass:"box-card"},[a("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[a("span",{staticClass:"title"},[e._v(e._s(1==this.$route.query.view?"查看商品":2==this.$route.query.view?"编辑商品":3==this.$route.query.view?"新增商品":""))])]),e._v(" "),a("el-form",{ref:"form",attrs:{model:e.form,rules:e.rules,"label-width":"180px"}},[a("el-form-item",{attrs:{label:"商品名称：",prop:"name"}},[a("el-col",{attrs:{span:8}},[1==this.$route.query.view?[e._v(e._s(this.form.name))]:(this.$route.query.view,a("el-input",{model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}}))],2)],1),e._v(" "),1==this.$route.query.view?a("el-form-item",{attrs:{label:"logo：",prop:"logo"}},[a("img",{staticClass:"avatar",attrs:{src:e.logo}})]):a("el-form-item",{attrs:{label:"logo：",prop:"logo"}},[a("image-upload",{attrs:{"data-type":"string","num-limit":1,"size-limit":2097152},model:{value:e.form.logo,callback:function(t){e.$set(e.form,"logo",t)},expression:"form.logo"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"分类：",prop:"classifyId"}},[1==this.$route.query.view?[e._v(e._s(this.form.classifyId))]:(this.$route.query.view,a("el-select",{attrs:{placeholder:"请选择"},nativeOn:{click:function(t){e.qryClassify(t)}},model:{value:e.form.classifyId,callback:function(t){e.$set(e.form,"classifyId",t)},expression:"form.classifyId"}},[a("el-option",{attrs:{value:""}},[e._v("请选择")]),e._v(" "),e._l(e.classify,function(t){return a("el-option",{key:t.name,attrs:{label:t.name,value:t.id}},[e._v(e._s(t.name))])})],2))],2),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"利息：",prop:"interest"}},[1==this.$route.query.view?[e._v(e._s(this.form.interest)+"%")]:(this.$route.query.view,a("el-input",{attrs:{placeholder:"请输入小数或者整数"},model:{value:e.form.interest,callback:function(t){e.$set(e.form,"interest",t)},expression:"form.interest"}},[a("template",{attrs:{slot:"append"},slot:"append"},[e._v("%")])],2))],2)],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:10,lg:12,xl:12}},[a("el-form-item",{attrs:{label:"可授信额度：",prop:"money"}},[1==this.$route.query.view?[e._v(e._s(this.form.money))]:(this.$route.query.view,a("el-select",{attrs:{placeholder:"请选择"},nativeOn:{click:function(t){e.qryMoney(t)}},model:{value:e.form.money,callback:function(t){e.$set(e.form,"money",t)},expression:"form.money"}},[a("el-option",{attrs:{value:""}},[e._v("请选择")]),e._v(" "),e._l(e.money,function(t){return a("el-option",{key:t.itemKey,attrs:{value:"item.itemValue",label:t.itemValue,value:t.id}},[e._v(e._s(t.itemValue))])})],2))],2)],1)],1),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"分期方式：",prop:"perioWay"}},[1==this.$route.query.view?a("el-radio-group",{model:{value:e.form.perioWay,callback:function(t){e.$set(e.form,"perioWay",t)},expression:"form.perioWay"}},[a("el-radio",{attrs:{label:0,disabled:""}},[e._v("按天")]),e._v(" "),a("el-radio",{attrs:{label:1,disabled:""}},[e._v("按月")])],1):(this.$route.query.view,a("el-radio-group",{model:{value:e.form.perioWay,callback:function(t){e.$set(e.form,"perioWay",t)},expression:"form.perioWay"}},[a("el-radio",{attrs:{label:0}},[e._v("按天")]),e._v(" "),a("el-radio",{attrs:{label:1}},[e._v("按月")])],1))],1)],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:8,xl:12}},[a("el-form-item",{attrs:{label:"可分期期数：",prop:"periodization"}},[1==this.$route.query.view?[e._v(e._s(this.form.periodization)+"天/月")]:(this.$route.query.view,a("el-input",{model:{value:e.form.periodization,callback:function(t){e.$set(e.form,"periodization",t)},expression:"form.periodization"}},[a("template",{attrs:{slot:"append"},slot:"append"},[e._v("天/月（多个请用逗号隔开）")])],2))],2)],1)],1),e._v(" "),a("el-form-item",{attrs:{label:"链接：",prop:"link"}},[a("el-col",{attrs:{span:8}},[1==this.$route.query.view?[e._v(e._s(this.form.link))]:(this.$route.query.view,a("el-input",{model:{value:e.form.link,callback:function(t){e.$set(e.form,"link",t)},expression:"form.link"}}))],2)],1),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:2,sm:2,md:2,lg:2,xl:2}},[a("el-form-item",{attrs:{label:"结算方式：",prop:"settle_cpa"}},[1==this.$route.query.view?a("el-checkbox",{attrs:{label:0,disabled:""},model:{value:e.form.settle_cpa,callback:function(t){e.$set(e.form,"settle_cpa",t)},expression:"form.settle_cpa"}},[e._v("CPA")]):(this.$route.query.view,a("el-checkbox",{attrs:{label:0},model:{value:e.form.settle_cpa,callback:function(t){e.$set(e.form,"settle_cpa",t)},expression:"form.settle_cpa"}},[e._v("CPA")]))],1)],1),e._v(" "),a("el-col",{attrs:{xs:5,sm:5,md:5,lg:5,xl:5}},[a("el-form-item",{attrs:{prop:"settleWayCpa"}},[1==this.$route.query.view?[e._v(e._s(this.form.settleWayCpa))]:(this.$route.query.view,a("el-input",{model:{value:e.form.settleWayCpa,callback:function(t){e.$set(e.form,"settleWayCpa",t)},expression:"form.settleWayCpa"}}))],2)],1)],1),e._v(" "),a("el-form-item",{attrs:{label:"结算周期：",prop:"settleCycle"}},[a("el-col",{attrs:{span:8}},[1==this.$route.query.view?[e._v(e._s(this.form.settleCycle))]:(this.$route.query.view,a("el-input",{attrs:{placeholder:"请填写结算周期，如日结、周结、每周五结算等"},model:{value:e.form.settleCycle,callback:function(t){e.$set(e.form,"settleCycle",t)},expression:"form.settleCycle"}}))],2)],1),e._v(" "),1==this.$route.query.view?a("el-form-item",{attrs:{label:"申请条件：",prop:"requires"}},[a("el-checkbox-group",{model:{value:e.form.requires,callback:function(t){e.$set(e.form,"requires",t)},expression:"form.requires"}},e._l(e.apply_require,function(t){return a("el-checkbox",{key:t.id,attrs:{label:t.id,disabled:""}},[e._v(e._s(t.itemValue))])}))],1):2==this.$route.query.view?a("el-form-item",{attrs:{label:"申请条件：",prop:"requires"}},[a("el-checkbox-group",{model:{value:e.form.requires,callback:function(t){e.$set(e.form,"requires",t)},expression:"form.requires"}},e._l(e.apply_require,function(t){return a("el-checkbox",{key:t.id,attrs:{label:t.id}},[e._v(e._s(t.itemValue))])}))],1):a("el-form-item",{attrs:{label:"申请条件：",prop:"requiress"}},[a("el-checkbox-group",{model:{value:e.form.requiress,callback:function(t){e.$set(e.form,"requiress",t)},expression:"form.requiress"}},e._l(e.apply_require,function(t){return a("el-checkbox",{key:t.id,attrs:{label:t.id},on:{change:function(a){e.changeCheckr(t)}}},[e._v(e._s(t.itemValue))])}))],1),e._v(" "),1==this.$route.query.view?a("el-form-item",{attrs:{label:"申请资料：",prop:"datas"}},[a("el-checkbox-group",{model:{value:e.form.datas,callback:function(t){e.$set(e.form,"datas",t)},expression:"form.datas"}},e._l(e.apply_data,function(t){return a("el-checkbox",{key:t.id,attrs:{label:t.id,disabled:""}},[e._v(e._s(t.itemValue))])}))],1):2==this.$route.query.view?a("el-form-item",{attrs:{label:"申请资料：",prop:"datas"}},[a("el-checkbox-group",{model:{value:e.form.datas,callback:function(t){e.$set(e.form,"datas",t)},expression:"form.datas"}},e._l(e.apply_data,function(t){return a("el-checkbox",{key:t.id,attrs:{label:t.id}},[e._v(e._s(t.itemValue))])}))],1):a("el-form-item",{attrs:{label:"申请资料：",prop:"datass"}},[a("el-checkbox-group",{model:{value:e.form.datass,callback:function(t){e.$set(e.form,"datass",t)},expression:"form.datass"}},e._l(e.apply_data,function(t){return a("el-checkbox",{key:t.id,attrs:{label:t.id},on:{change:function(a){e.changeCheckd(t)}}},[e._v(e._s(t.itemValue))])}))],1),e._v(" "),a("el-form-item",{attrs:{label:"费用说明："}},[a("el-col",{attrs:{span:8}},[1==this.$route.query.view?[e._v(e._s(this.form.ktxDesc))]:(this.$route.query.view,a("el-input",{model:{value:e.form.ktxDesc,callback:function(t){e.$set(e.form,"ktxDesc",t)},expression:"form.ktxDesc"}}))],2)],1),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"状态：",prop:"status"}},[1==this.$route.query.view?[e._v(e._s(this.form.status))]:(this.$route.query.view,a("el-select",{attrs:{placeholder:"请选择"},model:{value:e.form.status,callback:function(t){e.$set(e.form,"status",t)},expression:"form.status"}},[a("el-option",{attrs:{label:"上架",value:"1"}}),e._v(" "),a("el-option",{attrs:{label:"下架",value:"0"}})],1))],2)],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"排序：",prop:"sort"}},[1==this.$route.query.view?[e._v(e._s(this.form.sort))]:(this.$route.query.view,a("el-input",{model:{value:e.form.sort,callback:function(t){e.$set(e.form,"sort",t)},expression:"form.sort"}}))],2)],1)],1),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"首页热门：",prop:"isHot"}},[1==this.$route.query.view?[e._v(e._s(this.form.isHot))]:(this.$route.query.view,a("el-select",{attrs:{placeholder:"请选择"},model:{value:e.form.isHot,callback:function(t){e.$set(e.form,"isHot",t)},expression:"form.isHot"}},[a("el-option",{attrs:{label:"是",value:"1"}}),e._v(" "),a("el-option",{attrs:{label:"否",value:"0"}})],1))],2)],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"热门排序："}},[1==this.$route.query.view?[e._v(e._s(this.form.hotSort))]:(this.$route.query.view,a("el-input",{model:{value:e.form.hotSort,callback:function(t){e.$set(e.form,"hotSort",t)},expression:"form.hotSort"}}))],2)],1)],1),e._v(" "),a("el-form-item",{attrs:{label:"后台链接："}},[a("el-col",{attrs:{span:8}},[1==this.$route.query.view?[e._v(e._s(this.form.managerUrl))]:(this.$route.query.view,a("el-input",{model:{value:e.form.managerUrl,callback:function(t){e.$set(e.form,"managerUrl",t)},expression:"form.managerUrl"}}))],2)],1),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"后台登陆用户名："}},[1==this.$route.query.view?[e._v(e._s(this.form.managerUser))]:(this.$route.query.view,a("el-input",{model:{value:e.form.managerUser,callback:function(t){e.$set(e.form,"managerUser",t)},expression:"form.managerUser"}}))],2)],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"后台登陆用户密码："}},[1==this.$route.query.view?[e._v(e._s(this.form.managerPassword))]:(this.$route.query.view,a("el-input",{model:{value:e.form.managerPassword,callback:function(t){e.$set(e.form,"managerPassword",t)},expression:"form.managerPassword"}}))],2)],1)],1),e._v(" "),a("el-form-item",{attrs:{label:"所属公司：",prop:"company"}},[a("el-col",{attrs:{span:8}},[1==this.$route.query.view?[e._v(e._s(this.form.company))]:(this.$route.query.view,a("el-input",{model:{value:e.form.company,callback:function(t){e.$set(e.form,"company",t)},expression:"form.company"}}))],2)],1),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"产品联系人："}},[1==this.$route.query.view?[e._v(e._s(this.form.contact))]:(this.$route.query.view,a("el-input",{model:{value:e.form.contact,callback:function(t){e.$set(e.form,"contact",t)},expression:"form.contact"}}))],2)],1),e._v(" "),a("el-col",{attrs:{xs:4,sm:6,md:8,lg:6,xl:12}},[a("el-form-item",{attrs:{label:"产品联系人联系方式："}},[1==this.$route.query.view?[e._v(e._s(this.form.contactInfo))]:(this.$route.query.view,a("el-input",{model:{value:e.form.contactInfo,callback:function(t){e.$set(e.form,"contactInfo",t)},expression:"form.contactInfo"}}))],2)],1)],1),e._v(" "),a("el-row",{attrs:{gutter:24}},[a("el-col",{attrs:{xs:8,sm:12,md:12,lg:12,xl:12}},[a("el-form-item",{attrs:{label:"商品描述（申请攻略）:",prop:"description"}},[1==this.$route.query.view?[e._v(e._s(this.form.description))]:(this.$route.query.view,a("el-input",{attrs:{minlength:"3",maxlength:"15","show-word-limit":""},model:{value:e.form.description,callback:function(t){e.$set(e.form,"description",t)},expression:"form.description"}}))],2)],1)],1)],1),e._v(" "),a("div",{staticStyle:{float:"right","margin-top":"25px","margin-bottom":"20px"}},[2==this.$route.query.view?a("el-button",{attrs:{type:"primary"},on:{click:e.handleSubmit}},[e._v("保存")]):3==this.$route.query.view?a("el-button",{attrs:{type:"primary"},on:{click:e.handleSubmitAdd}},[e._v("保存")]):e._e(),e._v(" "),a("el-button",{on:{click:e.reback}},[e._v("取消")])],1)],1)},o=[],i={render:r,staticRenderFns:o};t.a=i},o3lf:function(e,t,a){"use strict";function r(e){a("5a6z"),a("pWMf")}Object.defineProperty(t,"__esModule",{value:!0});var o=a("suIw"),i=a("jc5f"),n=a("VU/8"),s=r,l=n(o.a,i.a,s,"data-v-68a20d26",null);t.default=l.exports},pWMf:function(e,t,a){var r=a("W3pr");"string"==typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);a("rjj0")("4d32afc6",r,!0)},suIw:function(e,t,a){"use strict";function r(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}var o=a("euW8"),i=a("TIYx");t.a={components:{ImageUpload:o.default},data:function(){var e;return e={dialogVisible:!1,fileList:[],param:{},classify:[],money:[],requires:[],requiress:[],datas:[],datass:[],apply_require:[],apply_data:[],name:"",logo:"",classifyId:"",interest:""},r(e,"money",""),r(e,"perioWay",""),r(e,"periodization",""),r(e,"link",""),r(e,"settle_cpa",""),r(e,"settleWayCpa",""),r(e,"settleCycle",""),r(e,"conditionList",""),r(e,"dataList",""),r(e,"ktxDesc",""),r(e,"status",""),r(e,"sort",""),r(e,"isHot",""),r(e,"hotSort",""),r(e,"managerUrl",""),r(e,"managerUser",""),r(e,"managerPassword",""),r(e,"company",""),r(e,"contact",""),r(e,"contactInfo",""),r(e,"description",""),r(e,"form",{name:"",logo:"",classifyId:"",interest:"",money:"",perioWay:"",periodization:"",link:"",settle_cpa:"",settleWayCpa:"",settleCycle:"",conditionList:"",dataList:"",ktxDesc:"",status:"",sort:"",isHot:"",hotSort:"",managerUrl:"",managerUser:"",managerPassword:"",company:"",contact:"",contactInfo:"",description:"",requires:[],requiress:[],datas:[],datass:[]}),r(e,"rules",{name:[{required:!0,message:"请输入商品名称",trigger:"blur"}],logo:[{required:!0,message:"最多上传一张logo",trigger:"blur"}],classifyId:[{required:!0,message:"请选择分类",trigger:"change"}],interest:[{required:!0,message:"请输入利息",trigger:"blur"}],money:[{required:!0,message:"请选择可授信额度",trigger:"change"}],perioWay:[{required:!0,message:"请选择分期方式",trigger:"change"}],periodization:[{required:!0,message:"请输入可分期期数",trigger:"blur"}],link:[{required:!0,message:"请输入链接",trigger:"blur"}],settle_cpa:[{required:!0,message:"*",trigger:"change"}],settleWayCpa:[{required:!0,message:"请输入结算金额",trigger:"blur"}],settleCycle:[{required:!0,message:"请输入结算周期",trigger:"blur"}],requires:[{required:!0,message:"请选择申请条件",trigger:"blur"}],requiress:[{required:!0,message:"请选择申请条件",trigger:"blur"}],datas:[{required:!0,message:"请选择申请材料",trigger:"blur"}],datass:[{required:!0,message:"请选择申请材料",trigger:"blur"}],conditionList:[{type:"array",required:!0,message:"请选择申请条件",trigger:"blur"}],dataList:[{type:"array",required:!0,message:"请选择申请材料",trigger:"blur"}],status:[{required:!0,message:"请选择状态",trigger:"change"}],sort:[{required:!0,message:"请输入排序",trigger:"blur"}],isHot:[{required:!0,message:"请选择热门状态",trigger:"change"}],company:[{required:!0,message:"请输入公司名称",trigger:"change"}],description:[{required:!0,message:"请输入商品描述",trigger:"blur"},{min:3,max:5,message:"长度在 3 到 15 个字符",trigger:"blur"}]}),r(e,"title",""),r(e,"view",this.$route.query.view),r(e,"productInfo",""),r(e,"imageUrl",""),r(e,"activeNames",["1"]),e},methods:{changeCheckr:function(e){},changeCheckd:function(e){},handleQry:function(){var e=this,t=this.$route.query.view;1==t||2==t?a.i(i.f)({id:this.$route.query.id}).then(function(t){if(200==t.data.code){e.productInfo=t.data.data,e.form.name=e.productInfo.name,e.form.logo=e.productInfo.logo,e.form.classifyId=1==e.productInfo.classifyId?"现金贷":2==e.productInfo.classifyId?"借条":"",e.form.money="572"==e.productInfo.money?"500-2000":"573"==e.productInfo.money?"2000-5000":"574"==e.productInfo.money?"5000-8000":"577"==e.productInfo.money?"8000-10000":"578"==e.productInfo.money?"10000-20000":"",e.form.interest=e.productInfo.interest;var a=parseInt(e.productInfo.perioWay);e.perioWay=a,e.form.perioWay=a,e.form.periodization=e.productInfo.periodization,e.form.link=e.productInfo.link,e.form.settleWayCpa=e.productInfo.settleWayCpa,e.form.settle_cpa=e.form.settleWayCpa.length>0,e.form.settleCycle=e.productInfo.settleCycle,e.form.status="0"==e.productInfo.status?"下架":"1"==e.productInfo.status?"上架":"",e.form.sort=e.productInfo.sort,e.form.isHot="0"==e.productInfo.isHot?"否":"1"==e.productInfo.isHot?"是":"";var r=[],o=e.productInfo.conditionList;r=o.split(",");for(var i=[],n=0;n<r.length;n++){i.push(r[n]);for(var s=[],l=0;l<i.length;l++){i[l]=i[l].replace('"',"");var c=Number(i[l]);s.push(c),e.form.requires=s}}var m=[],o=e.productInfo.dataList;m=o.split(",");for(var i=[],d=0;d<m.length;d++){i.push(m[d]);for(var u=[],f=0;f<i.length;f++){i[f]=i[f].replace('"',"");var c=Number(i[f]);u.push(c),e.form.datas=u}}e.form.conditionList=e.productInfo.conditionList,e.form.dataList=e.productInfo.dataList,e.form.hotSort=e.productInfo.hotSort,e.form.managerUrl=e.productInfo.managerUrl,e.form.managerUser=e.productInfo.managerUser,e.form.managerPassword=e.productInfo.managerPassword,e.form.company=e.productInfo.company,e.form.contact=e.productInfo.contact,e.form.contactInfo=e.productInfo.contactInfo,e.form.description=e.productInfo.description,e.classifyId=e.productInfo.classifyId}}):(this.form.name="",this.form.logo="",this.form.classifyId="",this.form.interest="",this.form.perioWay="",this.form.periodization="",this.form.link="",this.form.settleWayCpa="",this.form.settleCycle="",this.form.status="",this.form.sort="",this.form.isHot="",this.form.hotSort="",this.form.conditionList="",this.form.dataList="",this.form.managerUrl="",this.form.managerUser="",this.form.managerPassword="",this.form.company="",this.form.contact="",this.form.contactInfo="",this.form.description="",this.form.money="",this.form.settle_cpa=!1)},qryClassify:function(){var e=this;a.i(i.g)({}).then(function(t){200==t.data.code&&(e.classify=t.data.data)})},qryMoney:function(){var e=this;a.i(i.h)({data_type:"PRICE_INTERVAL"}).then(function(t){200==t.data.code&&(e.money=t.data.data)})},getApplyRequire:function(){var e=this;a.i(i.h)({data_type:"APPLY_REQUIRE"}).then(function(t){200==t.data.code&&(e.apply_require=t.data.data)})},getApplyData:function(){var e=this;a.i(i.h)({data_type:"APPLY_DATA"}).then(function(t){200==t.data.code&&(e.apply_data=t.data.data)})},uploadImg:function(e){var t=this,r=new FormData;r.append("file",e.file),a.i(i.i)(r).then(function(e){if(200!=e.data.code)return t.$message.error(""+e.data.message),!1;t.$message.success(""+e.data.message),t.logo=e.data.data.picPath,t.logo=(t.logo.indexOf("http://"),t.logo)}).catch(function(e){console.log(e,"error")})},handleAvatarSuccess:function(e,t){this.logo=URL.createObjectURL(t.raw)},beforeAvatarUpload:function(e){},handlePictureCardPreview:function(e){this.logo=e.url,this.dialogVisible=!0},handlePreview:function(e){},handleRemove:function(e,t){},handleChange:function(e){},changeData:function(e,t){this.contentHtml=t},reback:function(){this.$router.go(-1)},handleSubmit:function(){var e=this;this.handleQry(this.form);JSON.parse(JSON.stringify(this.requires)),JSON.parse(JSON.stringify(this.datas));this.$refs.form.validate(function(t){if(!t)return!1;var r=JSON.parse(JSON.stringify(e.form.requires)),o=JSON.parse(JSON.stringify(e.form.datas)),n=[],s=[];n=r.join(","),s=o.join(","),a.i(i.j)({name:e.form.name,logo:e.form.logo,classifyId:"现金贷"==e.form.classifyId?"1":"借条"==e.form.classifyId?"0":"",interest:e.form.interest,money:e.form.money,perioWay:e.form.perioWay,periodization:e.form.periodization,link:e.form.link,settle_cpa:1==e.form.settle_cpa?"0":"",settleWayCpa:e.settleWayCpa,settleCycle:e.settleCycle,conditionList:n,dataList:s,ktxDesc:e.form.ktxDesc,status:"下架"==e.form.status?"0":"上架"==e.form.status?"1":"",sort:e.form.sort,isHot:"否"==e.form.isHot?"0":"是"==e.form.isHot?"1":"",hotSort:e.form.hotSort,managerUrl:e.form.managerUrl,managerUser:e.form.managerUser,managerPassword:e.form.managerPassword,company:e.form.company,contact:e.form.contact,contactInfo:e.form.contactInfo,description:e.form.description,id:e.$route.query.id}).then(function(t){if(200!=t.data.code)return e.$message.error(""+t.data.message),!1;e.$message.success(""+t.data.message)}).catch(function(t){e.$message.error(""+t.message,"ERROR!")})})},handleSubmitAdd:function(){var e=this;this.$refs.form.validate(function(t){if(!t)return!1;var r=JSON.parse(JSON.stringify(e.form.requiress)),o=JSON.parse(JSON.stringify(e.form.datass)),n=[],s=[];n=r.join(","),s=o.join(","),a.i(i.j)({id:"",name:e.form.name,logo:e.form.logo,classifyId:e.form.classifyId,interest:e.form.interest,money:e.form.money,perioWay:e.form.perioWay,periodization:e.form.periodization,link:e.form.link,settle_cpa:1==e.form.settle_cpa?"0":"",settleWayCpa:e.form.settleWayCpa,settleCycle:e.form.settleCycle,conditionList:n,dataList:s,ktxDesc:e.form.ktxDesc,status:e.form.status,sort:e.form.sort,isHot:e.form.isHot,hotSort:e.form.hotSort,managerUrl:e.form.managerUrl,managerUser:e.form.managerUser,managerPassword:e.form.managerPassword,company:e.form.company,contact:e.form.contact,contactInfo:e.form.contactInfo,description:e.form.description}).then(function(t){if(200!=t.data.code)return e.$message.error(""+t.data.message),!1;e.$message.success(""+t.data.message)}).catch(function(t){e.$message.error(""+t.message,"ERROR!")})})}},created:function(){this.handleQry(this.$route.params.id),this.getApplyData(this.$route.params.id),this.getApplyRequire(this.$route.params.id)},mounted:function(){this.handleQry(this.$route.params.id)},watch:{$route:function(){this.handleQry()}}}},uzBN:function(e,t,a){"use strict";function r(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{},a=new FormData;a.append("file",e);var r=sessionStorage.getItem("token");i.a.request({url:"http://47.96.101.223:8003/main/upload",method:"post",params:{},data:a,headers:{"Content-Type":"multipart/form-data",Authorization:r}}).then(function(e){var a=e.data;return 200==a.code?(t.success&&t.success(a.data.picPath),!0):(t.fail&&t.fail(a.message),!1)}).catch(function(e){return!1})}a.d(t,"a",function(){return n});var o=a("mtWM"),i=a.n(o),n=r}});
//# sourceMappingURL=6.6bac92f5e495aa0bd5dc.js.map
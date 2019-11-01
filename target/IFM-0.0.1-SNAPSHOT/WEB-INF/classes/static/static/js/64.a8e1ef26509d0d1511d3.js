webpackJsonp([64],{"3z1f":function(e,t,a){"use strict";var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("Row",[a("Col",{attrs:{span:"24"}},[a("div",{staticClass:"doc-header"},[a("Form",{ref:"formInline",attrs:{model:e.formInline,rules:e.ruleInline,inline:""}},[a("Form-item",{attrs:{prop:"user"}},[a("Input",{attrs:{type:"text",placeholder:"Username"},model:{value:e.formInline.user,callback:function(t){e.$set(e.formInline,"user",t)},expression:"formInline.user"}},[a("Icon",{attrs:{slot:"prepend",type:"ios-person-outline"},slot:"prepend"})],1)],1),e._v(" "),a("Form-item",{attrs:{prop:"password"}},[a("Input",{attrs:{type:"password",placeholder:"Password"},model:{value:e.formInline.password,callback:function(t){e.$set(e.formInline,"password",t)},expression:"formInline.password"}},[a("Icon",{attrs:{slot:"prepend",type:"ios-locked-outline"},slot:"prepend"})],1)],1),e._v(" "),a("Form-item",[a("Button",{attrs:{type:"primary"},on:{click:function(t){e.handleSubmit("formInline")}}},[e._v("登录")])],1)],1)],1),e._v(" "),a("div",{staticClass:"doc-content"},[a("h2",[e._v("行内表单")]),e._v(" "),a("p",[e._v("设置属性 inline，表单元素可以水平排列。")])])])],1),e._v(" "),a("Row",[a("Col",{attrs:{span:"24"}},[a("div",{staticClass:"doc-header"},[a("Form",{attrs:{model:e.formItem,"label-width":80}},[a("Form-item",{attrs:{label:"输入框"}},[a("Input",{attrs:{placeholder:"请输入"},model:{value:e.formItem.input,callback:function(t){e.$set(e.formItem,"input",t)},expression:"formItem.input"}})],1),e._v(" "),a("Form-item",{attrs:{label:"选择器"}},[a("Select",{attrs:{placeholder:"请选择"},model:{value:e.formItem.select,callback:function(t){e.$set(e.formItem,"select",t)},expression:"formItem.select"}},[a("Option",{attrs:{value:"beijing"}},[e._v("北京市")]),e._v(" "),a("Option",{attrs:{value:"shanghai"}},[e._v("上海市")]),e._v(" "),a("Option",{attrs:{value:"shenzhen"}},[e._v("深圳市")])],1)],1),e._v(" "),a("Form-item",{attrs:{label:"日期控件"}},[a("Date-picker",{attrs:{type:"date",placeholder:"选择日期"},model:{value:e.formItem.date,callback:function(t){e.$set(e.formItem,"date",t)},expression:"formItem.date"}}),e._v(" "),a("Time-picker",{attrs:{type:"time",placeholder:"选择时间"},model:{value:e.formItem.time,callback:function(t){e.$set(e.formItem,"time",t)},expression:"formItem.time"}})],1),e._v(" "),a("Form-item",{attrs:{label:"单选框"}},[a("Radio-group",{model:{value:e.formItem.radio,callback:function(t){e.$set(e.formItem,"radio",t)},expression:"formItem.radio"}},[a("Radio",{attrs:{label:"male"}},[e._v("男")]),e._v(" "),a("Radio",{attrs:{label:"female"}},[e._v("女")])],1)],1),e._v(" "),a("Form-item",{attrs:{label:"多选框"}},[a("Checkbox-group",{model:{value:e.formItem.checkbox,callback:function(t){e.$set(e.formItem,"checkbox",t)},expression:"formItem.checkbox"}},[a("Checkbox",{attrs:{label:"吃饭"}}),e._v(" "),a("Checkbox",{attrs:{label:"睡觉"}}),e._v(" "),a("Checkbox",{attrs:{label:"跑步"}}),e._v(" "),a("Checkbox",{attrs:{label:"看电影"}})],1)],1),e._v(" "),a("Form-item",{attrs:{label:"开关"}},[a("iSwitch",{attrs:{size:"large"},model:{value:e.formItem.switch,callback:function(t){e.$set(e.formItem,"switch",t)},expression:"formItem.switch"}},[a("span",{attrs:{slot:"open"},slot:"open"},[e._v("开启")]),e._v(" "),a("span",{attrs:{slot:"close"},slot:"close"},[e._v("关闭")])])],1),e._v(" "),a("Form-item",{attrs:{label:"滑块"}},[a("Slider",{attrs:{range:""},model:{value:e.formItem.slider,callback:function(t){e.$set(e.formItem,"slider",t)},expression:"formItem.slider"}})],1),e._v(" "),a("Form-item",{attrs:{label:"文本域"}},[a("Input",{attrs:{type:"textarea",autosize:{minRows:2,maxRows:5},placeholder:"请输入..."},model:{value:e.formItem.textarea,callback:function(t){e.$set(e.formItem,"textarea",t)},expression:"formItem.textarea"}})],1),e._v(" "),a("Form-item",[a("Button",{attrs:{type:"primary"}},[e._v("提交")]),e._v(" "),a("Button",{staticStyle:{"margin-left":"8px"},attrs:{type:"ghost"}},[e._v("取消")])],1)],1)],1),e._v(" "),a("div",{staticClass:"doc-content"},[a("h2",[e._v("表单控件")]),e._v(" "),a("p",[e._v("在 Form 内，每个表单域由 Form-item\n          组成，可包含的控件有：Input、Radio、Checkbox、Switch、Select、Slider、DatePicker、TimePicker、Cascader、Transfer、InputNumber、Rate、Upload。")]),e._v(" "),a("p",[e._v("给 Form-item 设置属性 label 可以显示表单域的标签，需要给 Form 设置 label-width。 ")])])])],1),e._v(" "),a("Row",[a("Col",{attrs:{span:"24"}},[a("div",{staticClass:"doc-header"},[a("Form",{attrs:{model:e.formLeft,"label-position":"left","label-width":100}},[a("Form-item",{attrs:{label:"标题"}},[a("Input",{model:{value:e.formLeft.input1,callback:function(t){e.$set(e.formLeft,"input1",t)},expression:"formLeft.input1"}})],1),e._v(" "),a("Form-item",{attrs:{label:"标题名称"}},[a("Input",{model:{value:e.formLeft.input2,callback:function(t){e.$set(e.formLeft,"input2",t)},expression:"formLeft.input2"}})],1),e._v(" "),a("Form-item",{attrs:{label:"标题名称对齐"}},[a("Input",{model:{value:e.formLeft.input3,callback:function(t){e.$set(e.formLeft,"input3",t)},expression:"formLeft.input3"}})],1)],1),e._v(" "),a("Form",{attrs:{model:e.formRight,"label-position":"right","label-width":100}},[a("Form-item",{attrs:{label:"标题"}},[a("Input",{model:{value:e.formRight.input1,callback:function(t){e.$set(e.formRight,"input1",t)},expression:"formRight.input1"}})],1),e._v(" "),a("Form-item",{attrs:{label:"标题名称"}},[a("Input",{model:{value:e.formRight.input2,callback:function(t){e.$set(e.formRight,"input2",t)},expression:"formRight.input2"}})],1),e._v(" "),a("Form-item",{attrs:{label:"标题名称对齐"}},[a("Input",{model:{value:e.formRight.input3,callback:function(t){e.$set(e.formRight,"input3",t)},expression:"formRight.input3"}})],1)],1),e._v(" "),a("Form",{attrs:{model:e.formTop,"label-position":"top"}},[a("Form-item",{attrs:{label:"标题"}},[a("Input",{model:{value:e.formTop.input1,callback:function(t){e.$set(e.formTop,"input1",t)},expression:"formTop.input1"}})],1),e._v(" "),a("Form-item",{attrs:{label:"标题名称"}},[a("Input",{model:{value:e.formTop.input2,callback:function(t){e.$set(e.formTop,"input2",t)},expression:"formTop.input2"}})],1),e._v(" "),a("Form-item",{attrs:{label:"标题名称对齐"}},[a("Input",{model:{value:e.formTop.input3,callback:function(t){e.$set(e.formTop,"input3",t)},expression:"formTop.input3"}})],1)],1)],1),e._v(" "),a("div",{staticClass:"doc-content"},[a("h2",[e._v("对齐方式")]),e._v(" "),a("p",[e._v("设置属性 label-position，可以改变表单域标签的位置，left 为左对齐，right 为右对齐，top 会置于表单域顶部")])])])],1),e._v(" "),a("Row",[a("Col",{attrs:{span:"24"}},[a("div",{staticClass:"doc-header"},[a("Form",{ref:"formValidate",attrs:{model:e.formValidate,rules:e.ruleValidate,"label-width":80}},[a("Form-item",{attrs:{label:"姓名",prop:"name"}},[a("Input",{attrs:{placeholder:"请输入姓名"},model:{value:e.formValidate.name,callback:function(t){e.$set(e.formValidate,"name",t)},expression:"formValidate.name"}})],1),e._v(" "),a("Form-item",{attrs:{label:"邮箱",prop:"mail"}},[a("Input",{attrs:{placeholder:"请输入邮箱"},model:{value:e.formValidate.mail,callback:function(t){e.$set(e.formValidate,"mail",t)},expression:"formValidate.mail"}})],1),e._v(" "),a("Form-item",{attrs:{label:"城市",prop:"city"}},[a("Select",{attrs:{placeholder:"请选择所在地"},model:{value:e.formValidate.city,callback:function(t){e.$set(e.formValidate,"city",t)},expression:"formValidate.city"}},[a("Option",{attrs:{value:"beijing"}},[e._v("北京市")]),e._v(" "),a("Option",{attrs:{value:"shanghai"}},[e._v("上海市")]),e._v(" "),a("Option",{attrs:{value:"shenzhen"}},[e._v("深圳市")])],1)],1),e._v(" "),a("Form-item",{attrs:{label:"选择日期"}},[a("Row",[a("Col",{attrs:{span:"11"}},[a("Form-item",{attrs:{prop:"date"}},[a("Date-picker",{attrs:{type:"date",placeholder:"选择日期"},model:{value:e.formValidate.date,callback:function(t){e.$set(e.formValidate,"date",t)},expression:"formValidate.date"}})],1)],1),e._v(" "),a("Col",{staticStyle:{"text-align":"center"},attrs:{span:"2"}},[e._v("-")]),e._v(" "),a("Col",{attrs:{span:"11"}},[a("Form-item",{attrs:{prop:"time"}},[a("Time-picker",{attrs:{type:"time",placeholder:"选择时间"},model:{value:e.formValidate.time,callback:function(t){e.$set(e.formValidate,"time",t)},expression:"formValidate.time"}})],1)],1)],1)],1),e._v(" "),a("Form-item",{attrs:{label:"性别",prop:"gender"}},[a("Radio-group",{model:{value:e.formValidate.gender,callback:function(t){e.$set(e.formValidate,"gender",t)},expression:"formValidate.gender"}},[a("Radio",{attrs:{label:"male"}},[e._v("男")]),e._v(" "),a("Radio",{attrs:{label:"female"}},[e._v("女")])],1)],1),e._v(" "),a("Form-item",{attrs:{label:"爱好",prop:"interest"}},[a("Checkbox-group",{model:{value:e.formValidate.interest,callback:function(t){e.$set(e.formValidate,"interest",t)},expression:"formValidate.interest"}},[a("Checkbox",{attrs:{label:"吃饭"}}),e._v(" "),a("Checkbox",{attrs:{label:"睡觉"}}),e._v(" "),a("Checkbox",{attrs:{label:"跑步"}}),e._v(" "),a("Checkbox",{attrs:{label:"看电影"}})],1)],1),e._v(" "),a("Form-item",{attrs:{label:"介绍",prop:"desc"}},[a("Input",{attrs:{type:"textarea",autosize:{minRows:2,maxRows:5},placeholder:"请输入..."},model:{value:e.formValidate.desc,callback:function(t){e.$set(e.formValidate,"desc",t)},expression:"formValidate.desc"}})],1),e._v(" "),a("Form-item",[a("Button",{attrs:{type:"primary"},on:{click:function(t){e.handleSubmit("formValidate")}}},[e._v("提交")]),e._v(" "),a("Button",{staticStyle:{"margin-left":"8px"},attrs:{type:"ghost"},on:{click:function(t){e.handleReset("formValidate")}}},[e._v("重置\n            ")])],1)],1)],1),e._v(" "),a("div",{staticClass:"doc-content"},[a("h2",[e._v("表单验证")]),e._v(" "),a("p",[e._v("Form 组件基于 async-validator 实现的数据验证，给 Form 设置属性 rules，同时给需要验证的 Form-item 设置属性 prop 指向对应字段即可。")])])])],1),e._v(" "),a("Row",[a("Col",{attrs:{span:"24"}},[a("div",{staticClass:"doc-header"},[a("Form",{ref:"formDynamic",attrs:{model:e.formDynamic,"label-width":80}},[e._l(e.formDynamic.items,function(t,r){return a("Form-item",{key:r,attrs:{label:"项目"+(r+1),prop:"items."+r+".value",rules:{required:!0,message:"项目"+(r+1)+"不能为空",trigger:"blur"}}},[a("Input",{attrs:{type:"text",placeholder:"请输入..."},model:{value:t.value,callback:function(a){e.$set(t,"value",a)},expression:"item.value"}}),e._v(" "),a("Button",{attrs:{type:"ghost",size:"small"},on:{click:function(t){e.handleRemove(r)}}},[e._v("删除")])],1)}),e._v(" "),a("Form-item",[a("Row",[a("Button",{attrs:{type:"dashed",long:"",icon:"plus-round"},on:{click:e.handleAdd}},[e._v("新增")])],1)],1),e._v(" "),a("Form-item",[a("Button",{attrs:{type:"primary"},on:{click:function(t){e.handleSubmit("formDynamic")}}},[e._v("提交")]),e._v(" "),a("Button",{staticStyle:{"margin-left":"8px"},attrs:{type:"ghost"},on:{click:function(t){e.handleReset("formDynamic")}}},[e._v("重置\n            ")])],1)],2)],1)])],1)],1)},o=[],i={render:r,staticRenderFns:o};t.a=i},LBkB:function(e,t,a){"use strict";t.a={data:function(){return{formItem:{input:"",select:"",radio:"male",checkbox:[],switch:!0,date:"",time:"",slider:[20,50],textarea:""},formInline:{user:"123",password:"123456"},ruleInline:{user:[{required:!0,message:"请填写用户名",trigger:"blur"}],password:[{required:!0,message:"请填写密码",trigger:"blur"},{type:"string",min:6,message:"密码长度不能小于6位",trigger:"blur"}]},formLeft:{input1:"",input2:"",input3:""},formRight:{input1:"",input2:"",input3:""},formTop:{input1:"",input2:"",input3:""},formValidate:{name:"",mail:"",city:"",gender:"",interest:[],date:"",time:"",desc:""},ruleValidate:{name:[{required:!0,message:"姓名不能为空",trigger:"blur"}],mail:[{required:!0,message:"邮箱不能为空",trigger:"blur"},{type:"email",message:"邮箱格式不正确",trigger:"blur"}],city:[{required:!0,message:"请选择城市",trigger:"change"}],gender:[{required:!0,message:"请选择性别",trigger:"change"}],interest:[{required:!0,type:"array",min:1,message:"至少选择一个爱好",trigger:"change"},{type:"array",max:2,message:"最多选择两个爱好",trigger:"change"}],date:[{required:!0,type:"date",message:"请选择日期",trigger:"change"}],time:[{required:!0,type:"date",message:"请选择时间",trigger:"change"}],desc:[{required:!0,message:"请输入个人介绍",trigger:"blur"},{type:"string",min:20,message:"介绍不能少于20字",trigger:"blur"}]},formDynamic:{items:[{value:""}]}}},methods:{handleSubmit:function(e){var t=this;this.$refs[e].validate(function(e){e?t.$Message.success("提交成功!"):t.$Message.error("表单验证失败!")})},handleReset:function(e){this.$refs[e].resetFields()},handleAdd:function(){this.formDynamic.items.push({value:""})},handleRemove:function(e){this.formDynamic.items.splice(e,1)}}}},br29:function(e,t,a){t=e.exports=a("FZ+f")(!0),t.push([e.i,"\n.doc-header[data-v-34777ee6] {\n  width: 100%;\n  border-bottom: 1.5px dashed #062873;\n  padding-left: 5px;\n  padding-top: 5px;\n  padding-bottom: 30px\n}\n.doc-content[data-v-34777ee6] {\n  margin-top: 10px;\n  margin-bottom: 50px;\n  padding: 5px;\n  line-height: 20px\n}\n.doc-content p[data-v-34777ee6] {\n  margin-bottom: 5px;\n  margin-top: 5px\n}\n.doc-content h2[data-v-34777ee6] {\n  margin-bottom: 10px;\n  margin-top: 10px\n}\n","",{version:3,sources:["E:/ROOT/src/view/components/Form.vue"],names:[],mappings:";AACA;EACE,YAAY;EACZ,oCAAoC;EACpC,kBAAkB;EAClB,iBAAiB;EACjB,oBAAoB;CACrB;AACD;EACE,iBAAiB;EACjB,oBAAoB;EACpB,aAAa;EACb,iBAAiB;CAClB;AACD;EACE,mBAAmB;EACnB,eAAe;CAChB;AACD;EACE,oBAAoB;EACpB,gBAAgB;CACjB",file:"Form.vue",sourcesContent:["\n.doc-header[data-v-34777ee6] {\n  width: 100%;\n  border-bottom: 1.5px dashed #062873;\n  padding-left: 5px;\n  padding-top: 5px;\n  padding-bottom: 30px\n}\n.doc-content[data-v-34777ee6] {\n  margin-top: 10px;\n  margin-bottom: 50px;\n  padding: 5px;\n  line-height: 20px\n}\n.doc-content p[data-v-34777ee6] {\n  margin-bottom: 5px;\n  margin-top: 5px\n}\n.doc-content h2[data-v-34777ee6] {\n  margin-bottom: 10px;\n  margin-top: 10px\n}\n"],sourceRoot:""}])},d5lx:function(e,t,a){"use strict";function r(e){a("k9Sq")}Object.defineProperty(t,"__esModule",{value:!0});var o=a("LBkB"),i=a("3z1f"),n=a("VU/8"),l=r,s=n(o.a,i.a,l,"data-v-34777ee6",null);t.default=s.exports},k9Sq:function(e,t,a){var r=a("br29");"string"==typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);a("rjj0")("1919e117",r,!0)}});
//# sourceMappingURL=64.a8e1ef26509d0d1511d3.js.map
webpackJsonp([61],{"8CRN":function(t,n,e){var a=e("m+Rp");"string"==typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);e("rjj0")("79cd5e1c",a,!0)},MYhK:function(t,n,e){"use strict";function a(t){e("8CRN")}Object.defineProperty(n,"__esModule",{value:!0});var o=e("Vkkf"),i=e("v/4e"),s=e("VU/8"),r=a,p=s(o.a,i.a,r,"data-v-8a8705a4",null);n.default=p.exports},Vkkf:function(t,n,e){"use strict";n.a={name:"spin"}},"m+Rp":function(t,n,e){n=t.exports=e("FZ+f")(!0),n.push([t.i,"\n.doc-header[data-v-8a8705a4] {\n     background-color: white !important;\n     width: 100%;\n     border-bottom: 1.5px dashed #062873;\n     padding-left: 5px;\n     padding-top: 5px;\n     padding-bottom: 30px\n}\n.doc-content[data-v-8a8705a4] {\n  margin-top: 10px;\n  margin-bottom: 50px;\n  padding: 5px;\n  line-height: 20px\n}\n.doc-content p[data-v-8a8705a4] {\n  fout-size:30px;\n  margin-bottom: 5px;\n  margin-top: 5px\n}\n.doc-content h2[data-v-8a8705a4] {\n  margin-bottom: 10px;\n  margin-top: 10px\n}\n","",{version:3,sources:["E:/ROOT/src/view/components/Steps.vue"],names:[],mappings:";AACA;KACK,mCAAmC;KACnC,YAAY;KACZ,oCAAoC;KACpC,kBAAkB;KAClB,iBAAiB;KACjB,oBAAoB;CACxB;AACD;EACE,iBAAiB;EACjB,oBAAoB;EACpB,aAAa;EACb,iBAAiB;CAClB;AACD;EACE,eAAe;EACf,mBAAmB;EACnB,eAAe;CAChB;AACD;EACE,oBAAoB;EACpB,gBAAgB;CACjB",file:"Steps.vue",sourcesContent:["\n.doc-header[data-v-8a8705a4] {\n     background-color: white !important;\n     width: 100%;\n     border-bottom: 1.5px dashed #062873;\n     padding-left: 5px;\n     padding-top: 5px;\n     padding-bottom: 30px\n}\n.doc-content[data-v-8a8705a4] {\n  margin-top: 10px;\n  margin-bottom: 50px;\n  padding: 5px;\n  line-height: 20px\n}\n.doc-content p[data-v-8a8705a4] {\n  fout-size:30px;\n  margin-bottom: 5px;\n  margin-top: 5px\n}\n.doc-content h2[data-v-8a8705a4] {\n  margin-bottom: 10px;\n  margin-top: 10px\n}\n"],sourceRoot:""}])},"v/4e":function(t,n,e){"use strict";var a=function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("div",{staticClass:"animated fadeIn",staticStyle:{"margin-top":"20px","margin-left":"10px"}},[e("Row",[e("Col",{attrs:{span:"24"}},[e("div",{staticClass:"doc-header"},[e("Steps",{attrs:{current:1}},[e("Step",{attrs:{title:"已完成",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"进行中",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"待进行",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"待进行",content:"这里是该步骤的描述信息"}})],1)],1),t._v(" "),e("div",{staticClass:"doc-content"},[e("h2",[t._v("基础用法")]),t._v(" "),e("p",[t._v(" 基本用法，组件会根据current自动判断各步骤状态")])])])],1),t._v(" "),e("Row",[e("Col",{attrs:{span:"24"}},[e("div",{staticClass:"doc-header"},[e("Steps",{attrs:{current:1}},[e("Step",{attrs:{title:"注册",icon:"person-add"}}),t._v(" "),e("Step",{attrs:{title:"上传头像",icon:"camera"}}),t._v(" "),e("Step",{attrs:{title:"验证邮箱",icon:"email"}})],1)],1),t._v(" "),e("div",{staticClass:"doc-content"},[e("h2",[t._v("带图标的步骤条")]),t._v(" "),e("p",[t._v(" 通过设置Step的icon属性可以自定义图标。")])])])],1),t._v(" "),e("Row",[e("Col",{attrs:{span:"24"}},[e("div",{staticClass:"doc-header"},[e("Steps",{attrs:{current:2,direction:"vertical"}},[e("Step",{attrs:{title:"已完成",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"已完成",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"进行中",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"待进行",content:"这里是该步骤的描述信息"}})],1)],1),t._v(" "),e("div",{staticClass:"doc-content"},[e("h2",[t._v("垂直方向")]),t._v(" "),e("p",[t._v(" 设置属性direction为vertical在垂直方向展示。")])])])],1),t._v(" "),e("Row",[e("Col",{attrs:{span:"24"}},[e("div",{staticClass:"doc-header"},[e("Steps",{attrs:{current:1,status:"error"}},[e("Step",{attrs:{title:"已完成",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"进行中",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"待进行",content:"这里是该步骤的描述信息"}}),t._v(" "),e("Step",{attrs:{title:"待进行",content:"这里是该步骤的描述信息"}})],1)],1),t._v(" "),e("div",{staticClass:"doc-content"},[e("h2",[t._v("步骤运行错误")]),t._v(" "),e("p",[t._v(" 设置Steps的属性status为error指定当前步骤状态。")])])])],1)],1)},o=[],i={render:a,staticRenderFns:o};n.a=i}});
//# sourceMappingURL=61.f80e6b4da957e7abda10.js.map
package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@CrossOrigin
@Controller
@Api(tags = "MainController", description = "其他接口")
@RequestMapping("/main")
public class MainController{

	@Autowired
	private UmsAdminService umsAdminService;

	@ApiOperation("图片上传")
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult upload(@RequestParam("file") MultipartFile file){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String picPath = null;
		try {
			// 判断文件是否为空
			if (!file.isEmpty()) {
				// 保存文件
				// 为获取文件的扩展名
				String filename = file.getOriginalFilename();
				int dot = filename.lastIndexOf(".");
				// 扩展名有带前面的.号
				String extname = filename.substring(dot);
				// 为避免文件覆盖，使用当前时间产生新文件名
				String newname = String.valueOf((new Date()).getTime());
				String s = File.separator;
				String path = "E:\\fileUpload\\upload\\" + new SimpleDateFormat("yyyyMMdd").format(new Date())+"/";
				File filepath = new File(path);
				if (!filepath.exists())
					filepath.mkdirs();
				// 文件保存路径
				String savePath = path + newname + extname;
				// 转存文件
				file.transferTo(new File(savePath));
				picPath = "E:\\fileUpload\\upload\\" + new SimpleDateFormat("yyyyMMdd").format(new Date()) + s + newname + extname;
			}
			resultMap.put("picPath",picPath);
			return CommonResult.success(resultMap,"上传成功");
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("上传失败");
		}
	}

	@ApiOperation("首页")
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	@ResponseBody
	public CommonResult<Map<String, Object>> homePage() {
		Map<String, Object> product = umsAdminService.qryUserlogin();
		return CommonResult.success(product);
	}
}

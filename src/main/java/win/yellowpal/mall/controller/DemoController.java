package win.yellowpal.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import win.yellowpal.mall.domain.Test;
import win.yellowpal.mall.redis.RedisService;
import win.yellowpal.mall.result.Result;
import win.yellowpal.mall.service.TestService;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	TestService testService;

	@Autowired
	RedisService redisService;

	@RequestMapping("")
	@ResponseBody
	public String index() {
		return "demo index";
	}

	@RequestMapping("/demo")
	public String demo(Model model) {
		model.addAttribute("demo", "hahahahha测试");

		return "demo";
	}

	@RequestMapping("/db/get")
	@ResponseBody
	public Result<Test> dbGet() {
		Test test = testService.getById(1);
		return Result.success(test);
	}

	@RequestMapping("/redis/get")
	@ResponseBody
	public Result<Object> redisGet() {

//		Test test = testService.getById(1);
//
//		redisService.setObj("test", JSON.toJSON(test));

		Object ret = redisService.getObj("test");
		return Result.success(ret);
	}
}

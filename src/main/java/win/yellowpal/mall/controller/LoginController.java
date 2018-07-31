package win.yellowpal.mall.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import win.yellowpal.mall.result.CodeMsg;
import win.yellowpal.mall.result.Result;
import win.yellowpal.mall.service.UserService;
import win.yellowpal.mall.vo.LoginVo;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Result<String> login(@Valid LoginVo loginVo){
		
		if(userService.login(loginVo)){
			return Result.success("success");
		}else{
			return Result.error(CodeMsg.PASSWORD_ERROR);
		}
		
	} 
	
}

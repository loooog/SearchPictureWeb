package com.whj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.whj.service.TestService;
import com.whj.bean.LoginResult;
import com.whj.bean.User;

@Controller
@RequestMapping("/login")
public class Login {
	@Autowired
	private TestService service;
	
	@RequestMapping("/loginPage.do")
	public String loginPage(){
	System.out.println("½øÈëµÇÂ¼Ò³Ãæ£¡");
	return "login/login.html";
	}
	@RequestMapping("/login.do")
	public ModelAndView login(String username,String password){
		System.out.println("ÇëÇóµÇÂ¼£¡");
		ModelAndView mv = new ModelAndView();
		User user=service.login(username, password);
		if(user!=null){
			mv.setViewName("test/registerSubmit.jsp");
			mv.addObject(user);
			return mv;
		}else{
			mv.setViewName("login/login.html");
			//mv.setViewName("test/loginPage.jsp");
			return mv;
		}
}
	@RequestMapping(value ="/requestLogin.do")
	public @ResponseBody LoginResult requestLogin(String username,String password){
		System.out.println("ÇëÇóµÇÂ¼£¡");
//		ModelAndView mv = new ModelAndView();
		LoginResult result = new LoginResult();
		User user=service.login(username, password);
		if(user!=null){
			System.out.println("login success!");
			result.setUser(user);
			result.setStatus("200");
			result.setInfo("µÇÂ¼³É¹¦£¡");
			return result;
		}else{
			System.out.println("login error!");
			user = new User();
			user.setUsername("");
			user.setPassword("");
			result.setUser(user);
			result.setInfo("ÓÃ»§Ãû»òÃÜÂë´íÎó£¡");
			result.setStatus("401");
			return result;
		}
		
	}
}

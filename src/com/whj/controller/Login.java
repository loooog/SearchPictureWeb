package com.whj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.whj.service.TestService;
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
	@RequestMapping(value ="/requestLogin.do" )
	public @ResponseBody User requestLogin(String username,String password){
		System.out.println("ÇëÇóµÇÂ¼£¡");
	//	ModelAndView mv = new ModelAndView();
		User user=service.login(username, password);
		String result = null;
		if(user!=null){
			return user;
		}else{
			user = new User("hehe", "hehe");
			return user;
		}
		/*if(result!=null){
			System.out.println("result: "+result);
			result = "{\"status\":\"200\",\"info\":\"ok\"}";
			return result;
			mv.setViewName("test/registerSubmit.jsp");
			mv.addObject(user);
			return mv;
		}else{
			result = "{\"status\":\"404\",\"info\":\"error\"}";
			System.out.println("result: "+result);
			return result;
			mv.setViewName("login/login.html");
			//mv.setViewName("test/loginPage.jsp");
			return mv;
		}*/
}
}

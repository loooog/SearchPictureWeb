package com.whj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whj.bean.LoginResult;
import com.whj.bean.SignUpResult;
import com.whj.bean.User;
import com.whj.service.TestService;

@Controller
@RequestMapping("/signUp")
public class SignUp {
	@Autowired
	private TestService service;
	@RequestMapping("/signUpPage")
	public String signUpPage(){
	System.out.println("����ע��ҳ�棡");
	return "signUp/signUp.html";
	}
	@RequestMapping("/signUp.do")
	public @ResponseBody SignUpResult signUp(String username,String password){
	System.out.println("����ע��");
	SignUpResult result = new SignUpResult();
	boolean status =service.addUser(username, password);
	if(status){
		result.setStatus("200");
		result.setInfo("ע��ɹ�");
	}else{
		result.setStatus("401");
		result.setInfo("ע��ʧ��");
	}
	return result;
	}


}
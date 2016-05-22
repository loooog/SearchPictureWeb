package com.whj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signUp.do")
public class SignUp {
	@RequestMapping()
	public String signUpPage(){
	System.out.println("½øÈë×¢²áÒ³Ãæ£¡");
	return "signUp/signUp.html";
	}
}

package com.whj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index.do")
public class Index {
	@RequestMapping()
	public String index(){
		System.out.println("½øÈëÊ×Ò³£¡");
		return "index/index.html";
	}
}

package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Co {

	@RequestMapping("/index.do")
	public String cc() {
		
		StringBuffer tr=new StringBuffer("你说的");
	 
		System.out.println(tr);
		
		return "index";			
	}
	
	
	
}

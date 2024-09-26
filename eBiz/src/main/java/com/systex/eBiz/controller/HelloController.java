package com.systex.eBiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.systex.eBiz.service.TimeService;

@Controller
@RequestMapping("hello")
public class HelloController {

	@Autowired
	private TimeService ts;
	
	@GetMapping
	public String printHello(Model model) {
		model.addAttribute("message" , "Hello Spring MVC FrameWork");
		model.addAttribute("time" , ts.getTime());
		
		return "hello";
	}
}
         
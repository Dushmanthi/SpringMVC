package com.xyz.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello () {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("hello");
		modelandview.addObject("id",1);
		modelandview.addObject("name", "Stark");
		modelandview.addObject("Assets","100");
		return modelandview;
	}
}

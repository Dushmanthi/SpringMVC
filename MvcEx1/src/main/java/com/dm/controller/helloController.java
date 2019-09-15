package com.dm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
public class helloController {

	@RequestMapping("/hello")
	public ModelAndView hello () {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("save");
		modelandview.addObject("id",1);
		modelandview.addObject("name", "Stark");
		modelandview.addObject("Assets","100");
		return modelandview;
	}
}

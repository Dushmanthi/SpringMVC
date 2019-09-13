package com.xyz.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.xyz.springmvc.model.User;;
@Controller
public class UserController {
	@RequestMapping("registerPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("userRegister");
		return modelandview;
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user")User user) {
//		System.out.println(user);
//		ModelAndView modelandview = new ModelAndView();
//		modelandview.setViewName("userRegister");
//		return modelandview;
		
		System.out.println(user);
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("regResult");
		return modelandview;
	}
}


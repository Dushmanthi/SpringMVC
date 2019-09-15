package com.dm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dm.model.Project;
import com.dm.service.ProjectService;

@Controller
public class ProjectController {
	

	@Autowired
	private ProjectService projectService;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("project", new Project(null, null));
		return "add";
	}
	
	@RequestMapping(value ="/save", method =RequestMethod.POST)
    public String save(@ModelAttribute("project") Project project) {
		System.out.println(project.getProjectName());
		projectService.add(project);
		return null;
	}
	
	@RequestMapping(value ="/view", method =RequestMethod.GET)
    public ModelAndView getProject() {
		ModelAndView mav = new ModelAndView("View");
		mav.addObject("projectList",projectService.getAllProject());
		return mav;
	}


}

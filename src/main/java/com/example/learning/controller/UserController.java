package com.example.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.learning.service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImpl impl;
	
	@GetMapping(value={"/", "/contactUs"})
	public ModelAndView sendLoginPage() {
		ModelAndView mvc = new ModelAndView("contactUs");
		return mvc;
	}
	
	@GetMapping("/homepage")
	public ModelAndView sendHomePage() {
		ModelAndView mvc = new ModelAndView("homepage");
		return mvc;
	}
	

	@GetMapping("/manage-users")
	@PreAuthorize("hasAuthority('PROFESSOR')")
	public ModelAndView sendManageStudents() {
		ModelAndView mvc = new ModelAndView("manageUsers");
		return mvc;
	}
	
	@GetMapping("/accessDenied")
	public ModelAndView sendAccessDeniedPage() {
		ModelAndView mvc = new ModelAndView("accessDenied");
		return mvc;
	}

}

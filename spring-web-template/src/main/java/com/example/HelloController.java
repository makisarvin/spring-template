package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("message", "Hello This is an MVC project");
		return "index";
	}
}
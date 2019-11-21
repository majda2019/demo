package com.exemple.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlleur {
@GetMapping("/demo")
public ModelAndView go() {
	return new ModelAndView("page");
}
	@GetMapping("/test")
	
	public @ResponseBody String go2() {
		
		
	return "Test";	
		
	}

}

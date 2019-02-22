package br.com.exedio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/message")
	public String message(Model model) {
		String message = "Some Information";
		model.addAttribute("message", message);
		
		return "hello";
	}
	
	
}

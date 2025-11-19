package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String gretting() {
		return "Hello, World";
	}
	
	@RequestMapping("/leto")
	public @ResponseBody String greetingLeto() {
		return "Hello, Leto!";
	}
	
	@RequestMapping("/wellington")
	public @ResponseBody String greetingWell() {
		return "Oi, Meu Nome é Wellington Rodrigues!!!";
	}

}

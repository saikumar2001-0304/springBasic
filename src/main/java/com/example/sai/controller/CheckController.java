package com.example.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/check")
public class CheckController {

	@GetMapping("/home")
	public String demoPage() {
		return "home";
	}
}

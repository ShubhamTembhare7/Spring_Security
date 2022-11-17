package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String getdata()
	{
		String msg="Welcome to YASH Technology";
		System.out.println("Hello Merge");
		System.out.println("Hello I am git");
		return msg;
		
	}
}

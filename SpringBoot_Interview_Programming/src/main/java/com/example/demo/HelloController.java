package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	
//1. Rest WebServices return  type
	
	@RequestMapping("/h1")
	public String hello1() {
		return "from Rest WebServices return type...";
	}
	//http://localhost:8080/h1
	
// 2. Rest WebServices input PathVariable
	
	@RequestMapping("h2/{firstName}/{age}")
	public String hello2(@PathVariable String firstName, @PathVariable Integer age) {		
		return "FirstName-"+firstName +"Age-"+age;	
	}
	//http://localhost:8080/h2/Raj/30
	
	
	

}

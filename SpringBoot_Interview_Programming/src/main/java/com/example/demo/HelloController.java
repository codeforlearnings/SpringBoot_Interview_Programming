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
	
// 3. Rest WebServices input RequestBody
	/*
	 * @PostMapping("/cust") public Customer save(@RequestBody Customer cust) {
	 * System.out.println(cust.getCustomerId());
	 * System.out.println(cust.getFirstName());
	 * System.out.println(cust.getLastName());
	 * System.out.println(cust.getCustomerAddress()); return cust; }
	 */
	//http://localhost:8080/cust
	
// 4. Rest WebServices input RequestParam
	
	@RequestMapping("/h3")
	public String hello3(@RequestParam(value="param1") String lastName) {		
		return "LastName is- "+lastName;
	}
	//http://localhost:8080/h3?param1=Kumar	
	

}

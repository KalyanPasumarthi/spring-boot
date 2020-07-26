package com.example.openshift.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftRestController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "HELLO WORLD";
	}
	
	@GetMapping("/echo/{name}")
	public String echo(@PathVariable String name){
		return "Hi openshift this is "+name;
	}
}

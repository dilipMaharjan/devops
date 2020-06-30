package com.dilipmaharjan.helloworldwithspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldResource {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
}

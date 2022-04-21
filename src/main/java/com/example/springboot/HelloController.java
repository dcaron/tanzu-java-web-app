package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Value("${hello.greeting}")
	private String greeting;

	@RequestMapping("/")
	public String index() {
		return greeting;
	}
}
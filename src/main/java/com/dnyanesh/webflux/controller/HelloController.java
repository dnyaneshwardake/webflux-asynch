package com.dnyanesh.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnyanesh.webflux.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private HelloService helloService;

	public String testCode() {

		return helloService.getUserDetails(null);

	}

}

package com.dnyanesh.webflux.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class HelloService {

	WebClient webClient = WebClient.create();

	public String getUserDetails(String str) {
		str = "UserName";
		return null;
	}
	

	public void callThisMethod() {

		create("Welcome").subscribe(str -> {
			if (!StringUtils.isEmpty(str)) {
				test1(str);
			} else {
				test3(str);
			}
		}) ;
	}

	public Mono<String> create(String empl) {
		Mono<String> bodyToMono = null;
		try {
			bodyToMono = webClient.post().uri("http://localhost:8082/test").body(Mono.just("Welcome"), String.class)
					.retrieve().bodyToMono(String.class);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return bodyToMono;
	}

	public void test1(String str) {
		System.out.println("push to kafka");
	}

	public void test3(String str) {
		System.out.println("save to DB");
	}

}

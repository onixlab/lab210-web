package com.onixlab.cursos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloWorld")
	public String hello() {
		System.out.println("executando: Hello World com Spring MVC");
		return "hello";
	}
}

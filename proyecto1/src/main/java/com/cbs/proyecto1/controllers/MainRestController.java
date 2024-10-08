package com.cbs.proyecto1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@GetMapping
	public String helloWorld() {
		return "Hello Word";
	}

}

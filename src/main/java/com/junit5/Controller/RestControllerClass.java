package com.junit5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit5.Service.WelcomeService;

@RestController
public class RestControllerClass {
	
	@Autowired
	private WelcomeService welcomeService;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(){
		String welcomeMsg=welcomeService.getWelcomeMsg();
		return new ResponseEntity<String>(welcomeMsg,HttpStatus.OK) ;
		
	}
}

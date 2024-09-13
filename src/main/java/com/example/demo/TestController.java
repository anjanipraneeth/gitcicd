package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class TestController {
 
	@Autowired
	TestService testService;
	@PostMapping("/validateNum")
	public ResponseEntity<String> validateContact (@RequestBody TestData testData) throws Exception{
		try {
			testService.validateContact(testData);
			return new ResponseEntity<>("ContactValidatedSuccessfully",HttpStatus.OK);
		}
		catch(IllegalArgumentException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
}

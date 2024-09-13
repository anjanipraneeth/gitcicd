package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	
	TestData data;
	
	List<String> validateMobileNumber = Arrays.asList("1234567891","12345","9876543535");
	public void validateContact(TestData testData) throws Exception {
		String mobileNum = testData.getMobileNumber();
		if(mobileNum == null || mobileNum.length() != 10)
			throw new Exception("Mobile numbeer is not valid");
	}
}

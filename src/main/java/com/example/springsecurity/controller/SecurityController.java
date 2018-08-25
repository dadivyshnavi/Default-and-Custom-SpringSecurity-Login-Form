package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@RequestMapping(value="svc/v1/public/accounts/{accountNumber}")
	public String getPublicAccountDataLinkedTo(@PathVariable final int accountNumber) {
		
		return "Public Account Linked To: "+ accountNumber;
}
	
	@RequestMapping(value="svc/v1/private/accounts/{accountNumber}")
	public String getPrivateAccountDataLinkedTo(@PathVariable final int accountNumber) {
		
		return "Private Account Linked To: "+ accountNumber;
		
		
}
	@RequestMapping(value="svc/v1/private/admin/accounts/{accountNumber}")
	public String getExtraPrivateAccountDataLinkedTo(@PathVariable final int accountNumber) {
		
		return "Private Account Linked To: "+ accountNumber;
		
		
}
	
}

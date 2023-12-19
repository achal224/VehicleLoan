package com.vehicleloan.app.demo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.app.demo.main.serviceInterface.SanctionServiceInterface;

@CrossOrigin("*")
@RestController
public class SanctionController {
	
	@Autowired
	SanctionServiceInterface ssi;
	
	@GetMapping("getAllApprovedEnquiry")
	 public Iterable getAllApprovedEnquiry()
	 {
		Iterable list=ssi.getAllApprovedEnquiry();
		return list;
	 }

}

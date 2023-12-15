package com.vehicleloan.app.demo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.serviceInterface.EnquiryServiceInterface;
@CrossOrigin("*")
@RestController
public class EnquiryController {
	
	@Autowired
	EnquiryServiceInterface esi;
	
	@PostMapping("/saveEnquiry")
	public ResponseEntity<EnquiryDetails>  saveEnquiry(@RequestBody EnquiryDetails ed  )
	{
		EnquiryDetails e= esi.saveEnquiry(ed);
		return new ResponseEntity<EnquiryDetails>(e,HttpStatus.CREATED);
	}
	
	@RequestMapping("/getallEnquiry")
	public Iterable getAlldata()
	{
		Iterable list=esi.displayAllData();
		return list;
	}
	
	@RequestMapping("/getallEnquiryByid/{cid}")
	public EnquiryDetails getByid(@PathVariable("cid") int cid)
	{
		EnquiryDetails e=esi.getByid(cid);
		return e;
	}
	
	@RequestMapping("/getallRegisteredEnquiry")
	public Iterable getallRegisteredEnquiry()
	{
		Iterable list=esi.getallRegisteredEnquiry();
		return list;
	}
}

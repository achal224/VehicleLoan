package com.vehicleloan.app.demo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.model.EnquiryEmail;
import com.vehicleloan.app.demo.main.serviceInterface.EmailService;
import com.vehicleloan.app.demo.main.serviceInterface.EnquiryServiceInterface;
@CrossOrigin("*")
@RestController
public class EnquiryController {
	
	@Autowired
	EnquiryServiceInterface esi;
	
	@Autowired
	EmailService emserInt;
	
	@PostMapping("/saveEnquiry")
	public ResponseEntity<EnquiryDetails>  saveEnquiry(@RequestBody EnquiryDetails ed  )
	{
		EnquiryDetails e= esi.saveEnquiry(ed);
		return new ResponseEntity<EnquiryDetails>(e,HttpStatus.CREATED);
	}
	
	@GetMapping("/viewEnquiryForRM")
	public Iterable viewEnquiryForRM()
	{
		Iterable list=esi.viewEnquiryForRM();
		return list;
	}
	
	@GetMapping("/RequiredcibilScore/{cid}")
	public ResponseEntity<EnquiryDetails> RequiredcibilScore(@PathVariable("cid") int cid)
	{
		EnquiryDetails e=esi.RequiredcibilScore(cid);
		return new ResponseEntity<EnquiryDetails>(e,HttpStatus.OK);
	}
	
	@GetMapping("/getallrequiredCibilEnquiry")
	public Iterable getallRegisteredEnquiry()
	{
		Iterable list=esi.getallRegisteredEnquiry();
		return list;
	}
	@GetMapping("/genrateCibilScore/{cid}")
	public ResponseEntity genrateCibilScore(@PathVariable("cid") int cid)
	{
		esi.setCibil(cid);
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/setFinalSatatus/{cid}/{enquiryStatus}")
	public ResponseEntity<EnquiryDetails> setFinalSatatus(@PathVariable("cid") int cid,@PathVariable("enquiryStatus") String enquiryStatus)
	{
		EnquiryDetails e=esi.setFinalSatatus(cid,enquiryStatus);
		return new ResponseEntity<EnquiryDetails>(e,HttpStatus.OK);
	}
	
	@GetMapping("/getallrejectedEnquiry")
	public Iterable getallrejectedEnquiry()
	{
		Iterable list=esi.getallrejectedEnquiry();
		return list;
	}
	
	@GetMapping("/sendForLoanApplication")
	public ResponseEntity<EnquiryDetails> sendForLoanApplication(@PathVariable("cid") int cid)
	{
		EnquiryDetails e=esi.sendForLoanApplication(cid);
		return new ResponseEntity<EnquiryDetails>(e,HttpStatus.OK);
	}
	
	@PostMapping("/sendRejectedEmail/{cid}")
	public ResponseEntity sendRejectedEmail(@PathVariable("cid") int cid,@RequestBody EnquiryEmail e)
	{
		emserInt.sendRejectedEmail(cid,e);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}

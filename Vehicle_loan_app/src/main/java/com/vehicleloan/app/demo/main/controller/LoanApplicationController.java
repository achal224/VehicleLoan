package com.vehicleloan.app.demo.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vehicleloan.app.demo.main.model.Customer;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.serviceInterface.LoanApplicationServiceInterface;

@CrossOrigin("*")
@RestController
public class LoanApplicationController {
	
	@Autowired
	LoanApplicationServiceInterface lasi;
	
	@PostMapping("/saveAppForm")
	public ResponseEntity<Customer>  saveAppForm(@RequestPart("user") String userJson, 
														@RequestPart("addressProff") MultipartFile addressProff,
														@RequestPart("panCard") MultipartFile panCard,
														@RequestPart("IncomeTax") MultipartFile IncomeTax,
														@RequestPart("adharcard") MultipartFile adharcard,
														@RequestPart("photo") MultipartFile photo,
														@RequestPart("signature") MultipartFile signature,
														@RequestPart("thumb") MultipartFile thumb,
														@RequestPart("bankCheque") MultipartFile bankCheque,
														@RequestPart("salarySlips") MultipartFile salarySlips) throws IOException
	{
		Customer e= lasi.saveLoanApp(userJson,addressProff,panCard,IncomeTax,adharcard,photo,signature,thumb,bankCheque,salarySlips);
		return new ResponseEntity<Customer>(e,HttpStatus.CREATED);
	}
	
	@GetMapping("getDataForCM")
	 public Iterable getDataForCM()
	 {
		Iterable list=lasi.getDataForCM();
		return list;
	 }

}

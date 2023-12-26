package com.vehicleloan.app.demo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vehicleloan.app.demo.main.model.SanctionLetter;
import com.vehicleloan.app.demo.main.serviceInterface.SanctionServiceInterface;

@CrossOrigin("*")
@RestController
public class SanctionController {
	
	@Autowired
	SanctionServiceInterface ssi;
	
	@PostMapping("savesanction")
	
	public ResponseEntity<SanctionLetter>  savesanction(@RequestBody SanctionLetter s )
	{
		SanctionLetter e= ssi.savesanction(s);
		return new ResponseEntity<SanctionLetter>(e,HttpStatus.CREATED);
	} 

}

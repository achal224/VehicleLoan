package com.vehicleloan.app.demo.main.controller;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
//	
//	@GetMapping("/getSanction_pdf/{customerId}")
//	public ResponseEntity<InputStreamResource> exposeSanction_pdf(@PathVariable int customerId)
//	{
//	ByteArrayInputStream byteArrayInputPdf=	ssi.createSanctionPdf(customerId);
//	
//	HttpHeaders headers=new HttpHeaders();
//	headers.add("Content-Disposition","inline;filename=sanction.pdf");
//	return ResponseEntity.ok()
//			              .headers(headers)
//			               .contentType(MediaType.APPLICATION_PDF)
//			               .body(new InputStreamResource(byteArrayInputPdf));
//	}


}

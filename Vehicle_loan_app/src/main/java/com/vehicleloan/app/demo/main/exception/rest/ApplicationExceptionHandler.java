package com.vehicleloan.app.demo.main.exception.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vehicleloan.app.demo.main.exception.EnquiryNotFound;
import com.vehicleloan.app.demo.main.model.ErrorResponse;

public class ApplicationExceptionHandler {

	@ExceptionHandler(EnquiryNotFound.class)
	public ResponseEntity<ErrorResponse> handleStudentNotFound()
	{
		Date d=new Date();
	
		return new ResponseEntity<ErrorResponse> (new ErrorResponse(404,"Enquery not Found",d),HttpStatus.NOT_FOUND);
		
	}
}

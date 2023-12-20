package com.vehicleloan.app.demo.main.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicleloan.app.demo.main.HomeRepository.CustomerRepository;
import com.vehicleloan.app.demo.main.model.Customer;
import com.vehicleloan.app.demo.main.serviceInterface.LoanApplicationServiceInterface;

@Service
public class LoanApplicationServiceImp implements LoanApplicationServiceInterface {
	
	@Autowired
	CustomerRepository cr;

	@Override
	public Customer saveLoanApp(String userJson, MultipartFile addressProff, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile adharcard, MultipartFile photo, MultipartFile signature,
			MultipartFile thumb, MultipartFile bankCheque, MultipartFile salarySlips) {
		
		ObjectMapper mapper=new ObjectMapper();
		
		try {
			Customer c =mapper.readValue(userJson, Customer.class);
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		 
		return null;
	}
	
	

}

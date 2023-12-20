package com.vehicleloan.app.demo.main.serviceImp;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicleloan.app.demo.main.HomeRepository.CustomerRepository;
import com.vehicleloan.app.demo.main.model.AllPersonalDocs;
import com.vehicleloan.app.demo.main.model.Customer;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.serviceInterface.LoanApplicationServiceInterface;

@Service
public class LoanApplicationServiceImp implements LoanApplicationServiceInterface {
	
	@Autowired
	CustomerRepository cr;

	@Override
	public Customer saveLoanApp(String userJson, MultipartFile addressProff, MultipartFile panCard,
			MultipartFile incomeTax, MultipartFile adharcard, MultipartFile photo, MultipartFile signature,
			MultipartFile thumb, MultipartFile bankCheque, MultipartFile salarySlips) throws IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		
		try
		{
			Customer c =mapper.readValue(userJson, Customer.class);	
			Optional<Customer> loanApp=	cr.findByCustomerEmail(c.getCustomerEmail());
					if(loanApp.isEmpty())
			       {
			AllPersonalDocs a=new AllPersonalDocs();
			a.setAddressProff(addressProff.getBytes());
			a.setPanCard(panCard.getBytes());
			a.setIncomeTax(incomeTax.getBytes());
			a.setAdharcard(adharcard.getBytes());
			a.setPhoto(photo.getBytes());
			a.setSignature(signature.getBytes());
			a.setThumb(thumb.getBytes());
			a.setSalarySlips(salarySlips.getBytes());
			a.setBankCheque(bankCheque.getBytes());
			c.setAllpersonalDocs(a);
			c.setLoanAppStatus("Created");
			return cr.save(c);
			       }
		else 
			{
						 return null;
			}
			}
		catch (JsonMappingException e) 
		{
			e.printStackTrace();
		} 
		catch (JsonProcessingException e) 
		{
			e.printStackTrace();
		}
	
		 
		
		return null;
	}

	@Override
	public Iterable getDataForCM() {
		List<Customer> loanapp =cr.findAllByLoanAppStatus("Created");
		return loanapp;
	}
	
	

}

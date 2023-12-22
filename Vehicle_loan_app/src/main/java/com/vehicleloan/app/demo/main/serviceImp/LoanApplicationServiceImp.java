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
import com.vehicleloan.app.demo.main.exception.EnquiryNotFound;
import com.vehicleloan.app.demo.main.exception.LoanAppNotFound;
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
	public Iterable viewAppToREAndOE() {
		List<Customer> loanapp =cr.findAllByLoanAppStatus("Created");
		return loanapp;
	}
	
	@Override
	public Customer verify(int customerId) {
		Optional<Customer> c=cr.findById(customerId);
		return c.get();
	}

	@Override
	public Customer setLoanStatus(int customerId, String loanAppStatus) {
		Optional<Customer> l=cr.findById(customerId);
		if(l.isPresent())
		{
			Customer ld=l.get();
 	    ld.setLoanAppStatus(loanAppStatus);;
		
 	    return  cr.save(ld);
 	    
		}
		else 
		{
			throw new LoanAppNotFound("Loan Application Detail you are serching is not present");
	    }
	}

	@Override
	public Iterable viewAppToCM() {
		List<Customer> loanapp =cr.findAllByLoanAppStatus("Approved_by_OE");
		return loanapp;
	}


	@Override
	public Customer sendForSanction(int customerId) {
		Optional<Customer> c=cr.findById(customerId);
		Customer cust=c.get();
		int p=cust.getCustomerTotalLoanRequired();
		int n=(cust.getLoanDuration())*12;
		double r=8/12;
		double emi=p*r*Math.pow(1+r, n)/(Math.pow(1+r, n)-1);
		cust.setEmi(emi);
		cr.save(cust);
		return cust;
	}

	
	
	

}

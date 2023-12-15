package com.vehicleloan.app.demo.main.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vehicleloan.app.demo.main.HomeRepository.EnquiryDetailsRepository;
import com.vehicleloan.app.demo.main.exception.EnquiryNotFound;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.serviceInterface.EnquiryServiceInterface;

@Service
public class EnquiryServiceImp implements EnquiryServiceInterface {
	
	@Autowired
	EnquiryDetailsRepository er;

	@Override
	public EnquiryDetails saveEnquiry(EnquiryDetails ed) {
	 Optional<EnquiryDetails> opEnquiry=	er.findByEmail(ed.getEmail());
	       if(opEnquiry.isEmpty())
	       {
	    	   ed.setEnquiryStatus("Register");
	    	   return er.save(ed);
	       }
	       else {
	    	   // Throw new EnquiryAlreadyRegisteredException()
	    	   return null;
	       }
		
	}

	@Override
	public Iterable displayAllData() {
		return (List<EnquiryDetails>) er.findAll();
	}

	@Override
	public EnquiryDetails getByid(int cid) {
		
		Optional<EnquiryDetails> e=er.findById(cid);
		if(e.isPresent())
		{
		EnquiryDetails ed=e.get();
 	    ed.setEnquiryStatus("Required_cibil_Score");
		
 	  return  er.save(ed);
 	    
		}
		else 
		{
			throw new EnquiryNotFound("Enquiry Detail you are serching is not present");
	    }
	}

	@Override
	public Iterable getallRegisteredEnquiry() {
		 Optional<EnquiryDetails> opEnquiry=er.findAllByEnquiryStatus("Required_cibil_Score");
		    if(opEnquiry.isPresent())
		    {
				return (List<EnquiryDetails>) er.findAll();

		    }
		    else {
		    	   // Throw new EnquiryAlreadyRegisteredException()
		    	   return null;
		       }
	}
	
	

}

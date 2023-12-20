package com.vehicleloan.app.demo.main.serviceImp;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vehicleloan.app.demo.main.HomeRepository.EnquiryDetailsRepository;
import com.vehicleloan.app.demo.main.exception.EnquiryNotFound;
import com.vehicleloan.app.demo.main.model.Cibil;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.serviceInterface.EnquiryServiceInterface;

@Service
public class EnquiryServiceImp implements EnquiryServiceInterface {
	
	@Autowired
	EnquiryDetailsRepository er;
    private static final Random CIBIL_RANDOM=new Random();
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
	public Iterable viewEnquiryForRM() {
		List<EnquiryDetails> opEnquiry=er.findAllByEnquiryStatusOrEnquiryStatus("Register","Approved");
		return opEnquiry;
	}

	@Override
	public EnquiryDetails RequiredcibilScore(int cid) {
		
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
		List<EnquiryDetails> opEnquiry=er.findAllByEnquiryStatus("Required_cibil_Score");
		return opEnquiry;
	}

	@Override
	public void setCibil(int cid) {
		Optional<EnquiryDetails> e=er.findById(cid);
		if(e.isPresent())
		{
		      Cibil cibil=new Cibil();
		      cibil.setCibilScore(CIBIL_RANDOM.nextInt(300,900));
		      cibil.setStatus("Created");
		      if(cibil.getCibilScore()<700) {
		    	cibil.setRemark("Poor cibil score..!");
		      }
		      else if(cibil.getCibilScore()<900) {
			    	cibil.setRemark("Good cibil score..!");
		      }	
		      
		     EnquiryDetails ed=e.get();
		     ed.setCibilSCore(cibil);
            er.save(ed);
		}
		
	}

	@Override
	public EnquiryDetails setFinalSatatus(int cid, String enquiryStatus) {
		
		Optional<EnquiryDetails> e=er.findById(cid);
		if(e.isPresent())
		{
		EnquiryDetails ed=e.get();
 	    ed.setEnquiryStatus(enquiryStatus);
		
 	    return  er.save(ed);
 	    
		}
		else 
		{
			throw new EnquiryNotFound("Enquiry Detail you are serching is not present");
	    }
	}

	@Override
	public Iterable getallrejectedEnquiry() {
		List<EnquiryDetails> opEnquiry=er.findAllByEnquiryStatus("Rejected");
		return opEnquiry;
	}

	@Override
	public EnquiryDetails sendForLoanApplication(int cid) {
		Optional<EnquiryDetails> e=er.findById(cid);
		return e.get();
	}
	
	

}

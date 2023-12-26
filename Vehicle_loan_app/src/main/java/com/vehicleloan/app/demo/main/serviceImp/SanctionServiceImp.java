package com.vehicleloan.app.demo.main.serviceImp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.vehicleloan.app.demo.main.HomeRepository.CustomerRepository;
import com.vehicleloan.app.demo.main.HomeRepository.EnquiryDetailsRepository;
import com.vehicleloan.app.demo.main.HomeRepository.SanctionRepo;
import com.vehicleloan.app.demo.main.model.Customer;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.model.PDF_Generator;
import com.vehicleloan.app.demo.main.model.SanctionLetter;
import com.vehicleloan.app.demo.main.serviceInterface.SanctionServiceInterface;

@Service
public class SanctionServiceImp implements SanctionServiceInterface {
	
	@Autowired
	SanctionRepo sr;
	
	@Autowired
	CustomerRepository lpr;

	@Override
	public SanctionLetter savesanction(SanctionLetter s) {
		return sr.save(s);
	}

	@Override
	public ByteArrayInputStream createSanctionPdf(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public ByteArrayInputStream createSanctionPdf(int customerId) {
//		Document docs= new Document();
//		ByteArrayOutputStream output = new ByteArrayOutputStream();
//		
//		Optional<Customer> oploan = lpr.findById(customerId); 
//		Customer loanDetails=oploan.get();
//	if(loanDetails.getSanctionletter()!=null)
//		{
//	ByteArrayOutputStream newoutput=	PDF_Generator.generateSanctionLetter(docs, output,loanDetails);
//	loanDetails.getSanctionletter().setPdf(null);
//	lpr.save(loanDetails);
//	return new ByteArrayInputStream(newoutput.toByteArray());
//	}
//	else {
//		//sanctionDetailsnotfoundCalculatedException();
//		return null;
//	}
//	
//
//		
//		
//		return null;
//	}


}

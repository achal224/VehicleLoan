package com.vehicleloan.app.demo.main.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vehicleloan.app.demo.main.HomeRepository.EnquiryDetailsRepository;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.serviceInterface.EnquiryServiceInterface;

@Service
public class EnquiryServiceImp implements EnquiryServiceInterface {
	
	@Autowired
	EnquiryDetailsRepository er;

	@Override
	public EnquiryDetails saveEnquiry(EnquiryDetails ed) {
	
		return er.save(ed);
	}

	@Override
	public Iterable displayAllData() {
		return (List<EnquiryDetails>) er.findAll();
	}

	@Override
	public EnquiryDetails getByid(int cID) {
		
		Optional<EnquiryDetails> e=er.findById(cID);
		return e.get();
	}
	
	

}

package com.vehicleloan.app.demo.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.app.demo.main.HomeRepository.CustomerRepository;
import com.vehicleloan.app.demo.main.HomeRepository.EnquiryDetailsRepository;
import com.vehicleloan.app.demo.main.HomeRepository.SanctionRepo;
import com.vehicleloan.app.demo.main.model.Customer;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.model.SanctionLetter;
import com.vehicleloan.app.demo.main.serviceInterface.SanctionServiceInterface;

@Service
public class SanctionServiceImp implements SanctionServiceInterface {
	
	@Autowired
	SanctionRepo sr;

	@Override
	public SanctionLetter savesanction(SanctionLetter s) {
		return sr.save(s);
	}


}

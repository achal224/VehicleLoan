package com.vehicleloan.app.demo.main.serviceInterface;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.vehicleloan.app.demo.main.model.Customer;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;

public interface LoanApplicationServiceInterface {

	public Customer saveLoanApp(String userJson, MultipartFile addressProff, MultipartFile panCard, MultipartFile incomeTax,
			MultipartFile adharcard, MultipartFile photo, MultipartFile signature, MultipartFile thumb,
			MultipartFile bankCheque, MultipartFile salarySlips) throws IOException;

	public Iterable viewAppToREAndOE();

	public Customer setLoanStatus(int customerId, String loanAppStatus);

	public Iterable viewAppToCM();

	public Customer verify(int customerId);

	public Customer sendForSanction(int customerId);

	

}

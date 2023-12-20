package com.vehicleloan.app.demo.main.serviceInterface;

import com.vehicleloan.app.demo.main.model.EnquiryDetails;

public interface EnquiryServiceInterface {

	public EnquiryDetails saveEnquiry(EnquiryDetails ed);

	public Iterable viewEnquiryForRM();

	public EnquiryDetails RequiredcibilScore(int cid);

	public Iterable getallRegisteredEnquiry();

	public void setCibil(int cid);

	public EnquiryDetails setFinalSatatus(int cid, String enquiryStatus);

	public Iterable getallrejectedEnquiry();

	public EnquiryDetails sendForLoanApplication(int cid);

	

}

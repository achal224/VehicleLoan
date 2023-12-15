package com.vehicleloan.app.demo.main.serviceInterface;

import com.vehicleloan.app.demo.main.model.EnquiryDetails;

public interface EnquiryServiceInterface {

	public EnquiryDetails saveEnquiry(EnquiryDetails ed);

	public Iterable displayAllData();

	public EnquiryDetails getByid(int cid);

	public Iterable getallRegisteredEnquiry();

}

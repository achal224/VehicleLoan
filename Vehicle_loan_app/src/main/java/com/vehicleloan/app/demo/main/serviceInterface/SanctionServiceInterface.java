package com.vehicleloan.app.demo.main.serviceInterface;

import java.io.ByteArrayInputStream;

import com.vehicleloan.app.demo.main.model.SanctionLetter;

public interface SanctionServiceInterface {

	public SanctionLetter savesanction(SanctionLetter s);

	public ByteArrayInputStream createSanctionPdf(int customerId);


}

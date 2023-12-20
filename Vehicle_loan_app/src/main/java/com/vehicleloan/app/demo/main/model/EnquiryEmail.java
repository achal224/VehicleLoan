package com.vehicleloan.app.demo.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnquiryEmail {

	private String toEmail;
	private String subject;
	private String textMsg;

}

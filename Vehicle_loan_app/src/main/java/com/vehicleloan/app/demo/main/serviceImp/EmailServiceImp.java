package com.vehicleloan.app.demo.main.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.vehicleloan.app.demo.main.HomeRepository.EnquiryDetailsRepository;
import com.vehicleloan.app.demo.main.model.EnquiryDetails;
import com.vehicleloan.app.demo.main.model.EnquiryEmail;
import com.vehicleloan.app.demo.main.serviceInterface.EmailService;


@Service
public class EmailServiceImp implements EmailService {
	@Autowired
	EnquiryDetailsRepository er;
	
	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}") private String fromMail;

	@Override
	public void sendRejectedEmail(int cid) {
		
		Optional<EnquiryDetails> enq=er.findById(cid);
		EnquiryDetails e1=enq.get();
		
		SimpleMailMessage mailmessage=new SimpleMailMessage();
		mailmessage.setFrom(fromMail);
		mailmessage.setTo(e1.getEmail());
		mailmessage.setSubject("Enquiry Rejection mail");
		mailmessage.setText("Thank you for appling for Enquiry. Sorry to inform your enquiry request is rejected as low cibil Score");
		
		sender.send(mailmessage);
	}


}

package com.vehicleloan.app.demo.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class EnquiryDetails {
	
	@Id
	@GeneratedValue(strategy =jakarta.persistence.GenerationType.AUTO)
	private int cid;
	private String firstName;
	private  String lastName;
	private int age;
	private String email;
	private long mobileNo;
	private long pancardNo;
	@OneToOne(cascade = CascadeType.MERGE.DETACH.REFRESH.REMOVE)
	private Cibil cibilSCore;
	private String enquiryStatus;
	private int loanammount;

}

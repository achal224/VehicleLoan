package com.vehicleloan.app.demo.main.model;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class SanctionLetter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	@CreationTimestamp
	private String sanctionDtae;
	private String applicationName;
	private double contactDetails;
	
	private double loanAmtSanctioned;//patch
	private String interstType;//dropdown simple and compound
	private int rateofInterst;//fixed string interpolation {{}}
	private int loantenure;//patch
	private double monthlyEmiAmount;
	private String modeOfPayment;// fixed online
	private String remarks;//input box
	
	@Lob
	@Column(length = 999999999)
	private byte[] pdf;
	private String status;//fixed loan sanctioned
	
}

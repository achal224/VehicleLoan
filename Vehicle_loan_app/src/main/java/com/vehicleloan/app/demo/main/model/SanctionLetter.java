package com.vehicleloan.app.demo.main.model;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private String producthomeequity;
	private double loanAmtSanctioned;
	private String interstType;
	private int rateofInterst;
	private int loantenure;
	private double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsCondition;
	private String status;
	
}

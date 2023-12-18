package com.vehicleloan.app.demo.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class CurrentLoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int currentloanId;
	private int currentloanNo;
	@OneToOne(cascade = CascadeType.ALL)
	private EMIDetails Emidetails;
	
	private double loanAmount;
	private int rateOfInterst;
	private int tenure;
	private double totalAmountToBePaid;
	private int processingFees;
	private double totalInterst;
	private String sanctiondate;
	private String remark;
	private String status;
	
}

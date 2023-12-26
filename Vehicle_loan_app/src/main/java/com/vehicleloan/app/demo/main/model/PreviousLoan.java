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
public class PreviousLoan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int previousLoanId;
	private double previousLoanAmount;
	private int previousLoanTenure;
	private double previousLoanpaidAmount;
	private double previousLoanremainingAmount;
	private int previousLoanDeafaulterCount;
	private String previousLoanStatus;
	private String previousLoanRemark;
	

}

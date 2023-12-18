package com.vehicleloan.app.demo.main.model;

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
public class GurantorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int GurantorId;
	private String GurantorName;
	private String GurantordateOfBirth;
	private String GurantorrealtionshipwithCustomer;
	private long GurantorMobileNumber;
	private long GurantorAdharCardNo;
	private String GurantorMortgagedetails;
	private String GurantorJobdetails;
	private String GurantorLocalAddress;
	private String GurantorPermanentAddress;
	

}

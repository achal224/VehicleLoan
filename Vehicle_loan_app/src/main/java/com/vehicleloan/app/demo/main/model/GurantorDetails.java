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
	private int gurantorId;
	private String gurantorName;
	private String gurantordateOfBirth;
	private String gurantorrealtionshipwithCustomer;
	private long gurantorMobileNumber;
	private long gurantorAdharCardNo;
	private String gurantorMortgagedetails;
	private String gurantorJobdetails;
	private String gurantorLocalAddress;
	private String gurantorPermanentAddress;
	

}

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
public class CustomerVerification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int verificationId;
	private String verificationDate;
	private String status;
	private String remarks;

}

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
public class DependentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dependentId;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private int noOffFamilyMember;
	private int noOfChild;
	private String maritalStatus;
	private String dependentMember;
	private double familyIncome;
	
}

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
public class Profession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int professionId;
	private String professionType;
	private double professionSalary;
	private String professionSalaryType;
	private String professionWorkingPeriod;
	private String professionDesignation;
	private byte[] professionSalarySlips;
}

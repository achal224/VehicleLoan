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
public class EductionalInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eductionId;
	private String eductionType;

}

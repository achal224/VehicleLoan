package com.vehicleloan.app.demo.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cibil {
	
	@Id
	@GeneratedValue(strategy =jakarta.persistence.GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String remark;

}

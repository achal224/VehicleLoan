package com.vehicleloan.app.demo.main.model;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cibil {
	
	@Id
	@GeneratedValue(strategy =jakarta.persistence.GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	@CreationTimestamp
	private String cibilScoreDateTime;
	private String status;
	private String remark;

}

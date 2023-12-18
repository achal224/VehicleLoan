package com.vehicleloan.app.demo.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class AllPersonalDocs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	@Lob
	private byte[] addressProff;
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] IncomeTax;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] thumb;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] salarySlips;
}
    

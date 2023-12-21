package com.vehicleloan.app.demo.main.model;

import jakarta.persistence.Column;
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
	@Column(length = 999999999)
	private byte[] addressProff;
	@Lob
	@Column(length = 999999999)
	private byte[] panCard;
	@Lob
	@Column(length = 999999999)
	private byte[] IncomeTax;
	@Lob
	@Column(length = 999999999)
	private byte[] adharcard;
	@Lob
	@Column(length = 999999999)
	private byte[] photo;
	@Lob
	@Column(length = 999999999)
	private byte[] signature;
	@Lob
	@Column(length = 999999999)
	private byte[] thumb;
	@Lob
	@Column(length = 999999999)
	private byte[] bankCheque;
	@Lob
	@Column(length = 999999999)
	private byte[] salarySlips;
}
    

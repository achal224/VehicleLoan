package com.vehicleloan.app.demo.main.HomeRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicleloan.app.demo.main.model.EnquiryDetails;

public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer> {

 public	Optional<EnquiryDetails> findByEmail(String email);

public Optional<EnquiryDetails> findAllByEnquiryStatus(String string);

}

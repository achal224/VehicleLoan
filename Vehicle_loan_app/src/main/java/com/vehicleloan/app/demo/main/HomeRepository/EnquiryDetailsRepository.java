package com.vehicleloan.app.demo.main.HomeRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicleloan.app.demo.main.model.EnquiryDetails;

public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer> {

 public	Optional<EnquiryDetails> findByEmail(String email);

public List<EnquiryDetails> findAllByEnquiryStatus(String string);

public List<EnquiryDetails> findAllByEnquiryStatusOrEnquiryStatus(String string, String string2);

}

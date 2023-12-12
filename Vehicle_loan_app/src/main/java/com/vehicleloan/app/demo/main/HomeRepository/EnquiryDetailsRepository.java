package com.vehicleloan.app.demo.main.HomeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicleloan.app.demo.main.model.EnquiryDetails;

public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer> {

}

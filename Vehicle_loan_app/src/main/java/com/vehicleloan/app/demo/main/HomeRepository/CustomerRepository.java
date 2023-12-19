package com.vehicleloan.app.demo.main.HomeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicleloan.app.demo.main.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public List<Customer> findAllByLoanAppStatus(String string);

}

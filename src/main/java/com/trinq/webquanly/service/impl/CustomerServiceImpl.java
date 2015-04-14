package com.trinq.webquanly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinq.webquanly.domain.Customer;
import com.trinq.webquanly.domain.repository.CustomerRepository;
import com.trinq.webquanly.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
  
  	@Autowired
	private CustomerRepository customerRepository;
  
   public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}
  
  
  
  
}

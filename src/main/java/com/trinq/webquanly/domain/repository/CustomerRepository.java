package com.trinq.webquanly.domain.repository;


import java.util.List;

import com.trinq.webquanly.domain.Customer;

public interface CustomerRepository {

	List<Customer> getAllCustomers();
   void addCustomer (Customer customer);
}

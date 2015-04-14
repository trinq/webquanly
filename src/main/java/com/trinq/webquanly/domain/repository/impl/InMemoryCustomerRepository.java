package com.trinq.webquanly.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.trinq.webquanly.domain.Customer;
import com.trinq.webquanly.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository  {
  
    private List<Customer> listOfCustomers = new ArrayList<Customer>();
    
 	 public InMemoryCustomerRepository() {
			
      	Customer customer = new Customer("C123","Congty ABCZ ","123 truong dinh");
         Customer customer1 = new Customer("C124","Congty LZS ","44 truong dinh");
      	Customer customer2 = new Customer("C124","Congty LZS ","44 truong dinh");
      	
      	listOfCustomers.add(customer);
      	listOfCustomers.add(customer1);
      	listOfCustomers.add(customer2);
      
    }

    @Override
    public List<Customer> getAllCustomers() {
       
         
        return listOfCustomers;
    }
  
  
}

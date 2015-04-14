package com.trinq.webquanly.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;  
import com.trinq.webquanly.domain.Customer;
import com.trinq.webquanly.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository  {
     
  	 @Autowired 
    private DataSource dataSource;

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
      
      String sql = "select * from customer";
      JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
      listOfCustomers =
         
        return listOfCustomers;
    }
  
  
}

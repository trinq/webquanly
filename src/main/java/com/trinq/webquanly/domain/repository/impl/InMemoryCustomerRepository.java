package com.trinq.webquanly.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;  
import com.trinq.webquanly.domain.Customer;
import com.trinq.webquanly.domain.repository.CustomerRepository;
import com.trinq.webquanly.domain.mapper.CustomerRowMapper;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository  {
     
  	 @Autowired 
    private DataSource dataSource;

    private List<Customer> listOfCustomers = new ArrayList<Customer>();
    
 	 

    @Override
    public List<Customer> getAllCustomers() {
      
      String selectAllCustomer = "select * from customer";
      JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
      listOfCustomers = jdbcTemplate.query(selectAllCustomer,new CustomerRowMapper());
      return listOfCustomers;
    }
     
     public void addCustomer(Customer customer ) {
    
    	String insertCustomer = "INSERT INTO customer "  
    								+ "(name,address) VALUES (?, ?)";
      JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		jdbcTemplate.update(
      insertCustomer,new Object[]{customer.getName(),customer.getAddress()});
    
    
  }
  
  
}

package com.trinq.webquanly.domain.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;
 
import com.trinq.webquanly.domain.Customer;

public class CustomerRowMapper implements RowMapper<Customer>  {
  
		@Override  
  	   public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setName(rs.getString("name"));
		customer.setAddress(rs.getString("address"));
		return customer;
	}
  
  
  
  
  
  
}

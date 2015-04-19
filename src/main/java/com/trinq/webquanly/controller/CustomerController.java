package com.trinq.webquanly.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.trinq.webquanly.service.CustomerService;
import com.trinq.webquanly.domain.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
  
  @Autowired
  private CustomerService customerService;
  
  @RequestMapping
  public String list(Model model) {
    model.addAttribute("customers", customerService.getAllCustomers());
    return "customers";
  }
  
  @RequestMapping(value="/all")
	public String allCustomers(Model model) {
		model.addAttribute("customers", customerService.getAllCustomers());

		return "customers";
	}
  
   @RequestMapping(value ="/get" ,method= RequestMethod.GET)
   public String	getAddNewCustomerForm(Model model) {
     		Customer newCustomer = new Customer();
      	model.addAttribute("newCustomer",newCustomer);
      	return "addCustomer";
      
   }
   @RequestMapping(value = "/add", method = RequestMethod.POST )
   public String processAddNewCustomerForm(@ModelAttribute( "newCustomer")
			Customer newCustomer) {
     		customerService.addCustomer(newCustomer);
         return "redirect:/customers";
   }
    
    
  	
  
  
  
  
  
  
}

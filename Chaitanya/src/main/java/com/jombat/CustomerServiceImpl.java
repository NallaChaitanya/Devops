package com.jombat;

public class CustomerServiceImpl implements CustomerService {
	 
	public Customer getCustomerById(String customerId) {
		Customer customer = new Customer();
		customer.setId(123);
		customer.setName("Abhimanyu");
		return customer;
	}
}
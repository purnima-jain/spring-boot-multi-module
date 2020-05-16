package com.purnima.jain.customer.domain.service;

import com.purnima.jain.customer.domain.aggregate.Customer;

public interface CustomerService {

	public Customer getCustomerById(Integer customerId);

}

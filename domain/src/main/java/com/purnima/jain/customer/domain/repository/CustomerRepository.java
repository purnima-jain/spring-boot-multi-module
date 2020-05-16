package com.purnima.jain.customer.domain.repository;

import com.purnima.jain.customer.domain.aggregate.Customer;

public interface CustomerRepository {

	public Customer getCustomerById(Integer customerId);

}

package com.purnima.jain.customer.domain.aggregate;

public class Customer {

	private Integer customerId;
	private String customerName;

	public Customer(Integer customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

}

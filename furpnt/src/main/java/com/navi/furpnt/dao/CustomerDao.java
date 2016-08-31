package com.navi.furpnt.dao;

import java.util.List;

import com.navi.furpnt.model.Customer;

public interface CustomerDao {
	 Customer getCustomerByName(String Name);
	void addCustomer(Customer customer);
	List<Customer> viewcustomer();
}

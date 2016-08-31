package com.navi.furpnt.service;

import java.util.List;

import com.navi.furpnt.model.CartItem;
import com.navi.furpnt.model.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	List<Customer> viewcustomer();
	Customer getCustomerByName(String Name);
}

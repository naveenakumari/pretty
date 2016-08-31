package com.navi.furpnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.furpnt.dao.CustomerDao;
import com.navi.furpnt.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		
	}
	@Override
	public List<Customer> viewcustomer() {
	List<Customer> list=customerDao.viewcustomer();
		return list;
	}
	@Override
	public Customer getCustomerByName(String Name) {
		
		return customerDao.getCustomerByName(Name);
	}

}

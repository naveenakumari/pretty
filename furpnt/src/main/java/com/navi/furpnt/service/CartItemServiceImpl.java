package com.navi.furpnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.furpnt.dao.CartItemDao;
import com.navi.furpnt.dao.CustomerDao;
import com.navi.furpnt.model.CartItem;
import com.navi.furpnt.model.Customer;
@Service
public class CartItemServiceImpl {
	@Autowired
	CartItemDao cartitemDao;
	public void addCartitem(CartItem cartitem) {
		cartitemDao.addCartItem(cartitem);
	}	
}

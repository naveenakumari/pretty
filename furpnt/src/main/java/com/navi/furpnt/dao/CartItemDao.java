package com.navi.furpnt.dao;

import org.springframework.stereotype.Repository;

import com.navi.furpnt.model.CartItem;

@Repository
public interface CartItemDao {
	void addCartItem(CartItem cartitem);
	
}

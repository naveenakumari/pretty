package com.navi.furpnt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Cart {
@Id@GeneratedValue
	private int CartId;
	private double grandtotal;
	@OneToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToMany(mappedBy="cart",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<CartItem> cartitem;
	
	public List<CartItem> getCartitem() {
		return cartitem;
	}
	public void setCartitem(List<CartItem> cartitem) {
		this.cartitem = cartitem;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getCartId() {
		return CartId;
	}
	public void setCartId(int cartId) {
		CartId = cartId;
	}
	public double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}
	

}

package com.navi.furpnt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class CartItem {
	@Id@GeneratedValue
	private int CartItemId;
	private int quantity;
	@OneToOne
	@JoinColumn(name="itemId")
	private Item item;
	private double totalprice;
	@ManyToOne
	@JoinColumn(name="CartId")
	private Cart cart;
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public int getCartItemId() {
		return CartItemId;
	}
	public void setCartItemId(int cartItemId) {
		CartItemId = cartItemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	

}

package com.navi.furpnt.model;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {
	@Id@GeneratedValue
	private int customerId;
	@NotEmpty(message="pls enter name")
	private String username;
	@NotEmpty(message="pls enter password")
	private String password;
	@NotEmpty(message="pls enter mail")
	private String emailid;
	private boolean enabled;
	@OneToOne(cascade=CascadeType.ALL)
	
	
	@JoinColumn(name="CartId")
	private Cart cart;
	
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
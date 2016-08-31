package com.navi.furpnt.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserRole {
	@Id
 private int Userid;
 private String authority;
public int getUserid() {
	return Userid;
}
public void setUserid(int userid) {
	Userid = userid;
}
public String getAuthority() {
	return authority;
}
public void setAuthority(String authority) {
	this.authority = authority;
}
 
}

package com.navi.furpnt.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navi.furpnt.model.Cart;
import com.navi.furpnt.model.CartItem;
import com.navi.furpnt.model.Customer;
import com.navi.furpnt.model.UserRole;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	CartItem cartItem;
		public void addCustomer(Customer customer){
			
			Session sesion=sessionFactory.getCurrentSession();
			Transaction tx = sesion.beginTransaction();
			customer.setEnabled(true);
			sesion.save(customer);
			UserRole userRole=new UserRole();
			userRole.setAuthority("ROLE_USER");
			userRole.setUserid(customer.getCustomerId());
			sesion.save(userRole);
			Cart cart=new Cart();
			customer.setCart(cart);//it will assing cart to customer//
			
			tx.commit();
		
	}
		@Override
		public List<Customer> viewcustomer() {
			Session session=sessionFactory.getCurrentSession();
			Transaction transaction=session.beginTransaction();
			List<Customer> list=session.createCriteria(Customer.class).list();
			return list;
		}
		@Override
		public Customer getCustomerByName(String Name) {
			Session session=sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			System.out.println("name="+Name);
			Customer customer=(Customer) session.createCriteria(Customer .class).add(Restrictions.like("username", Name)).uniqueResult();
			Cart cart=customer.getCart();
			
			cartItem.setCart(cart);
			System.out.println("after getting customer"+ customer);
			return customer;
		}

}

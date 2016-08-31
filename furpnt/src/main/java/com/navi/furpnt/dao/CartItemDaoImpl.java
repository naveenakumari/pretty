package com.navi.furpnt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navi.furpnt.model.Cart;
import com.navi.furpnt.model.CartItem;
import com.navi.furpnt.model.UserRole;

@Repository
public class CartItemDaoImpl implements CartItemDao {
	@Autowired
	SessionFactory sessionfactroy;
		public void addCartItem(CartItem cartitem){
			
			Session session=sessionfactroy.getCurrentSession();
			Transaction tx = session.beginTransaction();
			session.save(cartitem);
			
			tx.commit();
		
		}
				}


package com.navi.furpnt.dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navi.furpnt.model.Customer;
import com.navi.furpnt.model.Item;


@Repository
public class ItemDaoImpl implements ItemDao {
	@Autowired
	SessionFactory sessionFactroy;

	public void addItem(Item item){
			 System.out.println("In add item dao impl");
		Session sesion = sessionFactroy.getCurrentSession();
		Transaction tx = sesion.beginTransaction();
		
		sesion.save(item);
		tx.commit();
		System.out.println("item added");
		}
	public List<Item> viewitems(){
		Session session=sessionFactroy.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		List<Item> list=session.createCriteria(Item.class).list();
		System.out.println("daoimpl" +list);
		return list;
	}

 public void deleteItem(int id) {
	Session session=sessionFactroy.getCurrentSession();
	Transaction transaction=session.beginTransaction();
	Item item=session.get(Item.class,new Integer(id));
	session.delete(item);
	transaction.commit();
	System.out.println("Item deleted was:"+item.getItemName());
}

public Item getItembyId(int id) {
	Session session=sessionFactroy.getCurrentSession();
	Transaction transaction=session.beginTransaction();
	Item item=session.load(Item.class, new Integer(id));
	
	return item;
}
public void updateItem(Item item) {
	Session session=sessionFactroy.getCurrentSession();
	Transaction transaction=session.beginTransaction();
	session.update(item);
	transaction.commit();
	System.out.println("edit has done");
	
	
}

		
		
	}
	


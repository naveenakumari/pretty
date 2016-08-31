package com.navi.furpnt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navi.furpnt.model.Item;

@Repository
public class CategoryDaoImpl  implements CategoryDao {
	@Autowired
	SessionFactory sessionFactroy;
	
	@Override
	public List<Item> getProductByCategory(String category) {
		Session session=sessionFactroy.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		List<Item> list=session.createCriteria(Item.class)
				.add(Restrictions.like("category",category)).list();
	
	return list;
	}
	
}
			
			



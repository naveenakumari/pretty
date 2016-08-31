package com.navi.furpnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.furpnt.dao.CustomerDao;
import com.navi.furpnt.dao.ItemDao;
import com.navi.furpnt.model.Customer;
import com.navi.furpnt.model.Item;
@Service
public class ItemServiceImpl implements ItemService{
@Autowired
	ItemDao itemDao;
	public void addItem(Item item){
		System.out.println("Itemserviveimpl.additem()");
		itemDao.addItem(item);
	}
	public List<Item> viewitems() {
		List<Item> list=itemDao.viewitems();	
		return itemDao.viewitems();
	}
	
	public void deleteItem(int id) {
		itemDao.deleteItem(id);
		
	}

	public Item getItembyId(int id) {
	
		return itemDao.getItembyId(id);
	}
	public void updateItem(Item item) {
		itemDao.updateItem(item);
	}
}

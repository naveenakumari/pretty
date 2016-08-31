package com.navi.furpnt.dao;

import java.util.List;


import com.navi.furpnt.model.Item;

public interface ItemDao {
	void addItem(Item item);
	List<Item> viewitems();
  void deleteItem(int id);
  Item getItembyId(int id);
  void updateItem(Item item);
}

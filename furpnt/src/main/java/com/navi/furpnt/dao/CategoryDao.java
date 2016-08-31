package com.navi.furpnt.dao;

import java.util.List;

import com.navi.furpnt.model.Item;

public interface CategoryDao {
List<Item> getProductByCategory(String category);	

}

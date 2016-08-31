package com.navi.furpnt.service;

import java.util.List;

import com.navi.furpnt.model.Item;

public interface CategoryService {
	List<Item> getProductByCategory(String category);
}

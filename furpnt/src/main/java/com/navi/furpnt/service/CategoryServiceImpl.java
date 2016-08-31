package com.navi.furpnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.furpnt.dao.CategoryDao;
import com.navi.furpnt.model.Item;
@Service
public class CategoryServiceImpl implements CategoryService{
@Autowired
CategoryDao categoryDao;
	public List<Item> getProductByCategory(String category) {
	List<Item> list=categoryDao.getProductByCategory(category);
		return list;
	}

}

package com.vn.daoImpl;

import java.util.List;

import com.vn.dao.CategoryDao;
import com.vn.entities.Category;

public class CategoryImpl implements CategoryDao {

	List<Category> categorys;

	public Integer delete(int id) {
		categorys.remove(id);
		return 1;
	}

	public Category create(Category category) {
		categorys.add(category);
		return categorys.get(category.getCategoryId());
	}

	public Category update(Category category) {

		categorys.get(category.getCategoryId()).setCategoryName(category.getCategoryName());
		return categorys.get(category.getCategoryId());

	}

	public List<Category> findAll() {
		return categorys;
	}

	public Category findById(int id) {
		return categorys.get(id);
	}

}

package com.vn.dao;

import java.util.List;

import com.vn.entities.Author;

public interface AuthorDao {

	public Integer delete(int id);

	public Author create(Author author);

	public Author update(Author author);

	public List<Author> findAll();

	public Author findById(int id);
}

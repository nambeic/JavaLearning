package com.vn.dao;

import java.util.List;

import com.vn.entities.Book;

public interface BookDao {

	public Integer delete(int id);

	public Book create(Book book);

	public Book update(Book book);

	public List<Book> findAll();

	public Book findById(int id);
}

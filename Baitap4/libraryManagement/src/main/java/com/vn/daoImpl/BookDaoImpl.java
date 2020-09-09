package com.vn.daoImpl;

import java.util.List;

import com.vn.dao.BookDao;
import com.vn.entities.Book;

public class BookDaoImpl implements BookDao {

	List<Book> books;

	public Integer delete(int id) {
		books.remove(id);
		return 1;
	}

	public Book create(Book book) {
		books.add(book);
		return books.get(book.getBookId());
	}

	public Book update(Book book) {

		books.get(book.getBookId()).setBookName(book.getBookName());
		books.get(book.getBookId()).setAuthorId(book.getAuthorId());
		books.get(book.getBookId()).setCategoryId(book.getCategoryId());
		return books.get(book.getBookId());
	}

	public List<Book> findAll() {
		return books;
	}

	public Book findById(int id) {
		return books.get(id);
	}

}

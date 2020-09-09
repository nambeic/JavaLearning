package com.vn.daoImpl;

import java.util.List;

import com.vn.dao.AuthorDao;
import com.vn.entities.Author;

public class AuthorDaoImpl implements AuthorDao {

	List<Author> authors;

	public Integer delete(int id) {
		authors.remove(id);
		return 1;
	}

	public Author create(Author author) {
		authors.add(author);
		return authors.get(author.getAuthorId());
	}

	public Author update(Author author) {

		authors.get(author.getAuthorId()).setAuthorName(author.getAuthorName());
		authors.get(author.getAuthorId()).setAuthorNationality(author.getAuthorNationality());
		authors.get(author.getAuthorId()).setAuthorAge(author.getAuthorAge());
		return authors.get(author.getAuthorId());
	}

	public List<Author> findAll() {
		return authors;
	}

	public Author findById(int id) {
		return authors.get(id);
	}

}

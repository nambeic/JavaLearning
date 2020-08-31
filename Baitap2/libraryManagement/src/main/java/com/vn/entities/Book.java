package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Book extends Object implements Serializable{

	private static final long serialVersionUID = -8427500979301875909L;
	
	private Integer bookId;
	private String bookName;
	private Integer authorId;
	private Integer categoryId;
}

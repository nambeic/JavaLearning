package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Author extends Object implements Serializable{

	private static final long serialVersionUID = -569128000192229432L;
	
	private Integer authorId;
	private String authorName;
	private String authorNationality;
	private Integer authorAge;

}

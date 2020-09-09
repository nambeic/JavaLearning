package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Category extends Object implements Serializable {

	private static final long serialVersionUID = -4534557616213069026L;

	private Integer categoryId;
	private String categoryName;

}

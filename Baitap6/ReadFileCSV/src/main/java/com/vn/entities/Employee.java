package com.vn.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee extends Object implements Serializable {

	private static final long serialVersionUID = -3442597094170712198L;

	private Integer id;
	private String name;
	private Integer age;
	private Integer salary;
	private String birthOfDate;
}

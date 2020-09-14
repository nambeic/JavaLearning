package com.vn.processor;

import java.util.List;

import com.vn.entities.Employee;

public class main {

	public static void main(String[] args) {

		GetDataFromCSV csv = new GetDataFromCSV();
		List<Employee> employees = csv.getData();
		DataHandle handle = new DataHandle();

		csv.showAllEmployee(employees);

		System.out.println("---------------Name Ascending---------------");
		csv.showAllEmployee(handle.nameSort(employees));

		System.out.println("---------------Salary Descending---------------");
		csv.showAllEmployee(handle.salarySort(employees));

		System.out.println("---------------Name contains N---------------");
		csv.showAllEmployee(handle.nameContainsN(employees));

		System.out.println("---------------Age Salary---------------");
		csv.showAllEmployee(handle.ageSalarySort(employees));

	}

}

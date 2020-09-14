package com.vn.processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.vn.entities.Employee;

public class DataHandle {

	public List<Employee> salarySort(List<Employee> employees) {
		Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				return s2.getSalary().compareTo(s1.getSalary());
			}
		});
		return employees;
	}

	public List<Employee> nameSort(List<Employee> employees) {
		Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				return s1.getName().compareToIgnoreCase(s2.getName());
			}
		});
		return employees;
	}

	public List<Employee> ageSalarySort(List<Employee> employees) {

		Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				if (s1.getAge().compareTo(s2.getAge()) == 0) {
					return s2.getSalary().compareTo(s1.getSalary());
				} else {
					return s1.getAge().compareTo(s2.getAge());
				}

			}
		});
		return employees.subList(0, 3);
	}

	public List<Employee> nameContainsN(List<Employee> employees) {

		List<Employee> employeesNew = new ArrayList<Employee>();

		for (Employee emp : employees) {
			if (emp.getName().contains("N")) {
				employeesNew.add(emp);
			}
		}
		return employeesNew;
	}

}

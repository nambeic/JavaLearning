package com.vn.processor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.vn.entities.Employee;

public class GetDataFromCSV {

	public List<Employee> getData() {

		List<Employee> employees = new ArrayList<Employee>();

		try {
			List<String> lines = Files.readAllLines(new File("D:\\Employee_CSV.csv").toPath());
			for (String line : lines) {
				Employee emp = new Employee();
				String[] words = line.split(",");
				emp.setId(Integer.parseInt(words[0]));
				emp.setName(words[1]);
				emp.setAge(Integer.parseInt(words[2]));
				emp.setSalary(Integer.parseInt(words[3]));
				emp.setBirthOfDate(words[4]);
				employees.add(emp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;

	}

	public void showAllEmployee(List<Employee> employees) {
		for (Employee emp : employees) {
			System.out.println("ID:\t" + emp.getId());
			System.out.println("Name:\t" + emp.getName());
			System.out.println("Age:\t" + emp.getAge());
			System.out.println("Salary:\t" + emp.getSalary());
			System.out.println("BD:\t" + emp.getBirthOfDate().replaceAll("/", "-") + "\r\n");
		}
	}
}

package com.vn.bai3;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		String dir = "D:\\nam\\New Folder";

		File file = new File(dir);

		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		} else {
			System.out.println("Directory already exist!");
		}

	}

}

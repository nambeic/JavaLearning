package com.vn.bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileFileInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String fileName = "D:\\nam\\text.txt";

		try (FileInputStream fis = new FileInputStream(fileName)) {

			int c;
			while ((c = fis.read()) != -1) {
				System.out.print((char) c);
			}
			fis.close();
		}
	}
}

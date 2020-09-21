package com.vn.bai1;

import java.io.File;

public class FindFileTxt {
	public static void main(String[] args) {
		File path = new File("D:\\nam");
		FindFileTxt findFileTxt = new FindFileTxt();
		findFileTxt.traverseDepthFiles(path);
	}

	public void traverseDepthFiles(File path) {

		if (path.isDirectory()) {

			final File[] children = path.listFiles();
			if (children == null) {
				return;
			}
			for (File each : children) {

				traverseDepthFiles(each);
			}
		} else {

			if (path.getAbsolutePath().toLowerCase().endsWith(".txt")) {
				System.out.println(path.getAbsolutePath());
			} else {
				System.out.println("The .txt file could not be found in the forder " + path);
			}
		}

	}
}

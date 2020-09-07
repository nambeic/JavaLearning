package main;

import autoId.AutoID;

public class Main {

	public static void main(String[] args) {
		AutoID autogen = new AutoID();

		String beforeID = null;
		String prefix = "N";
		int uperUnit = 99;
		int length = 20;
		String charCode = "*-";

		String newI1 = autogen.genID(beforeID, prefix, uperUnit, length, charCode);
		String newI2 = autogen.genID(newI1, prefix, uperUnit, length, charCode);

		System.out.println(newI1);
		System.out.println(newI2);
	}
}

package jvaClassesOneAndTwo;

import java.util.Scanner;

public class javaClass1 {
	public static void main(String[] args) {
		int integer1 = 1;
		int integer2 = 2;
		String string = "String";
		String string2 = "s are used to hold letters and numbers.";
		double notAInteger = 1.000;
		double stillNotAInteger = 2.000;
		boolean TB = true;
		boolean FB = false;
		double numberOne = 0;
		double numberTwo = 0;

		if (integer1 + integer2 == 3) {
			System.out.print("This is done when the first statement is met.");
		} else if (integer1 + integer2 == 5) {
			System.out.print("This is done if the first statement is not met but the second is.");
		}

		else {
			System.out.print("This happens if none of the previous requirements are met.");
		}

		System.out.print(string);
		System.out.print("Strings can be added together with something as simple as a +");
		System.out.println(string + string2);

		// This is a comment, when the program runs it does not influence the
		// outcome

		/*
		 * This is also a comment, only difference is that this comment can last
		 * for multiple lines
		 */

		System.out.print(integer1 / integer2);
		System.out.print(notAInteger / stillNotAInteger);

		/*
		 * They are the same numbers but have different results. Why? The
		 * difference is that one is an integer and one is a double. Integers
		 * can only be whole numbers. Doubles can be any number or decimal.
		 */

		if (TB) {
			// do this
		} else {
			// do this
		}

		if (!TB) {
			// do this
		} else {
			// do this
		}

		if (TB || FB) {
			// do this
		} else {
			// do this
		}

		if (TB && FB) {
			// do this
		} else {
			// do this
		}

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		numberOne = scanner1.nextDouble();
		numberTwo = scanner2.nextDouble();

		System.out.print(numberOne / numberTwo);

		String license = "GFR - 4537";
		System.out.print(license);

		while (integer1 == 1) {
			// it does this infinitely
		}

		for (int x = -5; x > 1; x++) {
			System.out.print(x);
		}

	}
}
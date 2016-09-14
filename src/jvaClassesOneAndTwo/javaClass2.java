package jvaClassesOneAndTwo;

import java.util.Scanner;

public class javaClass2 {

	public static void main(String[] args) {
		// objective 1: Build a calculator
		Scanner numberOne = new Scanner(System.in);
		Scanner numberTwo = new Scanner(System.in);
		double number1 = numberOne.nextDouble();
		double number2 = numberOne.nextDouble();
		double Final = number1 * number2;

		System.out.println(Final);

		// objective 2: Make a text story

		Scanner responseOne = new Scanner(System.in);
		String response1 = responseOne.nextLine();
		System.out.println("Hello, how are you?");
		Scanner responseTwo = new Scanner(System.in);
		String response2 = responseTwo.nextLine();
		System.out.println("");
		Scanner responseThree = new Scanner(System.in);
		String response3 = responseThree.nextLine();
		System.out.println("");
		Scanner responseFour = new Scanner(System.in);
		String response4 = responseFour.nextLine();
		System.out.println("");
		Scanner responseFive = new Scanner(System.in);
		String response5 = responseFive.nextLine();
		System.out.println("");
		Scanner responseSix = new Scanner(System.in);
		String response6 = responseSix.nextLine();
		System.out.println("");
		Scanner responseSeven = new Scanner(System.in);
		String response7 = responseSeven.nextLine();

	}

}

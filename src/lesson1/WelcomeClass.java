package lesson1;

import java.util.Scanner;

public class WelcomeClass {
	public static void main(String[] args) {
		System.out.println("Welcome to Java World !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number !");
		int entered_value = sc.nextInt();
		System.out.println("Entered value is:");
		System.out.println(entered_value);

		// Enter some double value..
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter some Double Value !");
		Double entered_value1 = sc1.nextDouble();
		System.out.println("Entered double value is:");
		System.out.println(entered_value1);

		// Enter some text input
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter some String !");
		String entered_value2 = sc2.nextLine();
		System.out.println("Entered text value is:");
		System.out.println(entered_value2);

	}
}

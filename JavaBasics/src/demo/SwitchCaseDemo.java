package demo;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.println("Please enter an input");
		String day = k.nextLine();

		switch (day) {

		case "Monday":
			System.out.println("Wear a Green color dress");
			break;

		case "Tuesday":
			System.out.println("Wear a yellow color dress");
			break;

		case "Wednesday":
			System.out.println("Wear a White color dress");
			break;

		case "Thursday":
			System.out.println("Wear a Orange color dress");
			break;

		case "Friday":
			System.out.println("Wear a Blue color dress");
			break;

		case "Saturday":
			System.out.println("Wear a Black color dress");
			break;

		case "Sunday":
			System.out.println("Wear a Red color dress");
			break;

		default:
			System.out.println("Please enter a valid input");

		}
	}

}

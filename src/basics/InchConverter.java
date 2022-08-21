package basics;

import java.util.Scanner;

public class InchConverter {
	public static void main(String[] args) {
		System.out.println("Please, enter a number");
		Scanner scanner = new Scanner(System.in);
		float number = Float.parseFloat(scanner.nextLine());
		float inches = number * 2.54f;
		System.out.println(inches);
	}
}

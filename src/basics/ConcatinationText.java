package basics;

import java.util.Scanner;

public class ConcatinationText {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		String lastName = scanner.nextLine();
		int age = Integer.parseInt(scanner.nextLine());
		String city = scanner.nextLine();
		
		System.out.println(String.format("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, city));

	}

}

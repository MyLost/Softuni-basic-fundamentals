package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		char one = scanner.nextLine().charAt(0);
		char two = scanner.nextLine().charAt(0);
		char three = scanner.nextLine().charAt(0);
		
		System.out.println("" + three + " " + two + " " + one);
	}

}

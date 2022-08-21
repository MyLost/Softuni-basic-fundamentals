package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char item = scanner.nextLine().charAt(0);
		
		if(Character.isUpperCase(item)) {
			System.out.println("upper-case");
		} else {
			System.out.println("lower-case");
		}
	}

}

package fundamentals.basics;

import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOne = Integer.parseInt(scanner.nextLine());
		int numberTwo = Integer.parseInt(scanner.nextLine());
		int numberThree = Integer.parseInt(scanner.nextLine());
		
		if(numberOne >= numberTwo && numberTwo >+ numberThree) {
			System.out.println(numberOne);
			System.out.println(numberTwo);
			System.out.println(numberThree);
			
		} else if (numberOne >= numberThree && numberTwo <= numberThree) {
			System.out.println(numberOne);
			System.out.println(numberThree);
			System.out.println(numberTwo);
			
		} else if (numberTwo >= numberOne && numberOne >= numberThree) {
			System.out.println(numberTwo);
			System.out.println(numberOne);
			System.out.println(numberThree);
			
		} else if (numberTwo >= numberThree && numberOne <= numberThree) {
			System.out.println(numberTwo);
			System.out.println(numberThree);
			System.out.println(numberOne);
			
		} else if (numberThree >= numberOne && numberOne >= numberTwo) {
			System.out.println(numberThree);
			System.out.println(numberOne);
			System.out.println(numberTwo);
			
		} else if (numberThree >= numberTwo && numberOne <= numberTwo){
			System.out.println(numberThree);
			System.out.println(numberTwo);
			System.out.println(numberOne);
		}
	}
}

package basics;

import java.util.Scanner;

public class YardGreening {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double numberSquareMeters = Double.parseDouble(scanner.nextLine());
		
		Double totalSum = (numberSquareMeters * 7.61) - (numberSquareMeters * 7.61 * 0.18d);
		Double discount = numberSquareMeters * 7.61 * 0.18d;
		
		System.out.println("The final price is: "+totalSum+" lv.");
		System.out.println("The discount is: "+ discount+" lv.");
	}

}

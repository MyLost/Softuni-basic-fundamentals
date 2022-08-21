package basics;

import java.util.Scanner;

public class SuppliesForSchool {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int penPakages = Integer.parseInt(scanner.nextLine());
		int markerPakages = Integer.parseInt(scanner.nextLine());
		int litersOfDetergent = Integer.parseInt(scanner.nextLine());
		int discount = Integer.parseInt(scanner.nextLine());
		
		double pensSum = penPakages*5.80;
		double markersSum = markerPakages*7.20;
		double detergentSum = litersOfDetergent*1.20;
		
		double sum = pensSum + markersSum + detergentSum;
		
		double sumWithDiscount = sum - (sum*discount/100);
		
		System.out.println(sumWithDiscount);
		
		
		
	}
}

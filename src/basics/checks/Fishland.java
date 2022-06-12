package basics.checks;

import java.util.Scanner;

public class Fishland {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double mackerelPrice = Double.parseDouble(scanner.nextLine());
		double toyPrice =  Double.parseDouble(scanner.nextLine());
		double bonitoKg = Double.parseDouble(scanner.nextLine());
		double horseMackerelKg = Double.parseDouble(scanner.nextLine());
		int musselsKg = Integer.parseInt(scanner.nextLine());
		
		double bonitoPrice = mackerelPrice + mackerelPrice * 0.60;
		double horseMackerelPrice = toyPrice + toyPrice * 0.80;
		double musselPrice =  musselsKg * 7.50;
		double finalPrice = bonitoPrice * bonitoKg + horseMackerelPrice * horseMackerelKg + musselPrice;
		System.out.println(String.format("%.2f", finalPrice));
	}
}

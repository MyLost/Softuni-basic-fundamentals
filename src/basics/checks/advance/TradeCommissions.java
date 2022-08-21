package basics.checks.advance;

import java.util.Scanner;

public class TradeCommissions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String city = scanner.nextLine();
		Double sales = Double.parseDouble(scanner.nextLine());
	
		switch (city) {
		case "Sofia": {
			if(sales < 0) {
				System.out.println("error");
				break;
			}
			if(sales >= 0 && sales <= 500) {
				System.out.println(String.format("%.2f",sales * 0.05));
				break;
			} else if (sales > 500 && sales <= 1000) {
				System.out.println(String.format("%.2f", sales*0.07));
				break;
			} else if (sales > 1000 && sales <= 10000) {
				System.out.println(String.format("%.2f",sales*0.08));
				break;
			}else {
				System.out.println(String.format("%.2f",sales*0.12));
				break;
			}
		}
		case "Varna": {
			if(sales < 0) {
				System.out.println("error");
				break;
			}
			if(sales >= 0 && sales <= 500) {
				System.out.println(String.format("%.2f",sales *0.045));
				break;
			} else if (sales > 500 && sales <= 1000) {
				System.out.println(String.format("%.2f",sales * 0.075));
				break;
			} else if (sales > 1000 && sales <= 10000) {
				System.out.println(String.format("%.2f",sales * 0.1));
				break;
			}else {
				System.out.println(String.format("%.2f",sales * 0.13));
				break;
			}		
				}
		case "Plovdiv": {
			if(sales < 0) {
				System.out.println("error");
				break;
			}
			if(sales >= 0 && sales <= 500) {
				System.out.println(String.format("%.2f",sales * 0.055));
				break;
			} else if (sales > 500 && sales <= 1000) {
				System.out.println(String.format("%.2f",sales * 0.08));
				break;
			} else if (sales > 1000 && sales <= 10000) {
				System.out.println(String.format("%.2f",sales * 0.12));
				break;
			}else {
				System.out.println(String.format("%.2f",sales * 0.145));
				break;
			}
		}
		default:
			System.out.println("error");
		}
	}
}

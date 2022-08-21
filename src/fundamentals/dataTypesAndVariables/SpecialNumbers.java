package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int digit = 0;	
			int num = i;
			while(true) {
				digit = num % 10;
				if(num == 0) {
					break;
				}
				sum+= digit;
				num = num/10;
			}
			if(sum == 5 || i ==5) {
				System.out.println(i + " -> " + "True");
			} else if (sum == 7 || i==7) {
				System.out.println(i + " -> " + "True");
			} else if (sum == 11) {
				System.out.println(i + " -> " + "True");
			} else {
				System.out.println(i + " -> " + "False");
			}
		}
		

	}

}

package basics.loop;

import java.util.Scanner;

public class Travelling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String destination = scanner.nextLine();
		
		while(!destination.equals("End")) {
			double budget = Double.parseDouble(scanner.nextLine());
			double annyBudget=0;
			while(annyBudget < budget) {
				double save = Double.parseDouble(scanner.nextLine());
			 	annyBudget +=save;
			 }
			 System.out.println(String.format("Going to %s!", destination));
			 destination = scanner.nextLine();
		}
	}
}


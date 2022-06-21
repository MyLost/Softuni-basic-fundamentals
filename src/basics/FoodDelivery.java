package basics;

import java.util.Scanner;

public class FoodDelivery {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int chikenMenus = Integer.parseInt(scanner.nextLine());
		int fishMenus = Integer.parseInt(scanner.nextLine());
		int veganMenus = Integer.parseInt(scanner.nextLine());
		
		double chikenMenuSum = chikenMenus * 10.35;
		double fishMenuSum = fishMenus * 12.40;
		double veganMenuSum = veganMenus * 8.15;
		
		double dessert = (chikenMenuSum + fishMenuSum + veganMenuSum) * 0.2;
		
		System.out.println(chikenMenuSum + fishMenuSum + veganMenuSum + dessert + 2.50);

	}

}

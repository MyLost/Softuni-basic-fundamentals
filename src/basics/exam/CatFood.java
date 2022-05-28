package basics.exam;

import java.util.Scanner;

public class CatFood {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int catNumbers = Integer.parseInt(scanner.nextLine());
		
		int smallCat = 0;
		int largeCat = 0;
		int bigCat =0;
		int totalFood=0;
		for (int i = 0; i < catNumbers; i++) {
			double footGrams = Double.parseDouble(scanner.nextLine());
			totalFood += footGrams;
			if(footGrams >= 100 && footGrams < 200) {
				smallCat++;
			} else if(footGrams >= 200 && footGrams < 300) {
				largeCat++;
			} else {
				bigCat++;
			}
		}
		double totalFoodKg = totalFood / 1000.0;
		System.out.println(String.format("Group 1: %d cats.", smallCat));
		System.out.println(String.format("Group 2: %d cats.", largeCat));
		System.out.println(String.format("Group 3: %d cats.", bigCat));
		System.out.println(String.format("Price for food per day: %.2f lv.", totalFoodKg * 12.45));
	}
}

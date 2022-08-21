package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		double highestSnowballValue = 0.0;
		int highestSnowballSnow = 0;
		int highestSnowballTime = 0;
		int highestSnowballQuality = 0;
		for (int i = 0; i < n; i++) {
			int snowballSnow = Integer.parseInt(scanner.nextLine());
			int snowballTime = Integer.parseInt(scanner.nextLine());
			int snowballQuality = Integer.parseInt(scanner.nextLine());
			
			double result = Math.pow((snowballSnow / snowballTime), snowballQuality);
			if(result > highestSnowballValue) {
				highestSnowballValue = result;
				highestSnowballQuality = snowballQuality;
				highestSnowballSnow = snowballSnow;
				highestSnowballTime = snowballTime;
			}
		}
		System.out.println(String.format("%d : %d = %.0f (%d)", highestSnowballSnow, highestSnowballTime, highestSnowballValue, highestSnowballQuality));
	}

}

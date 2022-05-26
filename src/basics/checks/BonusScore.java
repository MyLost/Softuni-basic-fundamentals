package basics.checks;

import java.util.Scanner;

public class BonusScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = Integer.parseInt(scanner.nextLine());
		double score = 0.0;
		
		if(number <= 100) {
			score = score + 5;
		}
		
		if(number > 100) {
			score = number * 0.2;
		}
		
		if(number > 1000) {
			score = number * 0.1;
		}
		
		if(number % 2 == 0) {
			score = score + 1;
		} 
		
		if(number % 10 == 5) {
			score = score + 2;
		}
		System.out.println(score);
		System.out.println(number + score);
	}
}

package basics.loop;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int minNumber = Integer.parseInt(input);
		
		while(!input.equals("Stop")) {
			if(Integer.parseInt(input) < minNumber) {
				minNumber = Integer.parseInt(input);
			}
			input = scanner.nextLine();
		}
		
		System.out.println(minNumber);
	}
}

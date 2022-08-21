package basics.loop;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int maxNumber = Integer.parseInt(input);
		
		while(!input.equals("Stop")) {
			if(Integer.parseInt(input) > maxNumber) {
				maxNumber = Integer.parseInt(input);
			}
			input = scanner.nextLine();
		}
		
		System.out.println(maxNumber);
	}

}

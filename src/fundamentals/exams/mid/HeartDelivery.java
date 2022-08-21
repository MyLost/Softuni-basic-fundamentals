package fundamentals.exams.mid;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		int[] houses = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
		int[] houses = nextIntArray(scanner);
		
		String command = scanner.nextLine();
		int currentPosition = 0;
		
		while(!"Love!".equals(command)) {
			
			String[] commands = command.split(" ");
			
			int jump = Integer.parseInt(commands[1]);
			
			currentPosition += jump;
		
			if(currentPosition >= houses.length) {
				currentPosition=0;
			}
				
			if(houses[currentPosition] > 0) {	
				houses[currentPosition] -=2;
				 	if(houses[currentPosition] == 0) {
						System.out.println(String.format("Place %d has Valentine's day.", currentPosition));
					}
				} else { 					
					System.out.println(String.format("Place %d already had Valentine's day.", currentPosition));
				}
			
			command = scanner.nextLine();
		}
		
		System.out.printf("Cupid's last position was %d.%n", currentPosition);
		
		int failedValentine = 0;
		for (int i : houses) {
			if(i!=0) {
				failedValentine++;
			}
		}
		if(failedValentine > 0) {
			System.out.println(String.format("Cupid has failed %d places.", failedValentine));
		} else {
			System.out.println("Mission was successful.");
		}
	}
	
	
	private static int[] nextIntArray(Scanner scanner) {
		String[] intsAsStrings = scanner.nextLine().split("@");
		int[] array = new int[intsAsStrings.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(intsAsStrings[i]);
		}
		return array;
	}
}

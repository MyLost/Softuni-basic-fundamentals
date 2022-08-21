package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int fieldSize = Integer.parseInt(scanner.nextLine());
		
		int [] ladybugIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		
		boolean[] ladyBugPlacedOnField = new boolean[fieldSize];  
		
		for(int i : ladybugIndexes) {
				if(i >=0 && i < fieldSize) {
					ladyBugPlacedOnField[i] = true;
				}
		}
		String command = scanner.nextLine();
		int ladybugIndex = 0;
		String direction ="";
		int flyLength = 0;
		int flyIndex = 0;
		while(!command.equals("end")) {
			
			String[] commands = command.split(" ");
			
			ladybugIndex = Integer.parseInt(commands[0]);
			direction = commands[1];
			flyLength = Integer.parseInt(commands[2]);
			flyIndex = 0;
			
			if(ladybugIndex < 0 || ladybugIndex >= ladyBugPlacedOnField.length || !ladyBugPlacedOnField[ladybugIndex]) {
				command = scanner.nextLine();
				continue;
			}
			
			ladyBugPlacedOnField[ladybugIndex] = false;
				switch(direction) {
					case "right" :
					flyIndex = flyLength + ladybugIndex;
					//flying
					while(flyIndex < ladyBugPlacedOnField.length && ladyBugPlacedOnField[flyIndex]) {
							flyIndex += flyLength;
					}
					//landing
					if (flyIndex < ladyBugPlacedOnField.length) {
						ladyBugPlacedOnField[flyIndex] = true;
					}
					break;
				
					case "left" : 
					flyIndex = ladybugIndex - flyLength;
					//flying
					while(flyIndex >= 0 && ladyBugPlacedOnField[flyIndex]) {
						flyIndex -=flyLength;
					}
					//landing
					if(flyIndex >= 0) {
						ladyBugPlacedOnField[flyIndex] = true;
					}
					break;	
				}
			command = scanner.nextLine();
		}
		for(boolean i: ladyBugPlacedOnField)
			if(i) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
	}
}







package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int peopleNumbers = Integer.parseInt(scanner.nextLine());
		int elevatorCapacity = Integer.parseInt(scanner.nextLine());
		int courses=0;
		boolean flag = false;
		while(peopleNumbers >= elevatorCapacity) {
			peopleNumbers = peopleNumbers - elevatorCapacity;
			courses++;
			flag = true;
		}
		if(elevatorCapacity > peopleNumbers && !flag) {
//			System.out.println("All the persons fit inside in the elevator.\n"
//				+ "Only one course is needed.");
			System.out.println("1");
		} else if(peopleNumbers != 0) {
//			System.out.println(String.format("%d courses * %d people + 1 course * %d persons", courses + 1, elevatorCapacity, Math.abs(peopleNumbers)));
			System.out.println(courses +1);
		} else {
//			System.out.println(String.format("%d courses * %d people", courses, elevatorCapacity));
			System.out.println(courses);
		}
	}
}

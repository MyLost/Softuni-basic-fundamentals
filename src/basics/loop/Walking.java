package basics.loop;

import java.util.Scanner;

public class Walking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfSteps = 0;
		
		while(numberOfSteps < 10000) {
			String command = scanner.nextLine();
			if(command.equals("Going home")) {
				command = scanner.nextLine();
				numberOfSteps += Integer.parseInt(command);
				break;
			} else {
				numberOfSteps += Integer.parseInt(command);
			}
		}
		if(numberOfSteps >= 10000) {
		System.out.println("Goal reached! Good job!");
		System.out.println(String.format("%d steps over the goal!", numberOfSteps - 10000));
		} else {
			System.out.println(String.format("%d more steps to reach goal.", Math.abs(numberOfSteps - 10000)));
		}
	}
}

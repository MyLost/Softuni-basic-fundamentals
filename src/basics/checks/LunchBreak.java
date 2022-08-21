package basics.checks;

import java.util.Scanner;

public class LunchBreak {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String serialName = scanner.nextLine();
		int episodeDuration = Integer.parseInt(scanner.nextLine());
		int breakDuration = Integer.parseInt(scanner.nextLine());
		
		float lunchTime = breakDuration / 8.0f;
		float restTime = breakDuration / 4.0f;
		
		
		float elapsedTime = breakDuration - lunchTime - restTime;
		if(elapsedTime >= episodeDuration) {
			System.out.println(String.format("You have enough time to watch %s and left with %.0f minutes free time.",serialName, Math.ceil(elapsedTime - episodeDuration)));
		} else {
			System.out.println(String.format("You don't have enough time to watch %s, you need %.0f more minutes.",serialName, Math.ceil(episodeDuration - elapsedTime)));
		}
	}
}

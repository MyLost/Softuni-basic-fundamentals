package basics.loop;

import java.util.Scanner;

public class Oscars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String actorName = scanner.nextLine();
		double points = Double.parseDouble(scanner.nextLine());
		int numberOfevaluators = Integer.parseInt(scanner.nextLine());
		double actorPoints =points;
		
		for (int i = 0; i < numberOfevaluators; i++) {
			String evaluatorName = scanner.nextLine();
			Double evaluatorPoints = Double.parseDouble(scanner.nextLine());
			
			actorPoints +=(evaluatorName.length() * evaluatorPoints) /2;
			
			if(actorPoints > 1250.5) {
				System.out.println(String.format("Congratulations, %s got a nominee for leading role with %.1f!", actorName,actorPoints));
				break;
			}
		}
		
		if(actorPoints < 1250.5) {
			System.out.println(String.format("Sorry, %s you need %.1f more!", actorName, 1250.5 - actorPoints));
		}
		scanner.close();
	}
}

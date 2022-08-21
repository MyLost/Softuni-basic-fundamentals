package basics.loop;

import java.util.Scanner;

public class TennisRanklist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfTournaments = Integer.parseInt(scanner.nextLine());
		int initialPoints = Integer.parseInt(scanner.nextLine());
		int winningPoints = 0;
		int winner = 0;
		for (int i = 0; i < numberOfTournaments; i++) {
			String tournament = scanner.nextLine();
			
			if(tournament.equals("W")) {
				winningPoints += 2000;
				winner++;
			} else if (tournament.equals("F")) {
				winningPoints += 1200;
			} else {
				winningPoints += 720;
			}
		}
		System.out.println(String.format("Final points: %d", initialPoints + winningPoints));
		System.out.println(String.format("Average points: %d", winningPoints/numberOfTournaments));
		System.out.println(String.format("%.2f%%", (double)winner/(double)numberOfTournaments * 100));
	}
}

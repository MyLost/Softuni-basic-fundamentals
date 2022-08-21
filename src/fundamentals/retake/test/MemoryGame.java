package fundamentals.retake.test;

import java.util.Arrays;
import java.util.Scanner;

public class MemoryGame {

	// When you teech to use right data structors for your data?????
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String sequence = scanner.nextLine();
		String command = scanner.nextLine();
		int moves = 0;
		while (!"end".equals(command)) {
			moves++;
			int[] pairNumber = Arrays.stream(command.split("\\s+")).mapToInt(elm -> Integer.parseInt(elm))
				.toArray();

			if (pairNumber[0] == pairNumber[1] || pairNumber[0] < 0 || pairNumber[1] > sequence.length()) {
				var firstHalfSequences = sequence.substring(0, sequence.length() / 2);

				var secondHalfSequences = sequence.substring(sequence.length() / 2, sequence.length());

				sequence = firstHalfSequences + " -" + moves + "a" + " -" + moves + "a" + secondHalfSequences;

				System.out.println("Invalid input! Adding additional elements to the board");
			} else {
				System.out.println(String.valueOf(sequence.charAt(pairNumber[0])));
				System.out.println(String.valueOf(sequence.charAt(pairNumber[1] + 1)));
				if (sequence.charAt(pairNumber[0]) == sequence.charAt(pairNumber[1])) {
					sequence = sequence.replace(sequence.charAt(pairNumber[0]), ' ').trim();
					sequence = sequence.replace(sequence.charAt(pairNumber[0] - 1), ' ').trim();
					System.out.println(String.format("Congrats! You have found matching elements - %s!", sequence
						.charAt(pairNumber[0])));
				} else {
					System.out.println("Try again!");
				}

				if (sequence.length() == 0) {
					System.out.println(String.format("You have won in %d turns!", moves));
				}
			}
			command = scanner.nextLine();
		}

		if (sequence.length() > 0) {
			System.out.println(String.format("Sorry you lose :( %s", sequence));
		}
	}
}

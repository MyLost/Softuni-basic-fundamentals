package fundamentals.retake.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(
			Collectors.toList());

		String command = scanner.nextLine();

		while (!"End".equals(command)) {

			String[] commands = command.split("\\s+");

			String action = commands[0];

			if (action.equals("Shoot")) {
				int index = Integer.parseInt(commands[1]);
				if (sequence.size() > 0 && sequence.size() >= index && index >= 0) {
					int value = Integer.parseInt(commands[2]);
					sequence.set(index, sequence.get(index) - value);
				}
				if (sequence.get(index) < 0) {
					sequence.remove(index);
				}
			}
			if (sequence.size() > 0 && action.equals("Add")) {
				int index = Integer.parseInt(commands[1]);
				if (sequence.size() >= index && index >= 0) {
					int value = Integer.parseInt(commands[2]);
					sequence.set(index, value);
				} else {
					System.out.println("Invalid placement!");
				}
			}
			if (sequence.size() > 0 && action.equals("Strike")) {
				int index = Integer.parseInt(commands[1]);
				int value = Integer.parseInt(commands[2]);
				if (index - value >= 0 && index + value <= sequence.size()) {
					sequence.remove(index);
					sequence.remove(index);
					sequence.remove(index - value);
				} else {
					System.out.println("Strike missed!");
				}
			}
			command = scanner.nextLine();
		}
		String result = sequence.stream().map(itm -> itm.toString()).collect(Collectors.joining("|"));
		System.out.println(result);
	}

}

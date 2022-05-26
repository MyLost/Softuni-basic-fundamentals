package fundamentals.retake.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(elem -> Integer.parseInt(
			elem)).collect(Collectors.toList());

		String command = scanner.nextLine();

		while (!"end".equals(command)) {

			String[] commands = command.split(" ");

			String action = commands[0].trim();

			if (action.equals("swap")) {
				int startIndex = Integer.parseInt(commands[1]);
				int endIndex = Integer.parseInt(commands[2]);

				int temp = sequence.get(startIndex);
				sequence.set(startIndex, sequence.get(endIndex));
				sequence.set(endIndex, temp);

			} else if (action.equals("multiply")) {
				int startIndex = Integer.parseInt(commands[1]);
				int endIndex = Integer.parseInt(commands[2]);
				sequence.set(startIndex, sequence.get(startIndex) * sequence.get(endIndex));

			} else if (action.equals("decrease")) {
				sequence = sequence.stream().map(elem -> elem - 1).collect(Collectors.toList());
			}
			command = scanner.nextLine();
		}

		String result = sequence.stream().map(itm -> itm.toString()).collect(Collectors.joining(", "));
		System.out.println(result);

	}
}

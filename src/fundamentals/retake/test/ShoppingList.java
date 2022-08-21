package fundamentals.retake.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> productsList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

		String command = scanner.nextLine();

		while (!"Go Shopping!".equals(command)) {

			String[] commands = command.split("\\s+");

			if (commands[0].equals("Urgent") && commands.length > 1) {
				if (!productsList.contains(commands[1])) {
					productsList.add(0, commands[1]);
				}
			}
			if (commands[0].equals("Unnecessary") && commands.length > 1) {
				if (productsList.contains(commands[1])) {
					productsList.remove(commands[1]);
				}
			}
			if (commands[0].equals("Correct") && commands.length > 1) {
				if (productsList.contains(commands[1])) {
					productsList.set(productsList.indexOf(commands[1]), commands[2]);
				}
			}
			if (commands[0].equals("Rearrange") && commands.length > 1) {
				if (productsList.contains(commands[1])) {
					productsList.remove(commands[1]);
					productsList.add(commands[1]);
				}
			}
			command = scanner.nextLine();
		}

		String result = productsList.stream().collect(Collectors.joining(", "));
		System.out.println(result);
	}

}

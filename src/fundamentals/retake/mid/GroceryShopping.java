package fundamentals.retake.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroceryShopping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> products = new ArrayList<>();
		products = Arrays.stream(scanner.nextLine().split("\\|")).map(item -> item
			.toString().trim())
			.collect(Collectors.toCollection(LinkedList::new));

		String command = scanner.nextLine();

		while (!"Shop!".equals(command)) {
			String[] commands = command.split("%");

			if (commands[0].equals("Important")) {
				if (products.contains(commands[1])) {
					products.remove(commands[1]);
					products.add(0, commands[1]);
				} else {
					products.add(0, commands[1]);
				}
			}
			if (commands[0].equals("Add")) {
				if (!products.contains(commands[1])) {
					products.add(commands[1]);
				} else {
					System.out.println("The product is already in the list.");
				}
			}
			if (commands[0].equals("Swap")) {
				if (products.contains(commands[1]) && products.contains(commands[2])) {
					String tmp = products.get(products.indexOf(commands[1]));
					int index = products.indexOf(commands[2]);
					products.set(products.indexOf(commands[1]), products.get(products.indexOf(commands[2])));
					products.set(index, tmp);
				} else {
					if (!products.contains(commands[1])) {
						System.out.println(String.format("Product %s missing!", commands[1]));
					}
					if (!products.contains(commands[2])) {
						System.out.println(String.format("Product %s missing!", commands[2]));
					}
				}

			}
			if (commands[0].equals("Remove")) {
				if (products.contains(commands[1])) {
					products.remove(commands[1]);
				} else {
					System.out.println(String.format("Product %s isn't in the list.", commands[1]));
				}
			}
			if (commands[0].equals("Reversed")) {
				Collections.reverse(products);
			}
			command = scanner.nextLine();
		}
		int count = 1;
		for (String product : products) {
			System.out.println(count + ". " + product);
			count++;
		}
	}

}

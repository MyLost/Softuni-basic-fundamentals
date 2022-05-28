package fundamentals.retake.mid;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> books = new LinkedList<>();
		books = Arrays.stream(scanner.nextLine().split("\\|")).map(item -> item
			.toString().trim())
			.collect(Collectors.toCollection(LinkedList::new));

		String command = scanner.nextLine();

		while (!"Stop!".equals(command)) {

			String[] commands = command.split("\\s+");

			if (commands[0].equals("Join")) {
				if (books.contains(commands[1])) {
				} else {
					books.add(commands[1]);
				}
			}
			if (commands[0].equals("Drop")) {
				if (books.contains(commands[1])) {
					books.remove(commands[1]);
				} else {
				}
			}
			if (commands[0].equals("Replace")) {
				if (books.contains(commands[1]) && !books.contains(commands[2])) {
					books.set(books.indexOf(commands[1]), commands[2]);
				} else {
				}
			}
			if (commands[0].equals("Prefer")) {
				if (Integer.parseInt(commands[1]) > 0 && Integer.parseInt(commands[1]) < books.size()
					&& Integer.parseInt(commands[2]) > 0 && Integer.parseInt(commands[2]) < books.size()) {
					String temp = books.get(Integer.parseInt(commands[1]));
					books.set(Integer.parseInt(commands[1]), books.get(Integer.parseInt(commands[2])));
					books.set(Integer.parseInt(commands[2]), temp);
				} else {
				}
			}
			command = scanner.nextLine();
		}
		String result = books.stream().collect(Collectors.joining(" "));
		System.out.println(result);
	}

}


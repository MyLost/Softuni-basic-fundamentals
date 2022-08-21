package fundamentals.retake.test;

import java.util.Scanner;

public class WorldTour {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringBuilder route = new StringBuilder(scanner.nextLine());
		String command = scanner.nextLine();

		while (!"Travel".equals(command)) {

			String[] commands = command.split(":");

			if (commands[0].equals("Add Stop")) {
				if (Integer.parseInt(commands[1]) >= 0 || Integer.parseInt(commands[1]) <= route.length()) {
					route.insert(Integer.parseInt(commands[1]), commands[2]);
				}
			} else if (commands[0].equals("Remove Stop")) {
				int startIndex = Integer.parseInt(commands[1]);
				int endIndex = Integer.parseInt(commands[2]);
				if (startIndex > -1 && startIndex < route.length() && endIndex > -1 && endIndex < route.length()) {
// route.replace(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]) +
// 1, "");
					route.delete(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]) + 1);
				}
			} else if (commands[0].equals("Switch")) {
				if (route.toString().contains(commands[1])) {
					route = new StringBuilder(route.toString().replace(commands[1], commands[2]));
				}
			}
			System.out.println(route.toString());
			command = scanner.nextLine();
		}
		System.out.printf("Ready for world tour! Planned stops: %s", route.toString());

	}

}

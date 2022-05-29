package fundamentals.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		String command = scanner.nextLine();
		
		final String INSERT = "Insert";
		final String DELETE = "Delete";
		
		while(!"end".equals(command)) {
			 
			String[] commands = command.split(" ");
			
			if(commands[0].equals(INSERT)) {
				numbers.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
			} else if(commands[0].equals(DELETE)) {
				while(numbers.contains(Integer.parseInt(commands[1]))) {
					numbers.remove(Integer.valueOf(commands[1]));
				}
			}
			command = scanner.nextLine();
		}
		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}
	}
}

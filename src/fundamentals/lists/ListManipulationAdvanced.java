package fundamentals.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		String command = scanner.nextLine();
		
		final String CONTAINS = "Contains";
		final String PRINT_EVEN = "Print even";
		final String PRINT_ODD = "Print odd";
		final String GET_SUM = "Get sum";
		final String FILTER = "Filter";
		
		while(!command.equals("end")) {
			
			String[] commands = command.split(" ");
			
			if(commands[0].equals(CONTAINS)) {
				if(numbers.contains(Integer.parseInt(commands[1]))) {
					System.out.println("Yes");
				} else {
					System.out.println("No such number");
				}
			} else if ((commands[0] + " " + commands[1]).equals(PRINT_EVEN)) {
				var even = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
				for (Integer integer : even) {
					System.out.print(integer + " ");
				}
				System.out.println();
			} else if((commands[0] + " " + commands[1]).equals(PRINT_ODD)) {
				var odd = numbers.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
				for (Integer integer : odd) {
					System.out.print(integer + " ");
				}
				System.out.println();
			} else if ((commands[0] + " " + commands[1]).equals(GET_SUM)) {
				int sum =0;
				for (int integer : numbers) {
					sum += integer;
				}
				System.out.println(sum);
			} else if (commands[0].equals(FILTER)) {
				if(commands[1].equals("<")) {
					var filteredNumbers = numbers.stream().filter(e -> e < Integer.parseInt(commands[2])).collect(Collectors.toList());
					for (Integer integer : filteredNumbers) {
						System.out.print(integer + " ");
					}
					System.out.println();
				} if(commands[1].equals(">")) {
					var filteredNumbers = numbers.stream().filter(e -> e > Integer.parseInt(commands[2])).collect(Collectors.toList());
					for (Integer integer : filteredNumbers) {
						System.out.print(integer + " ");
					}
					System.out.println();
				} if(commands[1].equals(">=")) {
					var filteredNumbers = numbers.stream().filter(e -> e >= Integer.parseInt(commands[2])).collect(Collectors.toList());
					for (Integer integer : filteredNumbers) {
						System.out.print(integer + " ");
					}
					System.out.println();
				} if (commands[1].equals("<=")) {
					var filteredNumbers = numbers.stream().filter(e -> e <= Integer.parseInt(commands[2])).collect(Collectors.toList());
					for (Integer integer : filteredNumbers) {
						System.out.print(integer + " ");
					}
					System.out.println();
				}
			}
			command = scanner.nextLine();
		}
	}
}

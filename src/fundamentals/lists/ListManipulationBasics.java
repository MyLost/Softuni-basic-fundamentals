package fundamentals.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		String command = scanner.nextLine();
		
		final String ADD = "Add";
		final String REMOVE = "Remove";
		final String REMOVE_AT = "RemoveAt";
		final String INSERT = "Insert";
		
		while(!command.equals("end")) {
			
			String[] commands = command.split(" ");
			
			if(commands[0].equals(ADD)) {
				numbers.add(Integer.parseInt(commands[1]));
			} else if(commands[0].equals(REMOVE)) {
				int index = numbers.indexOf(Integer.parseInt(commands[1]));
				if(index >= 0 ) {
					numbers.remove(index);
				}
			} else if(commands[0].equals(REMOVE_AT)) {
				numbers.remove(Integer.parseInt(commands[1]));
			} else if(commands[0].equals(INSERT)) {
				numbers.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
			}	
			command = scanner.nextLine();
		}

		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}
	}

}

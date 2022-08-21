package fundamentals.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<Integer> train =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		int capacity = Integer.parseInt(scanner.nextLine());
		
		String command = scanner.nextLine();
		
		final String ADD = "Add";
		
		while(!"end".equals(command)) {
			 
			String[] commands = command.split(" ");
			
			if(commands[0].equals(ADD)) {
				train.add(Integer.parseInt(commands[1]));
			} else {
				for (int i = 0; i < train.size(); i++) {
					if(Integer.parseInt(commands[0]) + train.get(i) <= capacity) {
						train.set(i, Integer.parseInt(commands[0]) + train.get(i));   
						break;
					}
				}
			}
			command = scanner.nextLine();
		}
		for (Integer integer : train) {
			System.out.print(integer + " ");
		}
	}
}

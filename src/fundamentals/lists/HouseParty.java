package fundamentals.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Integer n = Integer.parseInt(scanner.nextLine());
		
		List<String> names = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			String[] commands = scanner.nextLine().split(" ");
			
			if(commands[1].equals("is") && commands[2].equals("not") && commands[3].equals("going!")) {
				if(names.contains(commands[0])) {
					names.removeAll(List.of(commands[0]));
				} else {
					System.out.print(String.format("%s is not in the list!", commands[0]));
				}
			} else if(commands[1].equals("is") && commands[2].equals("going!")) {
				if(!names.contains(commands[0])) {
					names.add(commands[0]);
				} else {
					System.out.println(String.format("%s is already in the list!", commands[0]));
				}
			}
		}
		if(names.size() > 0) {
			for (String string : names) {
				System.out.println(string);
			}
		}
	}
}

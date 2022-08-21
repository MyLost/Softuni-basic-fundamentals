package basics;

import java.util.Scanner;

public class ProjectCreation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int projectNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println(String.format("The architect %s will need %d hours to complete %d project/s.", name, projectNumber*3, projectNumber));
	}
}

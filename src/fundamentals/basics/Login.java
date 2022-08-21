package fundamentals.basics;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		String reversedUsername = "";
		int counter =0;
		for(int i=0; i<username.length(); i++) {
			reversedUsername += username.charAt(username.length() - i -1);
		}

		while(!password.equals(reversedUsername)) {
			counter++;
			if(counter > 3) {
				System.out.println(String.format("User %s blocked!", username));
				break;
			}
			System.out.println("Incorrect password. Try again.");
			password = scanner.nextLine();
		}
		
		if(password.equals(reversedUsername)) {
			System.out.println(String.format("User %s logged in.", username));
		}
	}

}

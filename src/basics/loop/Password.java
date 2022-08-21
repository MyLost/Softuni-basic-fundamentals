package basics.loop;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		String accessPasword = "";
		while(!(accessPasword.equals(password))) {
			accessPasword = scanner.nextLine();
		}
		System.out.println("Welcome " + username + "!");
		scanner.close();
	}
}

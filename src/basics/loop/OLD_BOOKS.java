package basics.loop;

import java.util.Scanner;

public class OLD_BOOKS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String searchingBook = scanner.nextLine();
		String inputbook ="";
		int cheked = 0;
		
		while(scanner.hasNext()) {
			inputbook = scanner.nextLine();
			if(inputbook.equals("No More Books")) {
				System.out.println("The book you search is not here!");
				System.out.println(String.format("You checked %d books.", cheked));
				break;
			}
			if(inputbook.equals(searchingBook)) {
				System.out.println(String.format("You checked %d books and found it.", cheked));
			}
			cheked++;
		}
		scanner.close();
	}
}

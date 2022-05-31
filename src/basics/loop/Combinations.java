package basics.loop;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int result =0;
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 25; j++) {
				for (int j2 = 0; j2 <= 25; j2++) {
					if(i+j+j2 == n) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
}

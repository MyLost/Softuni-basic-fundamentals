package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int pokePower = Integer.parseInt(scanner.nextLine());
		int distance = Integer.parseInt(scanner.nextLine());
		int exhaustionFactory = Integer.parseInt(scanner.nextLine());
		int count = 0;
		int storeInitialPokePower = pokePower;
		while(pokePower >= distance) {
			pokePower = pokePower - distance;
			count++;
			if(pokePower == storeInitialPokePower * 0.5) {
				if(exhaustionFactory <= pokePower && exhaustionFactory > 0) {
					pokePower = pokePower / exhaustionFactory; 
				}
			}
		}
		System.out.println(pokePower);
		System.out.println(count);
	}
}

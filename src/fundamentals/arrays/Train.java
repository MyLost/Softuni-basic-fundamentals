package fundamentals.arrays;

import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] train = new int[n];
		for (int i = 0; i < n; i++) {
			int people = Integer.parseInt(scanner.nextLine());
			train[i] = people;
		}
		int sum = 0;
		for (int i : train) {
			System.out.print(i + " ");
			sum +=i;
		}
		System.out.println();
		System.out.println(sum);
	}

}

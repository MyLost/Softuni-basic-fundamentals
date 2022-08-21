package fundamentals.retake.test;

import java.util.Scanner;

public class GuineaPig {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double food = Double.parseDouble(scanner.nextLine());
		double hay = Double.parseDouble(scanner.nextLine());
		double cover = Double.parseDouble(scanner.nextLine());
		double weght = Double.parseDouble(scanner.nextLine());

		double foodInKg = food * 1000;
		double hayInKg = hay * 1000;
		double coverInKg = cover * 1000;
		double weghtInKg = weght * 1000;

		for (int i = 1; i <= 30; i++) {

			foodInKg -= 300;

			if (i != 0 && i % 2 == 0) {
				hayInKg = hayInKg - foodInKg * 0.05;
			}

			if (i != 0 && i % 3 == 0) {
				coverInKg = coverInKg - weghtInKg / 3;
			}

			if (foodInKg < 0 || hayInKg < 0 || coverInKg < 0) {
				break;
			}
		}

		if (foodInKg > 0 && hayInKg > 0 && coverInKg > 0) {
			System.out.println(String.format("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
				foodInKg / 1000, hayInKg / 1000, coverInKg / 1000));
		} else {
			System.out.println("Merry must go to the pet store!");
		}
	}

}

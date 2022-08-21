package fundamentals.retake.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		Map<String, Plant> plants = new LinkedHashMap();

		for (int i = 0; i < n; i++) {

			String[] data = scanner.nextLine().split("<->");

			if (!plants.containsKey(data[0])) {
				var plant = new Plant();
				plant.setName(data[0]);
				plant.setRarity(Integer.parseInt(data[1]));
				plants.put(plant.getName(), plant);
			} else {
				var plant = plants.get(data[0]);
				plant.setRarity(Integer.parseInt(data[1]));
			}
		}

		String input = scanner.nextLine();

		while (!"Exhibition".equals(input)) {

			input = input.trim();
			String[] commands = input.split(":");
			String command = commands[0];
			String[] data = commands[1].split("-");


			if (command.equals("Rate") && plants.containsKey(data[0].trim())) {
				var plant = plants.get(data[0].trim());
				plant.setRating(plant.getRating() + Integer.parseInt(data[1].trim()));
				plant.setNumberOfRates(plant.getNumberOfRates() + 1);
			} else
			if (command.equals("Update") && plants.containsKey(data[0].trim())) {
					var plant = plants.get(data[0].trim());
					plant.setRarity(Integer.parseInt(data[1].trim()));
				} else
				if (command.equals("Reset") && plants.containsKey(data[0].trim())) {
						var plant = plants.get(data[0].trim());
						plant.setRating(0);
						plant.setNumberOfRates(0);
					} else {
						System.out.println("error");
					}
			input = scanner.nextLine();
		}

		System.out.println("Plants for the exhibition:");
		plants.entrySet().forEach(plant -> {
			System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f", plant.getValue().getName(), plant
				.getValue().getRarity(), plant.getValue().getNumberOfRates() != 0 ? (double) plant.getValue()
					.getRating() / (double) plant.getValue()
					.getNumberOfRates() : (double) 0));
		});
	}

	private static class Plant {
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRarity() {
			return rarity;
		}

		public void setRarity(int rarity) {
			this.rarity = rarity;
		}

		int rarity;
		int rating;
		int numberOfRates;

		public int getNumberOfRates() {
			return numberOfRates;
		}

		public void setNumberOfRates(int numberOfRates) {
			this.numberOfRates = numberOfRates;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}
	}
}

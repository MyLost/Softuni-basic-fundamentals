package fundamentals.exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String command = scanner.nextLine();

		Map<String, Food> foods = new LinkedHashMap<>();
		var counter = 0;
		while (!"Complete".equals(command)) {

			String[] commands = command.split("\\s+");

			if (commands[0].equals("Receive")) {
				if (!foods.containsKey(commands[2]) && Integer.parseInt(commands[1]) > 0) {
					Food food = new Food();
					food.setName(commands[2]);
					food.setQuantity(Integer.parseInt(commands[1]));
					foods.put(commands[2], food);
				} else {
					if (Integer.parseInt(commands[1]) > 0) {
						var food = foods.get(commands[2]);
						food.setQuantity(food.getQuantity() + Integer.parseInt(commands[1]));
					}
				}
			} else if (commands[0].equals("Sell")) {
				if (!foods.containsKey(commands[2])) {
					System.out.println(String.format("You do not have any %s.", commands[2]));
				} else {
					if (Integer.parseInt(commands[1]) > 0) {
						var food = foods.get(commands[2]);
						if (Integer.parseInt(commands[1]) > food.getQuantity()) {
							System.out.println(String.format("There aren't enough %s. You sold the last %d of them.",
								commands[2], food.getQuantity()));
							counter += food.getQuantity();
							foods.remove(commands[2]);
						} else {
							System.out.println(String.format("You sold %d %s.", Integer.parseInt(commands[1]), food
								.getName()));
							food.setQuantity(food.getQuantity() - Integer.parseInt(commands[1]));
							counter += Integer.parseInt(commands[1]);
							if (food.getQuantity() <= 0) {
								foods.remove(commands[2]);
							}
						}
					}
				}
			}

			command = scanner.nextLine();
		}

		foods.entrySet().stream().forEach(item -> System.out.println(item.getValue().getName() + ": " + item.getValue()
		.getQuantity()));
		System.out.println(String.format("All sold: %s goods", counter));
	}

	private static class Food {

		String name;
		int quantity;

		public Food() {
			quantity = 0;
			name = "";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	}
}

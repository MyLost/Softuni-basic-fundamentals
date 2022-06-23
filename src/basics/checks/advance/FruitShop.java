package basics.checks.advance;

import java.util.Scanner;

public class FruitShop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String fruit = scanner.nextLine();
		String day = scanner.nextLine();
		Double quantity = Double.parseDouble(scanner.nextLine());
		
		switch(day) {
			case "Sunday": {
				switch (fruit) {
					case "banana": {
						System.out.println(quantity * 2.70);
						break;
					}
					case "apple": {
						System.out.println(quantity * 1.25);
						break;
	
					}
					case "orange": {
						System.out.println(quantity * 0.90);
						break;
	
					}
					case "grapefruit": {
						System.out.println(quantity * 1.60);
						break;
	
					}
					case "kiwi": {
						System.out.println(quantity * 3.00);
						break;
	
					}
					case "pineapple": {
						System.out.println(5.60);
						break;
	
					}
					case "grapes": {
						System.out.println(4.20);
						break;
					}
				}
			}
			case "Monday": {
				switch (fruit) {
				case "banana": {
					System.out.println(quantity * 2.50);
					break;
				}
				case "apple": {
					System.out.println(quantity * 1.20);
					break;

				}
				case "orange": {
					System.out.println(quantity * 0.85);
					break;

				}
				case "grapefruit": {
					System.out.println(quantity * 1.45);
					break;

				}
				case "kiwi": {
					System.out.println(quantity * 2.70);
					break;

				}
				case "pineapple": {
					System.out.println(5.50);
					break;

				}
				case "grapes": {
					System.out.println(3.85);
					break;
				}
			}
				break;
				}
			case "Tuesday": {
				switch (fruit) {
					case "banana": {
						System.out.println(quantity * 2.50);
						break;
					}
					case "apple": {
						System.out.println(quantity * 1.20);
						break;
	
					}
					case "orange": {
						System.out.println(quantity * 0.85);
						break;
	
					}
					case "grapefruit": {
						System.out.println(quantity * 1.45);
						break;
	
					}
					case "kiwi": {
						System.out.println(quantity * 2.70);
						break;
					}
					case "pineapple": {
						System.out.println(5.50);
						break;
	
					}
					case "grapes": {
						System.out.println(3.85);
						break;
					}
				}
			}
			case "Wednesday": {
				switch (fruit) {
					case "banana": {
						System.out.println(quantity * 2.50);
						break;
					}
					case "apple": {
						System.out.println(quantity * 1.20);
						break;
	
					}
					case "orange": {
						System.out.println(quantity * 0.85);
						break;
	
					}
					case "grapefruit": {
						System.out.println(quantity * 1.45);
						break;
	
					}
					case "kiwi": {
						System.out.println(quantity * 2.70);
						break;
	
					}
					case "pineapple": {
						System.out.println(5.50);
						break;
	
					}
					case "grapes": {
						System.out.println(3.85);
						break;
					}
				}
			}
			case "Thursday": {
				switch (fruit) {
					case "banana": {
						System.out.println(quantity * 2.50);
						break;
					}
					case "apple": {
						System.out.println(quantity * 1.20);
						break;
	
					}
					case "orange": {
						System.out.println(quantity * 0.85);
						break;
	
					}
					case "grapefruit": {
						System.out.println(quantity * 1.45);
						break;
	
					}
					case "kiwi": {
						System.out.println(quantity * 2.70);
						break;
	
					}
					case "pineapple": {
						System.out.println(5.50);
						break;
	
					}
					case "grapes": {
						System.out.println(3.85);
						break;
					}
				}
			}
			case "Friday": {
				switch (fruit) {
					case "banana": {
						System.out.println(quantity * 2.50);
						break;
					}
					case "apple": {
						System.out.println(quantity * 1.20);
						break;
	
					}
					case "orange": {
						System.out.println(quantity * 0.85);
						break;
	
					}
					case "grapefruit": {
						System.out.println(quantity * 1.45);
						break;
	
					}
					case "kiwi": {
						System.out.println(quantity * 2.70);
						break;
	
					}
					case "pineapple": {
						System.out.println(5.50);
						break;
	
					}
					case "grapes": {
						System.out.println(3.85);
						break;
					}
				}
			}
			case "Saturday": {
				switch (fruit) {
					case "banana": {
						System.out.println(quantity * 2.70);
						break;
					}
					case "apple": {
						System.out.println(quantity * 1.25);
						break;
	
					}
					case "orange": {
						System.out.println(quantity * 0.90);
						break;
	
					}
					case "grapefruit": {
						System.out.println(quantity * 1.60);
						break;
	
					}
					case "kiwi": {
						System.out.println(quantity * 3.00);
						break;
	
					}
					case "pineapple": {
						System.out.println(5.60);
						break;
	
					}
					case "grapes": {
						System.out.println(4.20);
						break;
					}
				}
			}
		}
	}
}

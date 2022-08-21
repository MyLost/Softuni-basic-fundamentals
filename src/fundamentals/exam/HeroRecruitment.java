package fundamentals.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HeroRecruitment {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String command = scanner.nextLine();
		Map<String, Hero> heroes = new HashMap();

		while (!"End".equals(command)) {

			String[] commands = command.split("\\s+");

			if (commands[0].equals("Enroll")) {
				var hero = new Hero();
				hero.setName(commands[1]);
				if (heroes.containsKey(hero.getName())) {
					System.out.println(hero.getName() + " is already enrolled.");
				} else {
					heroes.put(commands[1], hero);
				}
			}
			if (commands[0].equals("Learn")) {
				if (!heroes.containsKey(commands[1])) {
					System.out.println(commands[1] + " doesn't exist.");
				} else {
					var hero = heroes.get(commands[1]);
					if (hero.getSpellBook().contains(commands[2])) {
						System.out.println(commands[1] + " has already learnt " + commands[2] + ".");
					} else {
						hero.getSpellBook().add(commands[2]);
					}
				}
			}
			if (commands[0].equals("Unlearn")) {
				if (!heroes.containsKey(commands[1])) {
					System.out.println(commands[1] + " doesn't exist.");
				} else {
					var hero = heroes.get(commands[1]);
					if (!hero.getSpellBook().contains(commands[2])) {
						System.out.println(hero.getName() + " doesn't know " + commands[2] + ".");
					} else {
						hero.getSpellBook().remove(commands[2]);
					}
				}
			}
			command = scanner.nextLine();
		}
		List<String> herroesWothoutSpells = new ArrayList<>();
		System.out.println("Heroes:");
		heroes.entrySet().forEach(hero -> {
			if (hero.getValue().getSpellBook().isEmpty()) {
				herroesWothoutSpells.add(hero.getValue().getName());
			} else {
				System.out.print("== " + hero.getValue().getName() + ": ");
				hero.getValue().getSpellBook().forEach(spell -> {
					System.out.print(spell + "");
					if (hero.getValue().getSpellBook().size() > 1) {
						System.out.print(spell + ", ");
					}
				});
				System.out.println();
			}
		});
		herroesWothoutSpells.forEach(h -> {
			System.out.print("== " + h + ": ");
		});
	}

	private static class Hero {

		private String name;
		private List<String> spellBook;

		public Hero() {
			name = "";
			spellBook = new ArrayList<>();
		}
		public List<String> getSpellBook() {
			return spellBook;
		}

		public void setSpellBook(List<String> spellBook) {
			this.spellBook = spellBook;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}

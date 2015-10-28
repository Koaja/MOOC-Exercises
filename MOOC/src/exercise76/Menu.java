package exercise76;

import java.util.ArrayList;

public class Menu {

	private ArrayList<String> meals;

	public Menu() {
		this.meals = new ArrayList<>();
	}

	public void addMeal(String meal) {
		if (!meals.contains(meal)) {
			meals.add(meal);
		} else {
			System.out.println(meal + " was already present on the menu");
		}
	}

	public void printMeals() {
		for (String meal : meals) {
			System.out.println(meal);
		}
	}

	public void clearmenu() {
		meals.clear();

		if (meals.isEmpty()) {
			System.out.println("Menu was emptied");
		}
	}
}

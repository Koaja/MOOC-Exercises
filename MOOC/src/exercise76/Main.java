package exercise76;

public class Main {
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		menu.addMeal("Vita");
		menu.addMeal("Peste");
		menu.addMeal("Porc");
		
		menu.printMeals();
		menu.addMeal("Peste");
		
		menu.clearmenu();
		
		menu.printMeals();
		
	}

}

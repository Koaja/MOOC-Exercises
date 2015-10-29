package exercise79;

public class NumberStatistics {

	int ammountOfNumbers; // tells us how many numbers have been added to the
							// statistics

	public NumberStatistics() {
		System.out.println("Amount :" + ammountOfNumbers);
	}

	public void addNumber(int number) {
		ammountOfNumbers++;
	}

	public int amountOfNumbers() {

	}
}

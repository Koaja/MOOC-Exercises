package exercise79;

public class NumberStatistics {

	private int ammountOfNumbers; // tells us how many numbers have been added
									// to the statistics
	private int sum;

	public NumberStatistics() {

	}

	public void addNumber(int number) {
		this.sum += number;
		ammountOfNumbers++;
	}

	public int amountOfNumbers() {
		return ammountOfNumbers;

	}

	public int sum() {
		return sum;
	}

	public double average() {

		double average = sum / (double) ammountOfNumbers;
		return average;
	}
}

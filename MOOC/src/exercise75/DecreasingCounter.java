package exercise75;

public class DecreasingCounter {
	private int value; // object variable that remembers the value of the
						// counter

	private int initialValue = 100;

	public DecreasingCounter(int valueAtStart) {
		this.value = valueAtStart;
	}

	public void printValue() {
		System.out.println("value: " + this.value);
	}

	public int getValue() {
		return this.value;
	}

	public void decrease() {

		if (value-- < 0) {
			value = value;
		}
	}

	public void reset() {
		value = 0;
	}

	public void setInitial() {
		value = initialValue;
	}
}

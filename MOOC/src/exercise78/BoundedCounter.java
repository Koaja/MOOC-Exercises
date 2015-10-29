package exercise78;

public class BoundedCounter {

	private int value;
	private int upperLimit;

	public BoundedCounter(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public void next() {
		value++;
		if (value > upperLimit) {
			value = 0;
		}
	}

	public String toString() {
		if (value < 10) {
			return "0" + value;
		} else {
			return "" + value;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value == 0) {

		} else if (value > upperLimit) {

		} else {
			this.value = value;
		}

	}
}

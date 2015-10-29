package course;

public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;

	public Person(String initialName) {
		this.age = 0;
		this.name = initialName;
		this.weight = 0;
		this.height = 0;
	}

	public void printPerson() {
		System.out.println(this.name + ", age " + this.age + " years");

	}

	public void becomeOlder() {
		this.age++;
	}

	public int getAge() {
		return this.age;
	}

	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		}

		return true;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.name + ", age " + this.age + " years";
	}

	public void setHeight(int newHeight) {
		this.height = newHeight;
	}

	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}

	public double bodyMassIndex() {
		double heightDividedByHundred = this.height / 100.0;
		return this.weight / (heightDividedByHundred * heightDividedByHundred);
	}
}

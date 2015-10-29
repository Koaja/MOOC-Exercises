package exercise78;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		BoundedCounter seconds = new BoundedCounter(59);
		BoundedCounter minutes = new BoundedCounter(59);
		BoundedCounter hours = new BoundedCounter(23);

		seconds.setValue(50);
		minutes.setValue(59);
		hours.setValue(23);

		int i = 0;
		while (i < 121) {

			System.out.println(hours + ":" + minutes + ":" + seconds);
			seconds.next();
			if (seconds.getValue() == 0) {
				minutes.next();
			}
			if (minutes.getValue() == 0) {
				hours.next();
			}
			i++;
		}

	}
}

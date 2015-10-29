package exercise77;

public class LyyraCard {

	private double balance;

	public LyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}

	public String toString() {
		return "The card has " + balance + " euros.";
	}

	public void payEconomical() {
		if (balance - 2.5 < 0) {
			balance = balance;
		} else
			balance = balance - 2.5;
	}

	public void payGourmet() {
		if (balance - 4.0 < 0) {
			balance = balance;
		} else
			balance = balance - 4.0;
	}

	public void loadMoney(double amount) {
		if (balance + amount >= 150) {
			balance = 150;
		} else if (amount < 0) {
			balance = balance;
		} else {
			balance = balance + amount;
		}
	}
}

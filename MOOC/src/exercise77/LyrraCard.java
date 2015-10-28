package exercise77;

public class LyrraCard {

	private double balance;

	public LyrraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}

	public String toString() {
		return "The card has " + balance + " euros.";
	}

	public void payEconomical() {
		balance = balance - 2.5;
		if (balance < 0) {

		}
	}

	public void payGourmet() {
		balance = balance - 4.00;
		if(balance < 0){
			balance 
		}
	}
}

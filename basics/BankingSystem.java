package basics;

public class BankingSystem {

//	private int accountNumber;
//	private String accountHolderName;
	private int balance = 500;

	public BankingSystem(int accountNumber, String accountHolderName) {
		super();
//		this.accountNumber = accountNumber;
//		this.accountHolderName = accountHolderName;
	}

	public void deposite(int money) {
		if (money <= 0) {
			System.out.println("invalid deposite");
			return;
		}
		balance += money;
		System.out.println("successfully deposited");

	}

	public void withdraw(int money) {
		if (money <= 0 || money > balance) {
			System.out.println("invalid withdrawl");
			return;
		}

		balance -= money;
		System.out.println("withdrawl sucessfull");
	}

	public static void main(String[] args) {
		BankingSystem bs = new BankingSystem(001, "Samir");
		bs.deposite(1000);
		bs.withdraw(900);
		bs.deposite(-100);
		bs.withdraw(50000);
	}
}

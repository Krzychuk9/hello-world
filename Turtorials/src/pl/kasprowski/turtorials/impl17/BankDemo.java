package pl.kasprowski.turtorials.impl17;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.00);

		try {
			System.out.println("Withdraing $100....");
			c.withdraw(100.00);
			System.out.println("Withdraing $600....");
			c.withdraw(600);
		} catch (IncufficientFoundsException e) {

			System.out.println("Sorry" + e.getAmount());
			e.printStackTrace();
		}
	}
}

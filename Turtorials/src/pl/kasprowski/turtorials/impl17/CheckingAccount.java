package pl.kasprowski.turtorials.impl17;

import java.io.*;

public class CheckingAccount {
	private double balance;
	private int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws IncufficientFoundsException {
		if (amount <= balance) {
			balance -= amount;
		}else{
			double needs = amount - balance;
			throw new IncufficientFoundsException(needs);
		}
	}

	public double getBalance(){
		return balance;
	}
	
	public int getNumber(){
		return number;
	}
}

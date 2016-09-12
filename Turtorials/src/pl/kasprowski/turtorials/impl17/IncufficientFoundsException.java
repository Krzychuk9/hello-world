package pl.kasprowski.turtorials.impl17;

import java.io.*;

public class IncufficientFoundsException extends Exception {

	private double amount;
	public IncufficientFoundsException(double amount){
		this.amount = amount;
	}
	public double getAmount(){
		return amount;
	}
}

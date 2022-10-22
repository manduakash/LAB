package com.lab.problem1;

public class Customer { // customer class

	// data members
	private long acccontNumber;
	private String acccontName;
	private double acccontBalance;

	// it will create account
	public void createAccount(long acccontNumber, String acccontName, double acccontBalance) {
		this.acccontNumber = acccontNumber;
		this.acccontName = acccontName;
		this.acccontBalance = acccontBalance;
	}

	public long getAcccontNumber() { // getter
		return acccontNumber;
	}

	public void setAcccontNumber(long acccontNumber) { // setter
		this.acccontNumber = acccontNumber;
	}

	public String getAcccontName() { // getter
		return acccontName;
	}

	public void addAmount(double acccontBalance) { // setter
		this.acccontBalance = this.acccontBalance + acccontBalance;
	}

	public void getAmount() { // getter
		System.out.println("Hello! " + getAcccontName() +" Your Account Balance is " + acccontBalance + "Rs.");
	}

//
//	private void setAcccontBalance(double acccontBalance) {
//		this.acccontBalance = acccontBalance;
//	}

}

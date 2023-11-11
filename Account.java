package com.Interfacedemo;

public class Account implements Bank {

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		int ca = 5000;
		System.out.println("Rs "+ca+ " is credited to your Bank Account");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		int da = 2000;
		System.out.println("Rs "+ da+ " is Debited From your Bank Account");

	}
	public static void main(String[] args) {
        Account ac = new Account();
        ac.credit();
        ac.debit();
        ac.loan();
    }

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		int lo = 100000;
		System.out.println("Loan Amount of Rs "+ lo + "is credited to your Bank Account");

	}
}

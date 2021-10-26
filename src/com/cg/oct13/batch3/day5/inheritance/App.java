package com.cg.oct13.batch3.day5.inheritance;

interface FinanceMinistry {
	public abstract void payInterestOnDeposits();

}

interface StateGovt {
	public abstract void paySalaryToEmployee();

}

abstract class Rbi {
	abstract void doKyc();

	void openAccount() {

	}

	void payLoans() {

	}
}

class HdfcBank extends Rbi implements FinanceMinistry, StateGovt {

	@Override
	void doKyc() {
		System.out.println("Aadhar");

	}

	@Override
	public void paySalaryToEmployee() {
		System.out.println("Salary");

	}

	@Override
	public void payInterestOnDeposits() {
		System.out.println("Deposits");

	}

}

class Icici extends Rbi {

	@Override
	void doKyc() {
		System.out.println("PanCard");

	}

}

public class App {
	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
		obj.doKyc();
		obj.payInterestOnDeposits();
		obj.paySalaryToEmployee();
		Icici obj2 = new Icici();
		obj2.doKyc();
		obj2.openAccount();

	}

}

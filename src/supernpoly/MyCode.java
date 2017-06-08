package supernpoly;
//on calling withdraw();

//With Account class, it prints:
//Withdraw performed.

//Change it to print -

//For Checking account:
//Withdraw performed.
//$2 fee charged.

//For Savings account:
//Withdraw performed.
//$5 fee charged.
class MyCode {
	public static void main(String[] args) {
		Account checking = new Checking();
		checking.withdraw();

		Account saving = new Saving();
		saving.withdraw();
	}
}

abstract class Account {

	public void withdraw() {
		System.out.println("Withdraw performed.");
	}
}

class Checking extends Account {

	@Override
	public void withdraw() {
		super.withdraw();
		System.out.println("$2 fee charged.");
	}
}

class Saving extends Account {

	@Override
	public void withdraw() {
		super.withdraw();
		System.out.println("$5 fee charged.");
	}
}

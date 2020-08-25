
public class Account {

	String name;
	int password;
	int balance;

	Account() {}
	Account(String pName, int pPassword, int pBalance) {

		name = pName;
		password = pPassword;
		balance = pBalance;

	}

	void deposit(int input) {

		balance +=input;
		System.out.println("입금이 완료되었습니다");
		System.out.println("잔액 : "+balance);

	}
	void withDraw(int output) {

		balance -=output;
		System.out.println("출금이 완료되었습니다");
		System.out.println("잔액 : "+balance);


	}
	int getBalance() {
		return balance;

	}
}

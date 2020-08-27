package exception.throw_;

public class Account {
	
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance =+ money;
	}
	public void withDraw(int money) throws BalanceErorrException {
		
		if (balance < money) {
			throw new BalanceErorrException("잔고가 부족합니다"); 
		}
		balance -= money;
		
		
	}

}

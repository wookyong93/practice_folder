package ex05;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void depsoit(int money) {
		balance+=money;
	}

	public void withdraw(int money) throws BalanceExcept {
		// TODO Auto-generated method stub
		if(balance < money) {
				throw new BalanceExcept((money - balance)+"��ŭ ���� �Դϴ�.");
		}
		balance -= money;
	}
}

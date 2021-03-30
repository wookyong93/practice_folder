package ex05;

public class AccountExam {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.depsoit(10000);
		System.out.println("ÇöÀç ÀÜ¾× : "+account.getBalance());
		
		try {
		account.withdraw(30000);
		}catch(BalanceExcept e ) {
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
		}
		System.out.println("ÇöÀç ÀÜ¾× : "+account.getBalance());
	}
}

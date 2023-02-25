package lesson014;

public class AccountManager {
	
	
	
	public void accountDetails(Account account) {
		System.out.println("Hesap No.: " + account.getAccountNo());
		System.out.println("Güncel bakiye: " + account.getBalance());
	}
	
	public void deposit(Account account, int para) {
		if(para <= 10000 && para > 0) {
			account.setBalance(account.getBalance() + para);
			System.out.println(para + " TL hesaba yatırıldı.");
			System.out.println(account.getAccountNo() + " no.'lu hesabınızdaki güncel bakiye: " + account.getBalance() + " TL\n");
		}
		else {
			System.out.println("Yalnızca 1 TL ila 10000 TL arası para yatırabilirsiniz.\n");
		}		
	}
	
	public void withdraw(Account account, int para) {
		if(para <= account.getBalance()) {
			account.setBalance(account.getBalance() - para);
			System.out.println(para + " TL hesaptan çekildi.");
			System.out.println(account.getAccountNo() + " no.'lu hesabınızdaki güncel bakiye: " + account.getBalance() + " TL\n");
		}
		else {
			System.out.println("Çekilmek istenen tutar hesap bakiyesinden fazla olamaz.\n");
		}			
	}
}

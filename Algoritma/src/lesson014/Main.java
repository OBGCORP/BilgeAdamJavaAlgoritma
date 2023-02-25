package lesson014;

public class Main {

	public static void main(String[] args) {
		
		AccountManager accountManager = new AccountManager();
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();
		
		Account account = new Account();
		account.setBalance(30000);
		
		Account account2 = new Account();
		account2.setBalance(20000);
		
		Account account3 = new Account();
		account3.setBalance(10000);

		
		User user1 = new User("Ahmet", "Yoğsul", account);
		System.out.println(user1.getAccount().getBalance());
		
		User user2 = new User();
		user2.setEmail("asd@gmail.com");
		user2.setName("Mehmet Ali");
		user2.setSurname("Çoban");
		user2.setAccount(account);
		System.out.println(user2.getAccount().getBalance() + " " + user2.getEmail());
		
		accountManager.deposit(account, 200);
		accountManager.withdraw(account, 500);
		
		userManager.generateAutoMail(user2);
		System.out.println(user2.getEmail());
		
		System.out.println(account.getBalance());
		userManager.krediBasvurusuYap(account, 10000);
		adminManager.krediBasvurusuOnayla(user1);
		System.out.println(account.getBalance());

		Account account4 = new Account(5000);
		System.out.println(account4.getAccountNo());
	}

}

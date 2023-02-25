package lesson014;

public class UserManager {

	public void generateAutoMail(User user) {
		user.setEmail(user.getName().toLowerCase().replace(" ", ".") + "." + user.getSurname().toLowerCase() + "@xbanka.com");
	}
	
	public void krediBasvurusuYap(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		
		System.out.println(para + " değerinde kredi başvurusu yaptınız.");
		System.out.println("Lütfen onay bekleyiniz");
	}
	
	public void krediBorcunuOde(Account account, int taksit) {
		if (account.isKrediAlindiMi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kart Borcunuz yatırılan miktardan az");
			} else {
				account.setKrediBorcu(account.getKrediBorcu() - taksit);
				System.out.println(taksit + " Kadar ödeme yaptınız Güncel Borcunuz--> " + account.getKrediBorcu());
			}
		} else {
			System.out.println("Kredi Borcunu Bulunmamakta");
		}
	}
	
	public void hesaptanKrediBorcuOde(Account account, int taksit) {
		if (account.isKrediAlindiMi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kart Borcunuz yatırılan miktardan az");
			} else {
				if (account.getBalance() >= taksit) {
					account.setKrediBorcu(account.getKrediBorcu() - taksit);
					account.setBalance(account.getBalance() - taksit);
					System.out.println(taksit + " Hesaptan ödeme yaptınız Güncel Borcunuz: " + account.getKrediBorcu());
					System.out.println("Hesabınızdaki bakiye : " + account.getBalance());
				} else {
					System.out.println("Bakiyeniz yetersiz");
				}
			}

		} else {
			System.out.println("Kredi Borcunu Bulunmamakta");
		}
	}
	
	public void nakitAvansCek(Account account, int avans) {
		if(account.getKrediPuani() >=50) {
			System.out.println(account.getBalance() / 2 - account.getIstenenKredi() + " nakit avans çekebilirsiniz");
			account.setBalance(account.getBalance()-avans);
			System.out.println(avans + " Tl avans çektiniz ");
			System.out.println("Güncel Bakiye: " + account.getBalance());
		}else{
			System.out.println(" Kredi notu yetersiz kredi notunuz: " + account.getKrediPuani());
		}
	}
}

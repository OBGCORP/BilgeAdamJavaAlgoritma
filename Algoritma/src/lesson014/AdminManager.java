package lesson014;

public class AdminManager {

	public void krediBasvurusuOnayla(User user) {
		if(user.getAccount().isKrediBasvurusu()) {
			user.getAccount().setBalance(user.getAccount().getBalance() + user.getAccount().getIstenenKredi());
			System.out.println("Kredi başvurunuz onaylandı. Güncel hesap bakiyesi: " + user.getAccount().getBalance() + " TL");
			user.getAccount().setKrediBorcu(user.getAccount().getIstenenKredi());
			user.getAccount().setKrediAlindiMi(true);
			user.getAccount().setKrediBasvurusu(false);
			user.getAccount().setIstenenKredi(0);
		}
		else {
			System.out.println("Hesabın kredi başvurusu bulunmamakta.");
		}
	}
	
	public void krediBasvurusuReddet(User user) {
		if(user.getAccount().isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz reddedildi. Güncel hesap bakiyesi: " + user.getAccount().getBalance() + " TL");
			user.getAccount().setKrediBasvurusu(false);
			user.getAccount().setIstenenKredi(0);
		}
		else {
			System.out.println("Hesabın kredi başvurusu bulunmamakta.");
		}
	}
}

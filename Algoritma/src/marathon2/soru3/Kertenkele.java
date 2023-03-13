package marathon2.soru3;

public class Kertenkele extends Surungen{
	
	private static final String cinsi = "Kertenkele";
	
	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu, false, cinsi);
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " sürünüyor...");
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " pıSs pıSslıyor...");
	}

	public String getCinsi() {
		return cinsi;
	}
	
}

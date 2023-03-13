package marathon2.soru3;

public class Yilan extends Surungen{
	
	private static final String cinsi = "Yılan";

	public Yilan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu, true, cinsi);
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " sürünüyor...");
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " tısSSslıyor...");
	}
	
	public String getCinsi() {
		return cinsi;
	}
}

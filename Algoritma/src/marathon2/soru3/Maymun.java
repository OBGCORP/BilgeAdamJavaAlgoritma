package marathon2.soru3;

public class Maymun extends MemeliHayvan{

	private static final String cinsi = "Maymun";
	
	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu, false, cinsi);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " yürüyor...");	
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " çığlık atıyor...");	
	}

	public String getCinsi() {
		return cinsi;
	}
}

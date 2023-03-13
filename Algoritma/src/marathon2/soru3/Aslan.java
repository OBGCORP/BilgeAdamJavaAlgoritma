package marathon2.soru3;

public class Aslan extends MemeliHayvan{

	private static final String cinsi = "Aslan";
	
	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu, true, cinsi);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " yürüyor...");
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " isimli " + getCinsi().toLowerCase() + " kükrüyor...");
	}	
	
	public String getCinsi() {
		return cinsi;
	}
}

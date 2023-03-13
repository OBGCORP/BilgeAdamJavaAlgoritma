package marathon2.soru3;

public abstract class Surungen extends Hayvan {
	
	public Surungen(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi, String cinsi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, cinsi);
	}

	public abstract void surun();

}

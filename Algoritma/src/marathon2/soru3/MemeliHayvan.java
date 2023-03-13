package marathon2.soru3;

public abstract class MemeliHayvan extends Hayvan{

	public MemeliHayvan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi, String cinsi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, cinsi);
	}
	
	public abstract void yuru();

}

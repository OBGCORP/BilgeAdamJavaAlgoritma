package hw3;

public class HaberKanalı extends Kanal{
	
	private String turu;
	private EHaberTuru haberTuru;
	
	public HaberKanalı(String kanalAdi, int kanalNo, EHaberTuru haberTuru) {
		super(kanalAdi, kanalNo);
		this.haberTuru = haberTuru;
		this.turu = "Haber Kanalı";
	}

	@Override
	public String toString() {
		return "Kanal No: " + getKanalNo() + "\nKanal Türü: " + turu + "\nHaber Türü: " + haberTuru;
	}
	
}

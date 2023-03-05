package hw3;

public class MuzikKanali extends Kanal{
	
	private String turu;
	private EMuzikTuru muzikTuru;
	
	public MuzikKanali(String kanalAdi, int kanalNo, EMuzikTuru muzikTuru) {
		super(kanalAdi, kanalNo);
		this.muzikTuru = muzikTuru;
		this.turu = "Müzik Kanalı";
	}
	
	@Override
	public String toString() {
		return "Kanal No: " + getKanalNo() + "\nKanal Türü: " + turu + "\nMüzik Türü: " + muzikTuru;
	}
}

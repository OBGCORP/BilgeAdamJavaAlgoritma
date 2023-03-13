package marathon2.soru2;

public class CustomStringTR {

	private String metin;

	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}
	
	public int uzunluk() {
		return getMetin().length();
	}
	
	public char indekstekiKarakter(int indeks) {
		return getMetin().charAt(indeks);
	}

	public String sonunaEkle(String ekMetin) {
		return getMetin().concat(ekMetin);
	}
	
	public String tekrarla(int tekrarSayisi) {
		return getMetin().repeat(tekrarSayisi);
	}
	
	public String hepsiBuyukHarf() {
		return getMetin().toUpperCase();
	}
	
	public String hepsiKucukHarf() {
		return getMetin().toLowerCase();
	}
	
	public boolean ayniMi(String digerMetin) {
		return getMetin().equals(digerMetin);
	}
	
	public boolean icindeGeciyorMu (String sorgu) {
		return getMetin().contains(sorgu);
	}
	
	public String karakteriDegistir(char simdikiKarakter, char yeniKarakter) {
		return getMetin().replace(simdikiKarakter, yeniKarakter);
	}
	
	public String tirasla() {
		return getMetin().trim();
	}
	
	public String getMetin() {
		return metin;
	}
	
	public void setMetin(String metin) {
		this.metin = metin;
	}

	@Override
	public String toString() {
		return metin;
	}	
	
}

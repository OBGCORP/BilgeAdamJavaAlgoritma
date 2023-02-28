package lesson016.InterfaceUygulama;

public class Kitap {

	private String isim;
	private String yazar;
	private int fiyat;
	
	
	public Kitap(String isim, String yazar, int fiyat) {
		this.isim = isim;
		this.yazar = yazar;
		this.fiyat = fiyat;
	}
	
	public String getIsim() {
		return this.isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

}

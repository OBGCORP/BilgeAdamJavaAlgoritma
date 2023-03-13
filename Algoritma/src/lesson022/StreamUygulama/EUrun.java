package lesson022.StreamUygulama;

public enum EUrun {

	Cips(20), Kola(15), Seker(65), Yag(40), Ekmek(75), Yumurta(100);
	
	double fiyat;

	private EUrun(double fiyat) {
		this.fiyat = fiyat;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
}

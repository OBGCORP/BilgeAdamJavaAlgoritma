package lesson022.StreamUygulama;

public class Main {
	
	public static void main(String[] args) {
		Market market = new Market();
		market.urunleriListele();
		market.fiyatListesi();
		market.fiyati50denBuyukOlanlar();
	}
	
}

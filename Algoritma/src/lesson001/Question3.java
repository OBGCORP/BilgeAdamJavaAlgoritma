package lesson001;

public class Question3 {

	public static void main(String[] args) {
		//verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğu bilindiğine göre
		//ürünün ham fiyatını bulan program
		
		int satisFiyati = 749;
		double kdvSizFiyat = satisFiyati * 0.82;
		double hamFiyat = kdvSizFiyat * 0.85;
		System.out.println("Ürünün ham fiyatı: " + hamFiyat);
		
		
	}

}

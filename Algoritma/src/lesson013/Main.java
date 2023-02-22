package lesson013;

public class Main {

	public static void main(String[] args) {
		
		Soru soru = new Soru();
		Sinav sinav = new Sinav();
		sinav.sinavOlustur();
		sinav.cevapGir();
		sinav.cevaplariKontrolEt();

	}
}

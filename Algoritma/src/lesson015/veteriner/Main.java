package lesson015.veteriner;

public class Main {
	
	public static void karneOlusturFarklıMethod(Hayvan hayvan) {
		hayvan.karneOlustur();
	}

	public static void main(String[] args) {
		Kedi kedi1 = new Kedi("Boncuk", true, "2010", "Tekir");
		Kedi kedi2 = new Kedi("Şanslı", false, "2015", "Van Kedisi");
		Kedi kedi3 = new Kedi("Beyaz", true, "2012", "Tekir");
		
		Kopek kopek1 = new Kopek("xyz", true, "2010", "Rot");
		Kopek kopek2 = new Kopek("Şanslı", false, "2015", "Golden");
		Kopek kopek3 = new Kopek("Beyaz", true, "2012", "Terrier");
		
		kedi1.bilgileriGoster();
		kopek1.bilgileriGoster();
		
		kedi1.karneOlustur();
		kopek1.karneOlustur();
		
		System.out.println(kedi1.getKarne());
		System.out.println(kopek1.getKarne());
		
		Hayvan hayvan = new Kedi("Siya", true, "2012", "Tekir");
		karneOlusturFarklıMethod(hayvan);
	
		Musteri musteri = new Musteri("3341243124", "Sıla", "Ankara");
		Musteri musteri2 = new Musteri("3341278724", "Berin", "İzmir");
		Veteriner veteriner = new Veteriner("2137123657", "Deniz", "Odtü", 2020);
		musteri.hayvanEkle(kedi1);
		musteri.hayvanEkle(kopek1);
		musteri.hayvanEkle(kopek2);
		musteri.hayvanEkle(kopek3);
		musteri.bilgileriGoster();
		
		musteri.hayvanlariListele();
		veteriner.musteriEkle(musteri);
		veteriner.musteriEkle(musteri2);
		
		veteriner.musteriGoster();
		veteriner.kayitliHayvanlar(musteri);
		
	}	
}

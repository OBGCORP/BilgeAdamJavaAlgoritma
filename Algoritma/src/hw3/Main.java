package hw3;
import java.util.Scanner;

public class Main {

	public static Televizyon TvKurVeKanallariOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Televizyonun markasını giriniz");
		String marka = scanner.nextLine();
		System.out.println("Televizyonun boyutunu giriniz");
		int boyut = scanner.nextInt();
		scanner.nextLine();
		Televizyon TV = new Televizyon(marka, boyut);
		System.out.println("TV Kurulumu tamamlandı.");
		return TV;
	}
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		boolean control = true;
		boolean kapaliMi = true;
		boolean tvKurulduMu = false;
		Televizyon Tv = null;
		System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" + "2-- Televizyonu Aç\n" + "3-- Sesini Arttır\n" + 
				"4-- Sesi Azalt\n" + "5-- Kanal Değiştir\n" + "6-- Kanal Bilgisi Goster\n" + "7-- Televizyonu Kapat\n" + "8-- Menüyü Goster\n");
		System.out.println("Seçiminiz: ");
		
		while (control) {
			
			int secim = scanner.nextInt();
			switch (secim) {
			
			case 0:
				System.err.println("Çıkış yaptınız.");
				control = false;
				break;
				
			case 1:
				if(tvKurulduMu) {
					System.out.println("TV zaten kurulu!");
				}
				else {
					Tv = TvKurVeKanallariOlustur();
					tvKurulduMu = true;
				}	
				break;
				
			case 2:
				if(Tv != null && kapaliMi) {
					Tv.TvAc();
					kapaliMi = false;
				}
				else if(Tv != null && !kapaliMi) {
					System.out.println("TV zaten açık.");
				}
				else {
					System.out.println("TV'yi kurmadınız.");
				}
				break;
				
			case 3:
				if(Tv != null && !kapaliMi) {
					Tv.SesiArttir();
				}
				else if(Tv != null && kapaliMi) {
					System.out.println("TV açık değil!");
				}
				else {
					System.out.println("TV'yi kurmadınız.");
				}
				break;
				
			case 4:
				if(Tv != null && !kapaliMi) {
					Tv.SesiAzalt();
				}
				else if(Tv != null && kapaliMi) {
					System.out.println("TV açık değil!");
				}
				else {
					System.out.println("TV'yi kurmadınız.");
				}
				break;
				
			case 5:
				if(Tv != null && !kapaliMi) {
					Tv.kanalDegistir();
				}
				else if(Tv != null && kapaliMi) {
					System.out.println("TV açık değil!");
				}
				else {
					System.out.println("TV'yi kurmadınız.");
				}
				break;
				
			case 6:
				if(Tv != null && !kapaliMi) {
					Tv.kanalBilgisiniGoster();
				}
				else if(Tv != null && kapaliMi) {
					System.out.println("TV açık değil!");
				}
				else {
					System.out.println("TV'yi kurmadınız.");
				}
				break;
				
			case 7:	
				if(Tv != null && !kapaliMi) {
					Tv.TvKapa();
					kapaliMi = true;
				}
				else if(Tv != null && kapaliMi) {
					System.out.println("TV zaten kapalı.");
				}
				else {
					System.out.println("TV'yi kurmadınız.");
				}
				break;
				
			case 8:
				System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" + "2-- Televizyonu Aç\n" + "3-- Sesini Arttır\n" + 
						"4-- Sesi Azalt\n" + "5-- Kanal Değiştir\n" + "6-- Kanal Bilgisi Goster\n" + "7-- Televizyonu Kapat\n" + "8-- Menüyü Goster\n");
				System.out.println("Seçiminiz: ");
				break;
						
			}
		}
	}
	
	public static void main(String[] args) {
		menu();

	}

}

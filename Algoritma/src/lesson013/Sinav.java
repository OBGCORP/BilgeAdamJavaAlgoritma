package lesson013;
import java.util.Scanner;
public class Sinav {
	
	static String[] cevapSecenekleri = {"A", "B", "C", "D"};
	
	private int sure;
	private String ders;
	private String konu;
	private Soru[] sorular;	
	private String[] cevaplar;
	
	
	public Sinav() {
		
	}

	public void sinavOlustur() {
		Scanner scanner = new Scanner(System.in);
		Sinav sinav = new Sinav();
		System.out.println("Sınavla alakalı dersi giriniz:");
		sinav.setDers(scanner.nextLine());
		System.out.println("Sınavla alakalı dersin konusunu giriniz:");
		sinav.setKonu(scanner.nextLine());
		System.out.println("Sınav süresini giriniz:");
		sinav.setSure(scanner.nextInt());
		System.out.println("Sınavda kaç adet soru olmasını istediğinizi giriniz:");
		setSorular(new Soru[scanner.nextInt()]);
		for(int i = 0; i < getSorular().length; i++) {
			Soru soru = new Soru();
			soru.soruOlustur(cevapSecenekleri);
			getSorular()[i] = soru;
		}
	}
	
	public void cevapGir() {
		Scanner scanner = new Scanner(System.in);
		setCevaplar(new String[getSorular().length]);
		for(int i = 0; i < getSorular().length; i++) {
			System.out.println(getSorular()[i].getIcerik());
			for(int j = 0; j < getSorular()[i].getCevapIcerikleri().length; j++) {
				System.out.println(getCevapSecenekleri()[j] + "-)" + getSorular()[i].getCevapIcerikleri()[j]);
			}
			System.out.println((i+1) + ". soru için cevabınızı giriniz:");			
			getCevaplar()[i] = scanner.next();
		}			
	}
	
	public void cevaplariKontrolEt() {
		int dogru = 0;
		int yanlis = 0;
		int puan = 0;
		for(int i = 0; i < getSorular().length; i++) {
			if(getSorular()[i].getDogruCevap().equalsIgnoreCase(getCevaplar()[i]) ) {
				dogru++;
				puan += getSorular()[i].getPuan();				
			}
			else {
				yanlis++;
			}
		}
		System.out.println("Sınav Puanı: " + puan + " | Doğru sayısı: " + dogru + " | Yanlış sayısı: " + yanlis);
	}
	
	public int getSure() {
		return sure;
	}

	public void setSure(int sure) {
		this.sure = sure;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public String getKonu() {
		return konu;
	}

	public void setKonu(String konu) {
		this.konu = konu;
	}

	public Soru[] getSorular() {
		return sorular;
	}

	public void setSorular(Soru[] sorular) {
		this.sorular = sorular;
	}

	public String[] getCevapSecenekleri() {
		return cevapSecenekleri;
	}

	public void setCevapSecenekleri(String[] cevapSecenekleri) {
		this.cevapSecenekleri = cevapSecenekleri;
	}

	public String[] getCevaplar() {
		return cevaplar;
	}

	public void setCevaplar(String[] cevaplar) {
		this.cevaplar = cevaplar;
	}
	
}

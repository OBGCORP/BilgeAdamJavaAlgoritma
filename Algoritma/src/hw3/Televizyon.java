package hw3;
import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {

	static Scanner scanner = new Scanner(System.in);
	
	private String marka;
	private int boyut;
	private ArrayList<Kanal> kanallar;
	private boolean TvAcikMi = false;
	private int sesSeviyesi = 5;
	private Kanal acikKanal;
	
	public Televizyon(String marka, int boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		this.kanallar = new ArrayList<Kanal>();
		kanallariOlustur();
		this.acikKanal = this.kanallar.get(0);
	}
	
	public void kanallariOlustur() {
		this.kanallar.add(new HaberKanalı("FOX", 1, EHaberTuru.SPOR));
		this.kanallar.add(new HaberKanalı("Kanal D", 2, EHaberTuru.MAGAZIN));
		this.kanallar.add(new MuzikKanali("MTV", 3, EMuzikTuru.ROCK));
		this.kanallar.add(new MuzikKanali("Fenomen", 4, EMuzikTuru.POP));		
	}
	
	public void TvAc() {
		if(isTvAcikMi()) {
			System.out.println("TV'niz zaten açık durumda.");
		}
		else {
			setTvAcikMi(true);
			System.out.println("TV'niz açıldı.");
		}
	}
	
	public void TvKapa() {
		if(isTvAcikMi()) {
			setTvAcikMi(false);
			System.out.println("TV'niz kapatıldı.");
		}
		else {
			System.out.println("TV'niz zaten kapalı durumda.");
		}
	}
	
	public void SesiArttir() {
		if(this.sesSeviyesi < 10) {
			this.sesSeviyesi++;
			System.out.println("Ses seviyesi: " + this.sesSeviyesi);
		}
		else {
			System.out.println("Ses seviyesi maksimumda!");
		}
	}
	
	public void SesiAzalt() {
		if(this.sesSeviyesi > 0) {
			this.sesSeviyesi--;
			System.out.println("Ses sevitesi: " + this.sesSeviyesi);
		}
		else {
			System.out.println("Ses seviyesi minimumda!");
		}
	}

	public void kanalDegistir() {
		boolean control = true;
		while (control) {
			System.out.println("Hangi kanala geçilsin?");
			for(Kanal kanal : kanallar) {
				System.out.println(kanal.getKanalNo() + "- " + kanal.getKanalAdi());
			}
			int gecilecekKanalNo = scanner.nextInt();
			if(gecilecekKanalNo == this.acikKanal.getKanalNo()) {
				System.out.println("Zaten " + this.acikKanal.getKanalNo() + " No.'lu kanaldasınız");
			}
			else {
				for(Kanal kanal : kanallar) {
					if(kanal.getKanalNo() == gecilecekKanalNo) {
						this.acikKanal = kanal;
						System.out.println(kanal.getKanalAdi() + " kanalında geçildi.");
						control = false;
						break;
					}
				}
			}	
		}
	}
	
	public void kanalBilgisiniGoster() {
		System.out.println("Şuan bulunduğunuz kanal: " + this.acikKanal.getKanalAdi());
		System.out.println(this.acikKanal);
	}
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getBoyut() {
		return boyut;
	}

	public void setBoyut(int boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}

	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public boolean isTvAcikMi() {
		return TvAcikMi;
	}

	public void setTvAcikMi(boolean tvAcikMi) {
		TvAcikMi = tvAcikMi;
	}

	public int getSesSeviyesi() {
		return sesSeviyesi;
	}
	
}

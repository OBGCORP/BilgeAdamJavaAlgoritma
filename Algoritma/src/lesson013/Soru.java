package lesson013;
import java.util.Scanner;

public class Soru {
	
	private int puan;
	private String icerik;
	private String dogruCevap;
	private String[] cevapIcerikleri;
	
	public Soru() {
		
	}
	
	public void soruOlustur(String[] cevapSecenekleri) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Soru giriniz:");
		setIcerik(scanner.nextLine());
		setCevapIcerikleri(new String[cevapSecenekleri.length]);
		for(int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println(cevapSecenekleri[i] + " şıkkının içeriğini giriniz:");
			cevapIcerikleri[i] = scanner.next();
		}
		System.out.println("Doğru cevabı giriniz:");
		setDogruCevap(scanner.next().toUpperCase());
		System.out.println("Sorunun puanını giriniz:");
		setPuan(scanner.nextInt());
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public String getDogruCevap() {
		return dogruCevap;
	}

	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}

	public String[] getCevapIcerikleri() {
		return cevapIcerikleri;
	}

	public void setCevapIcerikleri(String[] cevapIcerikleri) {
		this.cevapIcerikleri = cevapIcerikleri;
	}
	
}

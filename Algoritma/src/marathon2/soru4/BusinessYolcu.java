package marathon2.soru4;

import java.util.HashMap;
import java.util.Scanner;

public class BusinessYolcu extends Yolcu{

	private static final int BUSINESSFIYAT = 100;
	private static final int BUSINESSVIPFIYAT = 150;
	private HashMap<String, Integer> biletler = new HashMap<>();
	
	public BusinessYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println(getAd() + " kişisinin biletleri:");
		System.out.println(biletler);
	}

	@Override
	public void biletAl(IFirma firmaAdi) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bilet tipi seçiniz:\n1- VIP\n2- Normal");
		int biletTipi = sc.nextInt();
		switch(biletTipi) {
		case 1:
			biletler.put(firmaAdi.toString(), BUSINESSVIPFIYAT + getBasefiyat());
			break;
		case 2:
			biletler.put(firmaAdi.toString(), BUSINESSFIYAT + getBasefiyat());
			break;
		default:
			System.out.println("Hatalı seçim.");
			break;
		}
	}

	@Override
	public void checkInYap() {
		if(isCheckIn()) {
			System.out.println("Zaten check-in yaptınız");
		}
		else {
			setCheckIn(true);
		}
	}

	@Override
	public void ucagaBin() {
		if(isCheckIn()) {
			System.out.println(getAd() + " olarak " + getKoltukNo() + " nolu koltuğa binebilirsiiz");
		}
		else {
			System.out.println("Öncelikle check-in yapınız.");
		}
	}
	
}

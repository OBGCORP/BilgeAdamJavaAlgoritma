package marathon2.soru4;

import java.util.HashMap;
import java.util.Random;

public class EkonomiYolcu extends Yolcu{

	private static final int EKONOMIFIYAT = 100;
	private HashMap<String, Integer> biletler;
	
	public EkonomiYolcu(int id, String ad, String soyad) {
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
		// TODO Auto-generated method stub
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

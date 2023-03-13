package marathon2.soru4;

import java.util.Random;

public abstract class Yolcu {

	private static final int BASEFIYAT = 100;
	private int id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkIn;
	
	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo = koltukNoGenerator();
	}
	
	public abstract void yolcuBilgileriniGetir();
	
	public abstract void biletAl(IFirma firmaAdi);
	
	public abstract void checkInYap();
	
	public abstract void ucagaBin();
	
	public int koltukNoGenerator() {
		Random r = new Random();
		return r.nextInt(50);
	}

	public int getId() {
		return id;
	}

	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public static int getBasefiyat() {
		return BASEFIYAT;
	}

	@Override
	public String toString() {
		return "Yolcu [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", koltukNo=" + koltukNo + ", checkIn=" + checkIn
				+ "]";
	}
	
}

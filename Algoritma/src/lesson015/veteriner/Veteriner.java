package lesson015.veteriner;

import java.util.ArrayList;

public class Veteriner extends Insan {

	private String mezunOlduguOkul;
	private int calismaSuresi;
	private ArrayList<Musteri> musteriler = new ArrayList<>();
	
	
	public Veteriner(String tcKimlik, String name, String mezunOlduguOkul, int calismaSuresi) {
		super(tcKimlik, name);
		this.mezunOlduguOkul = mezunOlduguOkul;
		this.calismaSuresi = calismaSuresi;
		musteriler = new ArrayList<>();
	}
	
	public void musteriEkle(Musteri musteri) {
		this.musteriler.add(musteri);
		System.out.println(musteri.getName() + " adlı müşteri, " + getName() + " adlı veterinere eklendi.");
	}
	
	public void musteriGoster() {
		System.out.println(getName() + " in müşterileri:");
		for(Musteri musteri : musteriler) {
			System.out.println(musteri.getName());
		}
	}

	public void kayitliHayvanlar(Musteri musteri) {
		System.out.println(musteri.getName() + " adlı müşterinin kayıtlı olan hayvanları:");
		for(Hayvan hayvan : musteri.getHayvanListesi()) {
			if(hayvan.isKayitliMi()) {
				System.out.println(hayvan.getName());
			}
		}
	}
	
	public String getMezunOlduguOkul() {
		return mezunOlduguOkul;
	}

	public void setMezunOlduguOkul(String mezunOlduguOkul) {
		this.mezunOlduguOkul = mezunOlduguOkul;
	}

	public int getCalismaSuresi() {
		return calismaSuresi;
	}

	public void setCalismaSuresi(int calismaSuresi) {
		this.calismaSuresi = calismaSuresi;
	}

	@Override
	public String toString() {
		return super.toString() + "Veteriner [mezunOlduguOkul=" + mezunOlduguOkul + ", calismaSuresi=" + calismaSuresi + "]";
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}

	
}

package lesson015.veteriner;
import java.util.ArrayList;

public class Musteri extends Insan {

	private String adres;
	private ArrayList<Hayvan> hayvanListesi;

	public Musteri(String tcKimlik, String name, String adres) {
		super(tcKimlik, name);
		this.adres = adres;
		this.hayvanListesi = new ArrayList<Hayvan>();
		
	}
	
	public void hayvanEkle(Hayvan hayvan) {
		if(hayvanListesi.size() < 3) {
			if(this.hayvanListesi.add(hayvan)) {
		System.out.println(hayvan.getName() + " hayvanı, " + getName() + " isimli müşteriye eklendi.");
			}
		}
		else {
			System.out.println("max seviyede");
		}	
	}
	
	public void hayvanlariListele() {
		System.out.println(getName() + " in sahip olduğu hayvanlar.");
		for(Hayvan hayvan : hayvanListesi) {
			System.out.println(hayvan.getName());
		}
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return super.toString() + "Musteri [adres=" + adres + "]" + hayvanListesi;
	}
	
	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}

	public ArrayList<Hayvan> getHayvanListesi() {
		return hayvanListesi;
	}

	public void setHayvanListesi(ArrayList<Hayvan> hayvanListesi) {
		this.hayvanListesi = hayvanListesi;
	}
	
	
	
}

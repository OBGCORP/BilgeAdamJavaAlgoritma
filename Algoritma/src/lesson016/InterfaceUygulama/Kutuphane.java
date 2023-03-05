package lesson016.InterfaceUygulama;
import java.util.ArrayList;
import java.util.List;

public class Kutuphane implements IKutuphaneManager{
	
	private String isim;
	private List<Kitap> kitapListesi;
	private List<Kitap> indirimdekiKitaplar;
	
	
	public Kutuphane(String isim) {
		super();
		this.isim = isim;
		this.indirimdekiKitaplar = new ArrayList<>();
		this.kitapListesi = new ArrayList<Kitap>();
		System.out.println("Kütüphane oluştu");
	}

	@Override
	public void kitapEkle() {
		String isim = Util.stringDegerAl("Kitap ismini giriniz");
		String yazar = Util.stringDegerAl("Kitabın yazarını giriniz");
		int fiyat = Util.intDegerAl("Kitabın fiyatını giriniz");
		Kitap kitap = new Kitap(isim, yazar, fiyat);
		this.kitapListesi.add(kitap);
		System.out.println(isim + " kütüphaneye eklendi.");
	}
	
	@Override
	public void kitaplariListele() {
		System.out.println(getIsim() + " arşivindeki kitaplar:");
		for(Kitap kitap : getKitapListesi()) {
			System.out.println("Kitap adı: " + kitap.getIsim() + ", Kitap Yazarı: " + kitap.getYazar() + ", Kitap Fiyatı: " + kitap.getFiyat());
		}
	}
	
	@Override
	public void yazaraGoreAra() {
		String yazar = Util.stringDegerAl("Kitaplarını aramak istediğiniz yazar adını giriniz.");
		System.out.println(yazar + " adlı yazarın kitapları:");
		for(Kitap kitap : getKitapListesi()) {
			if(kitap.getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(kitap.getIsim());
			}
		}
	}
	
	@Override
	public void kitapSil() {
		String silinecekKitap = Util.stringDegerAl("Silmek istediğiniz kitabı giriniz.");
		if(roam(silinecekKitap) != null) {
			getKitapListesi().remove(roam(silinecekKitap));
			System.out.println(silinecekKitap + " isimli kitap silindi.");
		}
		else {
			System.out.println("Kitap bulunamadı.");
		}
	}
	
	@Override
	public void indirimYap() {
		String kitap = Util.stringDegerAl("İndirim yapmak istediğiniz kitabı giriniz.");
		if(roam(kitap) != null){
			int indirim = Util.intDegerAl("İndirim miktarını giriniz.");
			roam(kitap).setFiyat(roam(kitap).getFiyat() - indirim);
					System.out.println(roam(kitap).getIsim() + " kitabının yeni fiyatı " + roam(kitap).getFiyat());
					getIndirimdekiKitaplar().add(roam(kitap));
		}
		else {
			System.out.println("Kitap bulunamadı.");
		}
	}
	
	private Kitap roam(String isim) {
		for(Kitap kitap : getKitapListesi()) {
			if(kitap.getIsim().equalsIgnoreCase(isim)) {
				return kitap;
			}
		}
		return null;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}

	public List<Kitap> getIndirimdekiKitaplar() {
		return indirimdekiKitaplar;
	}

	@Override
	public void indirimdekiKitaplariGoster() {
		System.out.println("indirimdeki kitaplar");
		for(Kitap kitap : getIndirimdekiKitaplar()) {
			System.out.println(kitap.getIsim());
		}
	}

	@Override
	public void kitapGuncelle() {
		String isim = Util.stringDegerAl("Değiştirmek istediğiniz kitabı giriniz.");
		if(roam(isim) != null) {
			String yeniIsim = Util.stringDegerAl("Yeni ismi giriniz.");
			roam(isim).setIsim(yeniIsim);
			System.out.println("güncel isim: " + yeniIsim);
		}
		else {
			System.out.println("Kitap bulunamadı.");
		}
	}	
}

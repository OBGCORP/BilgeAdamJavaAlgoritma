package lesson016.InterfaceUygulama;

public class Main {
	static Kutuphane kutuphane = new Kutuphane("Milli Kütüphane");
	
	public static void adminMenu() {
	
		while(true) {
			System.out.println("1- Kitap Ekle");
			System.out.println("2- Butun Kitapları Listele");
			System.out.println("3- Yazar İsmine Göre Kitap Ara");
			System.out.println("4- Kitap Sil");
			System.out.println("5- Kitaba İndirim Yap");
			int secim = Util.intDegerAl("Seçiminizi giriniz");
			switch (secim) {
			case 1:
				kutuphane.kitapEkle();
				break;
			case 2:
				kutuphane.kitaplariListele();
				break;
			case 3:
				kutuphane.yazaraGoreAra();
				break;
			case 4:
				kutuphane.kitapSil();
				break;
			case 5:
				kutuphane.indirimYap();
				break;
			default:
				
				break;
			}
		}
	}

	public static void main(String[] args) {
		 
		adminMenu();

	}

}

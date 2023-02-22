package lesson012;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// pizza spariş uygulaması
		//pizza sınıfı oluşturcaz 
		//attribute --> price, vejetaryen mı normal mi
		//vejeteryan 300 tl normal 200 tl
		
		//mainde 1 pizza oluşturalım
		
		
		menu();
		
	}
	//kullanıcıdan veggie mi normal mi
	//menu gelsin
	//1-sos ekle
	//2-peynir ekle
	//3-fiyatı görüntüle
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		boolean control = true;
		Pizza pizza = new Pizza();
		while(control) {
			System.out.println("Pizzanızı belirtin");
			System.out.println("1- Normal (200 TL)");
			System.out.println("2- Vejetaryen (300 TL)");
			int pizzaTipi = scanner.nextInt();
			if (pizzaTipi != 1 && pizzaTipi != 2) {
				System.out.println("Geçerli seçim yapınız.\n");
			}
			else {
				Pizza pizza0 = new Pizza (pizzaTipi == 1 ? false : true);
				pizza = pizza0;
				control = false;
			}			
		}
		control = true;	
		while (control) {
			System.out.println("\nPizza Tipiniz: " + (pizza.isVeggie() ? "Vejetaryen" : "Normal"));
			System.out.println("1- Sos ekle");
			System.out.println("2- Sos çıkar");
			System.out.println("3- Peynir ekle");
			System.out.println("4- Peynir çıkar");
			System.out.println("5- Eve sipariş iste");
			System.out.println("6- Pizza tipini değiştir");
			System.out.println("7- Pizza bilgilerini görüntüle");
			System.out.println("8- Siparişi tamamla");			
			System.out.println("Seçim Yapınız");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				pizza.sosEkle();
				break;
			case 2:
				pizza.sosCikar();
				break;	
			case 3:
				pizza.peynirEkle();
				break;
			case 4:
				pizza.peynirCikar();
				break;
			case 5:
				pizza.eveSiparisVer();
				break;
			case 6:
				pizza.pizzaTipiDegistir();
				break;
			case 7:
				pizza.fisAl();
				break;
			case 8:
				pizza.fisAl();
				System.out.println("Sipariş tamamlandı.");
				control = false;
				break;
			default:
				System.out.println("Geçersiz seçim yaptınız.");
				break;
			}					
		}		
	}
}

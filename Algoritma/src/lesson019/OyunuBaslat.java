package lesson019;

import java.util.Scanner;

public class OyunuBaslat {

	public static void menu() {
		PlakaTahmin plakaTahmin = new PlakaTahmin();
	
		String message = "Şehir Tahmin Oyununa Hoşgeldiniz\n" + "Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.\n"
				+ "1- Oyuna başla \n" + "2- Tahminlerim \n" + "0- Çıkış \n";
		
		int input;
		do {
			System.out.println("=================================");
			System.out.println(plakaTahmin.oyunSayisi + ". oyun");
			System.out.println(message);
			Scanner scanner2 = new Scanner(System.in);
			input = scanner2.nextInt();
			
			switch (input) {
			case 1:
				plakaTahmin.tahmin2();
				break;
			case 2:
				plakaTahmin.tahminListem();
				break;
			case 0:
				System.out.println("Çıkıs Yaptınız");
				break;

			default:
				break;
			}
		} while (input!=0);
	}
}

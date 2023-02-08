package lesson007;
import java.util.Scanner;

public class Question56 {

	private static void isimSoyisim(String isim, String soyisim) {
		System.out.println("İsminiz: " + isim + ", Soyisminiz: " + soyisim);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//parametre olarak girilen isim ve soyismi alıp ekrana yazdıralım
		System.out.println("isminizi girin");
		String name = scanner.next();
		System.out.println("soyisminizi girin");
		String surname = scanner.next();
		
		isimSoyisim(name, surname);
	}
}

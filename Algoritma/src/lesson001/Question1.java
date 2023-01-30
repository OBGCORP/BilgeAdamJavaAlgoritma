package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//Verilen isim ve soyisim değerlerini hello isim soyisim şeklinde yazdıralım
		String isim = "berk";
		String soyisim = "güneş";
		System.out.println("Hello " + isim + " " + soyisim);
		
		//girilen isim ve soyisimi yazdılarım
		
		Scanner input = new Scanner(System.in);
		System.out.println("isminizi giriniz:");
		String isim1 = input.next();
		System.out.println("soyisminizi giriniz:");
		String soyisim1 = input.next();
		System.out.println("Hello: " + isim1 + " " + soyisim1);
		
	}

}

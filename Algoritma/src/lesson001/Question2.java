package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		//verilen iki sayının çarpımı
		
		int x = 13, y = 51;
		int carpim = x * y;
		System.out.println("Sayıların çarpımı: " + carpim);
		System.out.println("************************");
		
		//girilen 2 sayının çarpımı
		Scanner input = new Scanner(System.in);
		System.out.println("ilk sayıyı giriniz:");
		int sayi1 = input.nextInt();
		System.out.println("ikinci sayiyi giriniz:");
		int sayi2 = input.nextInt();
		int carpim1 = sayi1 * sayi2;
		System.out.println("sayıların çarpımı: " + carpim1);
		
	}

}

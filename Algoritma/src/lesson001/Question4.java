package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//verilen iki sayıdan hangisi büyük
		int x = 19, y = 4;
		if (x > y) {
			System.out.println("büyük sayı: " + x);
		}
		else if (x < y) {
			System.out.println("büyük sayı: " + y);
		}
		else if (x == y) {
			System.out.println("sayılar eşit");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz");
		int sayi1 = input.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int sayi2 = input.nextInt();
		
		if (sayi1 > sayi2) {
			System.out.println("büyük sayı: " + sayi1);
		}
		else if (sayi1 < sayi2) {
			System.out.println("büyük sayı: " + sayi2);
		}
		else if (sayi1 == sayi2) {
			System.out.println("sayılar eşit");
		}
	}

}

package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Girilen sayı tek mi çift mi?
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz:");
		int sayi = scanner.nextInt();
		if ((sayi%2)== 0) {
			System.out.println("Girilen sayı çifttir.");		
		}
		else
			System.out.println("Girilen sayı tektir.");
	}

}

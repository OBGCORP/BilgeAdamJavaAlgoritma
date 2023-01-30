package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// girilen tl değerin usd karşılığı
		//1 usd = 18.9 tl
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("parayı tl cinsinden giriniz:");
		float TL = scanner.nextFloat();
		float USD = TL / 18.9f;
		System.out.println("paranın usd karşılığı: " + USD);
	}

}

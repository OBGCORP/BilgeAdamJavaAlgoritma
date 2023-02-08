package lesson007;
import java.util.Scanner;

public class Question58 {

	private static int kacBasamakli(int x) {
		String sayi = String.valueOf(x);
		int basamak = sayi.length();
		return basamak;
	}
	
	private static String bindenBuyukMu(int x) {
		if (x > 3)
			return "Bine eşit veya binden büyük";
		else
			return "Binden küçük";
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// parametre olarak int alan ve int dönen
		// girilen sayının kaç basamaklı olduğunu bulan metodu yazdıralım
		
		//daha sonra farklı bir metod yazdıralım
		//sayının 1000den büyük olup olmadığını kontrol edelim
		
		System.out.println("sayı giriniz");
		int sayi = scanner.nextInt();
		System.out.println(kacBasamakli(sayi) + " basamaklı");
		int basamak = kacBasamakli(sayi);
		System.out.println(bindenBuyukMu(basamak));

		
	}
}

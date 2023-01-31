package lesson002;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// iki sayı alıp toplamları çiftse true değilse false
		// en sonda sayıların toplamının yarısını yazdıralım
		Scanner scanner = new Scanner (System.in);
		System.out.println("ilk sayıyı giriniz:");
		int x = scanner.nextInt();
		System.out.println("ikinci sayıyı giriniz:");
		int y = scanner.nextInt();	
		int toplam = x + y;
		System.out.println(toplam % 2 == 0);		
		System.out.println("Sayıların toplamının: " + toplam/2f);
	}

}

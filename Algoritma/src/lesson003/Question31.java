package lesson003;
import java.util.Scanner;
public class Question31 {

	public static void main(String[] args) {
		// girilen sayının hangi basamağında hangi sayı var
		Scanner scanner = new Scanner (System.in);
		System.out.println("sayı giriniz");
		int sayi = scanner.nextInt();
		int basamak = 0;
		while(sayi>0) {
			basamak=sayi%10;
			sayi /= 10;
			System.out.println(basamak);
		}
	}
}

package lesson003;
import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		//girilen sayıya kadar olan sayıların toplamı
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;
		for(int i=1; i<=sayi; i++) {
			toplam += i;
		}
		System.out.println(toplam);
	}

}

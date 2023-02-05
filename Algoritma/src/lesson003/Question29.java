package lesson003;
import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// kullanıcıdan sürekli sayı al
		//kullanıcı sıfıra basana kadar girilen tüm sayıları çarp
		//while ya da do while
		
		Scanner scanner = new Scanner(System.in);
		int carpim = 1;
		System.out.println("sayı giriniz");
		int sayi = scanner.nextInt();	
		while(sayi != 0 ) {
			carpim *= sayi;
			System.out.println("sayı giriniz");
			sayi = scanner.nextInt();
		}
		System.out.println(carpim);
	}
}

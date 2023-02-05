package lesson003;
import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
//		// girilen sayının rakamları toplamını bulan program
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("sayi giriniz");
//		int sayi = scanner.nextInt();
//		int toplam = 0;
//		
//		do {
//			toplam = toplam + sayi%10;
//			sayi = sayi/10;
//		}while(sayi>0);
//		System.out.println(toplam);
//		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi2 = scanner.nextInt();
		int kalan = 0;
		int basamakToplam = 0;
		while (sayi2%10 > 0) {
			kalan = sayi2%10;
			basamakToplam = basamakToplam+kalan;
			sayi2 = sayi2 /10;
		}
		System.out.println(basamakToplam);
	}

}

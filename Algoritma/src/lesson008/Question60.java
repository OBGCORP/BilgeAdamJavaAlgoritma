package lesson008;
import java.util.Scanner;

public class Question60 {
	
	private static int yasHesapla(int x) {
		int yas = 2023 - x;
		return yas;
	}
	
	private static int yuzYilHesapla(int x) {
		int yuzYil = (x / 100) + 1;
		return yuzYil;
	}
	
	private static void bilgileriYazdir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum yılını giriniz");
		int x = scanner.nextInt();	
		System.out.println(yasHesapla(x) + " yaşında. " + yuzYilHesapla(x) + ". yüzyılda doğmuş.");
	}
	public static void main(String[] args) {

	bilgileriYazdir();

	}

}

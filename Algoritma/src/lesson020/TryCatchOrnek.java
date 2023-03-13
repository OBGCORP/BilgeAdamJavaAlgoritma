package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {

	public int bolmeYap() {
		boolean control = true;
		int bolum = 0;
		while (control) {
			try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Bölüneni giriniz");
			int bolunen = scanner.nextInt();
			System.out.println("Böleni giriniz");
			int bolen = scanner.nextInt();
				bolum = bolunen / bolen;
				control = false;
			} catch (ArithmeticException e) {
				System.out.println("Sayı sıfıra bölünemez");
				e.printStackTrace();
			} catch (InputMismatchException e) {
				System.out.println("Sayılardan başka karakter girmeyiniz");
			}
		}
		return bolum;
	}
}

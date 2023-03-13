package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {
	
	public static void elemaniGetir(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("index giriniz");
		try {
			int index = scanner.nextInt();
			System.out.println(arr[index]);
		} catch (InputMismatchException e) {
			System.out.println("hatalı index girdiniz");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("girilen index array uzunluğunu aşıyor");
		}
	}
	
	public static void sum(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			try {
				toplam += Integer.valueOf(string);
			} catch (Exception e) {
				hataToplam++;
			}
		}
		System.out.println("Array Sayiların toplamı: " + toplam + " Hatalı işlemler: " + hataToplam);
	}

	public static void sum2(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			if (string == null) {
				throw new NullPointerException("null olamazzzzzz");
			}
			try {
				toplam += Integer.valueOf(string);
			} catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}
		}
		System.out.println("Array Sayiların toplamı: " + toplam + " Hatalı işlemler: " + hataToplam);
	}

	public static void sum3(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			try {
				nullCheck(string);
				toplam += Integer.valueOf(string);
			} catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}
		}
		System.out.println("Array Sayiların toplamı: " + toplam + " Hatalı işlemler: " + hataToplam);
	}

	// nullpointer hatasını farklı bir methodda kontrol edelim
	public static String nullCheck(String string) throws NullPointerCheck {
		if(string == null) {
			throw new NullPointerCheck("null olamaz");
		}
		return string;
	}
	
	public static void elemanToplaVeHataSay(String[] arr) {
		int toplam = 0;
		int hataSayisi = 0;
		for(int i = 0; i < arr.length; i++) {
			try {
				toplam += Integer.valueOf(arr[i]);
			}catch (Exception e) {
				e.printStackTrace();
				hataSayisi++;
			}	
		}
		System.out.println("toplam: " + toplam + "\nhata sayisi: " + hataSayisi);
	}

	public static void main(String[] args) {
		
		String[] array = { "6", "10", "bc", null, "20" };
//		elemaniGetir(array);
		elemanToplaVeHataSay(array);
	}

}

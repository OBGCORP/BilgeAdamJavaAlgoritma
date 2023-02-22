package lesson009;
import java.util.Scanner;

public class Menu {
	public static Scanner scanner = new Scanner(System.in);
	public static void menu() {
		boolean control = true;
		while (control) {
			System.out.println("1. Toplama");
			System.out.println("2. Çıkarma");
			System.out.println("3. Bölme");
			System.out.println("4. Kuvvet Alma");
			System.out.println("5. Toplama");
			System.out.println("6. Toplama");
			System.out.println("7. Çıkış");
			System.out.print("Seçiminiz: ");
			int secim = scanner.nextInt();
			switch(secim) {
			case 1:
				toplama();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				bolme();
				break;
			case 4:
				kuvvetAl();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.err.println("ÇIKIŞ");
				control = false;
				break;
			default:
				System.err.println("Geçerli bir seçim yapınız.");	
				break;
								
			}
		}	
	}
	
	private static void toplama() {
		boolean control = true;
		int i = 1;
		int result = 0;
		System.out.println("Toplama");
		while(control) {
			System.out.print(i + ". Sayı: ");
			int sayi = scanner.nextInt();
			if(sayi == 0) {
				control = false;
				break;
			}
			else {
				result += sayi;
				i++;
			}
		}
		System.out.println("Sonuç: " + result);
	}
	
	private static void cikarma() {
		int i = 1;
		int result = 0;
		System.out.println("Çıkarma");
		System.out.println("Kaç adet sayı gireceksiniz?");
		int n = scanner.nextInt();
		while( i <= n) {
			System.out.print(i + ". Sayı: ");
			int sayi = scanner.nextInt();
			if(i == 1) {
				result += sayi;
				i++;
				continue;
			}
			result -= sayi;
			i++;
		}
		System.out.println("Sonuç: " + result);
	}
	
	private static void bolme() {
		int i = 1;
		double result = 0;
		System.out.println("Bölme");
		System.out.println("Kaç adet sayı gireceksiniz?");
		int n = scanner.nextInt();
		while( i <= n) {
			System.out.print(i + ". Sayı: ");
			int sayi = scanner.nextInt();
			if(i == 1) {
				result += sayi;
				i++;
				continue;
			}
			result /= sayi;
			i++;
		}
		System.out.println("Sonuç: " + result);
	}
	
	private static void kuvvetAl() {
		int i = 1;
		int result = 0;
		System.out.println("Kuvvet Alma");
		System.out.println("Kaç adet sayı gireceksiniz?");
		int n = scanner.nextInt();
		while( i <= n) {
			System.out.print(i + ". Sayı: ");
			int sayi = scanner.nextInt();
			if(i == 1) {
				result += sayi;
				i++;
				continue;
			}
			result = (int) Math.pow(result, sayi);
			i++;
		}
		System.out.println("Sonuç: " + result);
	}
}

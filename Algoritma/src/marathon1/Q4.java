package marathon1;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		boolean control = true;
		while (control) {
			System.out.println("*************************");
			System.out.println("* Geometrik Hesaplayıcı *");
			System.out.println("*************************\n");
			System.out.println("1. Kare alan hesaplama");
			System.out.println("2. Kare çevre hesaplama");
			System.out.println("3. Dikdörtgen alan hesaplama");
			System.out.println("4. Dikdörtgen çevre hesaplama");
			System.out.println("5. Daire alan hesaplama");
			System.out.println("6. Daire Çevre hesaplama");
			System.out.println("7. Çıkış");
			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();
			
			switch (secim) {
			
			case 1:
				System.out.print("Alanı hesaplanacak karenin kenar uzunluğunu giriniz: ");
				double a = scanner.nextInt();
				System.out.println("Karenin alanı: " + (a*a) + "\n");
				break;
			case 2:
				System.out.print("Çevresi hesaplanacak karenin kenar uzunluğunu giriniz: ");
				double b = scanner.nextInt();
				System.out.println("Karenin çevresi: " + (4*b) + "\n");
				break;
			case 3:
				System.out.print("Alanı hesaplanacak dikdörtgenin bir kenar uzunluğunu giriniz: ");
				double c = scanner.nextInt();
				System.out.print("Alanı hesaplanacak dikdörtgenin diğer kenar uzunluğunu giriniz: ");
				double d = scanner.nextInt();
				System.out.println("Dikdörtgenin alanı: " + (c*d) + "\n");
				break;
			case 4:
				System.out.print("Çevresi hesaplanacak dikdörtgenin bir kenar uzunluğunu giriniz: ");
				double e = scanner.nextInt();
				System.out.print("Çevresi hesaplanacak dikdörtgenin diğer kenar uzunluğunu giriniz: ");
				double f = scanner.nextInt();
				System.out.println("Dikdörtgenin çevresi: " + (2*(e+f)) + "\n");
				break;
			case 5:
				System.out.print("Alanı hesaplanacak dairenin yarıçapını giriniz: ");
				double g = scanner.nextInt();
				System.out.println("Dairenin alanı: " + (Math.PI*g*g) + "\n");
				break;
			case 6:
				System.out.print("Çevresi hesaplanacak dairenin yarıçapını giriniz: ");
				double h = scanner.nextInt();
				System.out.println("Dairenin çevresi: " + (2*Math.PI*h) + "\n");
				break;
			case 7:
				System.err.print("ÇIKIŞ YAPTINIZ.");
				control = false;
				break;
			default:
				System.err.print("Hatalı seçim yaptınız tekrar deneyiniz.\n");
				break;
			}
		}
	}
}

package lesson007;
import java.util.Scanner;

public class Question57 {
Scanner scanner = new Scanner(System.in);

	private static int toplayici(int x, int y) {
		return x+y;
	}
	private static boolean control(int x) {
		if (x > 18)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// topla metodu yazalım
		
		// toplam sonucunu kontrol edelim
		// toplamın 10dan büyük olup olmadığını bulalım
		
		System.out.println("sayı giriniz");
		int a = scanner.nextInt();
		System.out.println("bir tane daha sayı giriniz");
		int b = scanner.nextInt();
		
		int toplam = toplayici(a,b);
		
		System.out.println(control(toplam) ? "mekana girebilirsiniz" : "mekana giremezsiniz");

	}
}

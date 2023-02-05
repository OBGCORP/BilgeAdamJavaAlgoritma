package lesson003;
import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// girilen sayı 5in kuvveti mi değil mi
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi = scanner.nextInt();
		
		for (int i=2; i<sayi; i++) {
			if (sayi%i==0) {
				System.out.println("5in kuvveti değil");
				break;
			}
			else if(i%5==0) {
				continue;
			}
			else {
				System.out.println("5in kuvvetidir");
				break;
			}
		}
	}
}

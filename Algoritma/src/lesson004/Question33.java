package lesson004;
import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		//Klavyeden girilen 0 ile 100 arasında 0-  100 dahil 5 adet sayıdan
		//en büyük ve en küçük olanı bulan program
		
		Scanner scanner = new Scanner(System.in);
		int max = -1;
		int min = 101;
		int i = 0;
		int num;
		
		while (i<5) {
			System.out.println("Sayı girin");
			num = scanner.nextInt();
			
			if(num <= 100 && num >= 0) {
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
				i++;
			}
			else {
				System.out.println("Lütfen geçerli sayı giriniz.");
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}
	
}

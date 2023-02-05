package lesson003;
import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// girilen sayının asal olup olmadığını bulan program
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi = scanner.nextInt();
		if(sayi != 2 && sayi != 1 && sayi != 0) {
			for(int i=2; i<sayi; i++) {
				if (sayi%i==0) {
					System.out.println("asal değildir");
					break;
				}				
				else {
					System.out.println("asaldır");
					break;
				}
			}
		}
		else if (sayi == 2){
			System.out.println("asaldır");
		}
		else {
			System.out.println("asal değildir.");
		}
	}
}

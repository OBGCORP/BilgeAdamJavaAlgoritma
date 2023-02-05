package lesson004;
import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		// verilen kelimenin içinde kaç tane e harfi olduğunu bulan algoritma
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("kelime giriniz");
		String kelime = scanner.next();
		int sayac = 0;
		for(int i= 0; i < kelime.length(); i++) {
			if(kelime.charAt(i) == 'e') {
				sayac++;
			}		
		}
		System.out.println(sayac);
	}
}

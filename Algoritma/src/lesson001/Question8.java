package lesson001;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// kenarları girilen üçgenin nasıl bir üçgen olduğunu bulan program
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. kenar:");
		int kenar1 = scanner.nextInt();
		System.out.println("2. kenar:");
		int kenar2 = scanner.nextInt();
		System.out.println("3. kenar:");
		int kenar3 = scanner.nextInt();
		
		if ((kenar1 == kenar2)&& (kenar1 == kenar3)) {
			System.out.println("eşkenar üçgen");
		}
		else if((kenar1 == kenar2)&& (kenar1 != kenar3)) {
			System.out.println("ikizkenar üçgen");
		}
		else if((kenar1 == kenar3)&& (kenar1 != kenar2)) {
			System.out.println("ikizkenar üçgen");
		}
		else if((kenar2 == kenar3)&& (kenar2 != kenar1)) {
			System.out.println("ikizkenar üçgen");
		}
		else
			System.out.println("çeşitkenar üçgen");
		
		
	}

}

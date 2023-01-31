package lesson002;
import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// girilen üç sayı büyükten küçüğe
		Scanner scanner = new Scanner (System.in);
		System.out.println("ilk sayıyı giriniz");
		int x = scanner.nextInt();
		System.out.println("ikinci sayıyı giriniz");
		int y = scanner.nextInt();
		System.out.println("üçüncü sayıyı giriniz");
		int z = scanner.nextInt();
		if (x >= y && x>= z) {
			if (y >= z) {
				System.out.println("büyükten küçüğe sayılar: " + x+y+z);
			}
			else {
				System.out.println("büyükten küçüğe sayılar: " + x+z+y);
			}
		}
		else if(y >= z) {
			if (x >= z) {
				System.out.println("büyükten küçüğe sayılar: " + y+x+z);
			}
			else {
				System.out.println("büyükten küçüğe sayılar: " + y+z+x);
			}
		}
		else if(z >= y) {
			if (x >= y) {
				System.out.println("büyükten küçüğe sayılar: " + z+x+y);
			}
			else {
				System.out.println("büyükten küçüğe sayılar: " + z+y+x);
			}
		}
	}

}

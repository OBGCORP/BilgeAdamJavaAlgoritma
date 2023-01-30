package lesson001;
import java.util.Scanner;


public class Question10 {

	public static void main(String[] args) {
		// girilen 3 sayıdan en büyüğü
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz:");
		float sayi1 = scanner.nextFloat();
		System.out.println("ikinci sayiyi giriniz:");
		float sayi2 = scanner.nextFloat();
		System.out.println("üçüncü sayiyi giriniz:");
		float sayi3 = scanner.nextFloat();
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("en büyük sayi: " + sayi1);
		}
		else if(sayi2>sayi3) {
			System.out.println("en büyük sayi: " + sayi2);
		}
		else {
			System.out.println("en büyük sayi: " + sayi3);
		}
	}

}

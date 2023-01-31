package lesson002;
import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// Girilen karakterin ASCII kodunu bulan program
		Scanner scanner = new Scanner (System.in);
		System.out.println("Karakter giriniz");
		char karakter = scanner.next().charAt(0);
		int ASCII = karakter;
		System.out.println("girilen karakterin ASCII kodu: " + ASCII);
	}

}

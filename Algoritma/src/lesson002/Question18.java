package lesson002;
import java.util.Scanner;
public class Question18 {

	public static void main(String[] args) {
		// Girilen char değeri alfabenin içinde var mı yok mu
		Scanner scanner = new Scanner (System.in);
		System.out.println("karakter giriniz");
		char ch = scanner.next().charAt(0);
		if ((ch>=65 && ch<=90)||(ch>=97 && ch<=122)) {
			System.out.println("karakter alfabenin içinde var");
		}
		else {
			System.out.println("karakter alfabenin içinde yok");
		}
	}

}

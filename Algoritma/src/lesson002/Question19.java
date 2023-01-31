package lesson002;
import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// girilen karakter ünlü mü ünsüz mü
		Scanner scanner = new Scanner (System.in);
		System.out.println("karakter giriniz");
		char ch = scanner.next().charAt(0);
		if ((ch == 65)||(ch == 69)||(ch == 73)||(ch == 79)||(ch == 85)||(ch == 97)||(ch == 101)||(ch == 105)||(ch == 111)||(ch == 117)) {
			System.out.println("ünlü harf");
		}
		else if ((ch == 89)|| (ch == 121)) {
			System.out.println("duruma göre ünlü ve ünsüz");
		}
		else {
			System.out.println("ünsüz harf");
		}

	}

}

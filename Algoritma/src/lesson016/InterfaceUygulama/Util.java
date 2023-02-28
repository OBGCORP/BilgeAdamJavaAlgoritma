package lesson016.InterfaceUygulama;
import java.util.Scanner;

public class Util {

	static Scanner scanner = new Scanner(System.in);
	
	static public int intDegerAl(String sorgu) {
		System.out.println(sorgu);
		int deger = scanner.nextInt();
		scanner.nextLine();
		return deger;
	}
	
	static public String stringDegerAl(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}
}

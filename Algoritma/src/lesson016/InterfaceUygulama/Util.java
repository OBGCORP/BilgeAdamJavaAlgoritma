package lesson016.InterfaceUygulama;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Util {

	static Scanner scanner = new Scanner(System.in);
	
	static public int intDegerAl(String sorgu) {
		System.out.println(sorgu);
		boolean control = false;
		int deger = 0;
		do {
			try {
				deger = scanner.nextInt();
				scanner.nextLine();
				control = false;
			} catch (Exception e) {
				System.out.println("Hatalı girdi!");
				control = true;
			}
		} while (control);
		return deger;	
	}
	
	static public String stringDegerAl(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}
	
//	public static LocalDate stringTarih() {
//		boolean control = false;
//		int deger = 0;
//		final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		LocalDate date = null;
//		do {
//			try {
//				date = dateTimeFormatter.
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}while(control);
//	}
}

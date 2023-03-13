package lesson021;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Util {

	static Scanner scanner = new Scanner(System.in);

	public static int intDegerAlma(String sorgu) {
		boolean kontrol = false;
		int deger = 0;
		do {
			try {
				System.out.println(sorgu);
				deger = Integer.parseInt(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println("Lütfen bir rakam değeri giriniz");
				kontrol = true;
			}
		} while (kontrol);
		return deger;
	}
	
	public static double doubleDegerAlma(String sorgu) {
		boolean kontrol = false;
		double deger = 0;
		do {
			try {
				System.out.println(sorgu);
				deger = Double.parseDouble(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println("Lütfen bir rakam değeri giriniz");
				kontrol = true;
			}
		} while (kontrol);
		return deger;
	}

	public static String stringDegerAl(String sorgu) {
		System.out.println(sorgu);
		String deger = scanner.nextLine();
		return deger;
	}
	
	public static LocalDate stringTarih() {
		boolean kontrol = false;
		
		//final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		LocalDate date =null;
		do {
			try {
				date = LocalDate.parse(stringDegerAl("Lütfen bir tarih degeri giriniz(yıl-ay-gün)"));
				kontrol =false;
				//date = LocalDate.parse(date,dateTimeFormatter);
			} catch (DateTimeParseException e) {
				kontrol =  true;
			}
			
		} while (kontrol);
		return date;
	}
	//how to convert string to localDate
	//kullanıcıdan string olarak tarih alcaz (yıl-ay-gün) aldıgımız değeri localDate e çevircez
	//yanlış formatta hata fırlatalım
	
	public static void main(String[] args) {
		LocalDate date = stringTarih();
		System.out.println(date.getYear());
	}
}

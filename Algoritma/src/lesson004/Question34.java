package lesson004;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// java kelimesini
		//j
		//a
		//v
		//a şekline yazalım
		
		String text = "java";
		for (int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		
		//kullanıcın girdiği stringi 
		//örn: java
		//0. index j
		//1. index a şeklinde yazalım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = scanner.next();
		
		for(int i=0; i<kelime.length(); i++) {
			System.out.println(i+". index: " + kelime.charAt(i));
		}
	}

}

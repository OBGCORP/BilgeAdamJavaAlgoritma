package lesson006;
import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {
		// kelimedeki türkçe karakterleri ingilizceye çevirelim
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
        String[] turkceKarakter    = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String kelime = scanner.next();
        	kelime = kelime.replace('İ', 'I');
        	kelime = kelime.replace('ı', 'i');
        	kelime = kelime.replace('ş', 's');
        	kelime = kelime.replace('Ş', 'S');
        	kelime = kelime.replace('ç', 'c');
        	kelime = kelime.replace('Ç', 'C');
        	kelime = kelime.replace('ğ', 'g');
        	kelime = kelime.replace('Ğ', 'G');
        	kelime = kelime.replace('ü', 'u');
        	kelime = kelime.replace('Ü', 'U');
        	kelime = kelime.replace('ö', 'o');
        	kelime = kelime.replace('Ö', 'O');
        System.out.println(kelime);
	}
}

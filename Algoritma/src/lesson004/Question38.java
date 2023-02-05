package lesson004;
import java.util.Scanner;
public class Question38 {

	public static void main(String[] args) {
//		         Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
//		        harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
//		        eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
//		        2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
//		          giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
//		          içerisinde o harf varsa değiştirsin.
//		        3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
//		         * olmadığını bulunuz(kek,iki,kabak,kayak)
		//		4- harflerin arasına ? koy
		//		5- kelimenin ilk 3 harfini al sonra kalan harflerini . ile değiştir (3 harften kısaysa hata ver)
		
		Scanner scanner = new Scanner(System.in);
		boolean control = true;
		while (control) {
			System.out.println("    ---İşlemler---   ");
			System.out.println("1-   Harf Saydırma   ");
			System.out.println("2-  Harf Değiştirme  ");
			System.out.println("3- Polindrom Kontrolü");
			System.out.println("4-  Sistemden çıkış  ");
			int choice = scanner.nextInt();
			int counter = 0;
			
			switch (choice) {
			case 1:
				System.out.println("Bir kelime giriniz");
				String word = scanner.next();
				System.out.println("Saydırmak istediğiniz harfi giriniz");
				char ch = scanner.next().charAt(0);
				String indexler = "";
				for(int i = 0; i < word.length(); i++) {
					if(word.charAt(i) == ch) {
						counter++;
						indexler += i + ", ";
					}
				}
				if (counter == 0) {
					System.out.println(ch + " harfi kelimede bulunmuyor");
					break;
				}
				else {
					System.out.print(indexler.substring(0, indexler.length()-2) + " indexlerinde ");
					System.out.println("olmak üzere " + ch + " harfi kelimede " + counter + " kez geçiyor.");
				}
				break; 
			case 2:
				System.out.println("Bir kelime giriniz");
				word = scanner.next();
				boolean control1 = true;
				while (control1) {
					System.out.println("Kelimede değiştirmek istediğiniz harfi giriniz");
					char ch0 = scanner.next().charAt(0);
					for (int i = 0; i < word.length(); i++) {
						if(word.charAt(i) == ch0) {
							System.out.println(ch0 + " harfini hangi harf ile değiştireceğinizi giriniz");
							char ch1 = scanner.next().charAt(0);
							System.out.println("Yeni kelime: " + word.replace(ch0, ch1));
							control1 = false;
							break;
						}
						else if (i == word.length() -1) {
							System.out.println(ch0 + " harfi kelimede bulunmuyor.");
						}
					}
				}
				break;
			case 3:
				System.out.println("Bir kelime giriniz");
				word = scanner.next();
					for(int i = 0; i <= (word.length()/2); i++) {
						if(word.charAt(i) == word.charAt(word.length()-(1+i))) {
							if(i == (word.length()/2)) {
								System.out.println("Kelime polindromdur.");
							}
						}
						else {
							System.out.println("Kelime polindrom değildir.");
							break;
						}
					}
				break;
			case 4:
				System.err.println("ÇIKIŞ");
				control = false;
				break;
			default:
				System.out.println("Hatalı giriş yaptınız, yalnızca aşağıda yazılı işlemlerden birini seçiniz");
				break;
			}
			
		}

	}

}

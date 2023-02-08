package lesson006;
import java.util.Scanner;
public class Question47 {

	public static void main(String[] args) {
		// ikiye ikilik bir array oluşturalım
		//arraylerin içine kullanıcıdan alınan isimler yazdırılacak
		//çıktı olarak
		/*
		 * 1.grup
		 * ali
		 * mehmet
		 *
		 * 2.grup
		 * ahmet
		 * hakan
		 */
		Scanner scanner = new Scanner(System.in);
		String[][] isimler = new String[2][2];
		for (int i = 0; i < isimler.length; i++) {
			for (int j = 0; j < isimler[i].length; j++) {
				System.out.println("isim giriniz");
				String isim = scanner.nextLine();
				isimler[i][j] = isim;	
			}
		}
		for (int i = 0; i < isimler.length; i++) {
			System.out.println(i+1 + ". Grup");
			for (int j = 0; j < isimler[i].length; j++) {
				System.out.println(isimler[i][j]);
			}
		}
	}
}

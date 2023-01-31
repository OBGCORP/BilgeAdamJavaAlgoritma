package lesson002;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// telefona ve maile bir kod gelecek bu kodları biz tanımlayacağız
		// kullanıcıdan maile ve telefona gelen kodu iste
		// eğer kodlar uyuşuyorsa sisteme kayıt oldunuz de
		// yanlışlık varsa hata telefon kodunda mı mail konunda mı ikisinde mi
		Scanner scanner = new Scanner (System.in);
		int telefonKod = 776193;
		int mailKod = 810126;
		System.out.println("Telefonunuza gelen kodu giriniz:");
		int kullaniciTlfKod = scanner.nextInt();
		System.out.println("Mailinize gelen kodu giriniz:");
		int kullaniciMlKod = scanner.nextInt();
		if (telefonKod == kullaniciTlfKod && mailKod == kullaniciMlKod ) {
			System.out.println("Kayıt işlemi başarılı.");
		}
		else if (telefonKod == kullaniciTlfKod && mailKod != kullaniciMlKod) {
			System.out.println("Mail kodu yanlış.");
		}
		else if (telefonKod != kullaniciTlfKod && mailKod == kullaniciMlKod) {
			System.out.println("Telefon kodu yanlış.");
		}
		else {
			System.out.println("Telefon ve mail kodu yanlış.");
		}
	}

}

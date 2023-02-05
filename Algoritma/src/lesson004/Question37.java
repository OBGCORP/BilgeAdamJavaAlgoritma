package lesson004;
import java.util.Scanner;
public class Question37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean control=true;
		while (control) {
			
			System.out.println("Mail adresi giriniz");
			String mail = scanner.next();
			if (mail.contains("@hotmail.com") || mail.contains("@outlook.com")) {
				
				System.out.println("Şifre giriniz.");
				String sifre1 = scanner.next();
					if(sifre1.length()>=8) {
						System.out.println("Şifreyi tekrar giriniz.");
						String sifre2 = scanner.next();
							if(sifre1.equals(sifre2)) {
								System.out.println("Giriş başarılı.");
								control = false;
							}
							else
								System.out.println("Şifreler uyuşmuyor.");
					}
					else
						System.out.println("Şifre en az 8 karakter olmalıdır.");								
			}
			else
				System.out.println("Girdiğiniz email adresi formata uygun değil.");			
		}
	}
}

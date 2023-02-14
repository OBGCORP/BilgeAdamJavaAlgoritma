package lesson008;
import java.util.Scanner;

public class Question62 {
	
	private static boolean mailCheck(String mail) {
		boolean check = false;
		if(mail.contains("@") && (mail.endsWith("hotmail.com") || mail.endsWith("gmail.com"))) {
			check = true;
		}
		return check;
	}
	
	private static boolean passCheck(String x, String y) {
		boolean check = false;
		if (x.equals(y)) {
			check = true;
		}
		return check;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mail giriniz");
		String m = scanner.next();
		System.out.println("password giriniz");
		String p = scanner.next();
		System.out.println("re-password giriniz");
		String rp = scanner.next();
		
		if (mailCheck(m) && passCheck(p, rp)) {
			System.out.println("giriş başarılı");
		}
		else {
			System.err.println("hatalı giriş");
		}
		

	}

}

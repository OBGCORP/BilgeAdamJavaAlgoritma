package lesson002;
import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
//		 Koç Burcu : 21 Mart - 20 Nisan
//       Boğa Burcu : 21 Nisan - 21 Mayıs
//       İkizler Burcu : 22 Mayıs - 22 Haziran
//       Balık Burcu : 20 Şubat - 20 Mart  
//       Default --> lütfen 1-12 arasında bir sayı girin
//		 Switch case
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("kaçıncı ayda doğdunuz?");
		int ay = scanner.nextInt();
		System.out.println("hangi gün doğdunuz?");
		int gun = scanner.nextInt();
		
		switch (ay) {
		case 3:
			if(gun>=21) {
				System.out.println("koç burcu");
			}
			else {
				System.out.println("balık burcu");
			}
			break;
		case 4:
			if (gun< 21) {
				System.out.println("koç burcu");
			}
			else {
				System.out.println("boğa burcu");
			}
			break;
		case 5:
			if (gun<21) {
				System.out.println("boğa burcu");
			}
			else {
				System.out.println("ikizler burcu");
			}
			break;

		default:
			System.out.println("1-12 arasında bir sayı girin");
			break;
		}

	}

}

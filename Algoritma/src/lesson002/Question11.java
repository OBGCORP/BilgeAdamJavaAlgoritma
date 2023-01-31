package lesson002;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		//Dairenin çevresi ve alanını hesaplayan program
		//r değeri kullanıcıdan alınsın
		//PI = 3.14
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yarıçap (r) giriniz:");
		double r = scanner.nextFloat();
		double cevre = 2*3.14f*r;
		double alan = 3.14f*r*r;
		System.out.println("Dairenin çevresi: " + cevre + "\nDairenin alanı: " + alan);
	}

}

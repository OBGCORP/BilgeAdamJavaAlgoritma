package lesson008;
import java.util.Random;
import java.util.Scanner;

public class Question65 {

	private static String randomOrt() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Kaç adet random sayının ortalamasını almak istiyorsunuz");
		int x = scanner.nextInt();
		int[] randomArr = new int[x];
		for(int i = 0; i < x; i++) {
			randomArr[i] = random.nextInt(0,500);
			System.out.println(randomArr[i]);
		}
		double ort = 0;
		for(int i : randomArr ) {
			ort += i;
		}
		return "Ortalama: " + (ort/x);
	}
	
	public static void main(String[] args) {

		System.out.println(randomOrt());

	}

}

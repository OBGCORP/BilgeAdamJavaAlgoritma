package lesson007;
import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		// iki kez üst üste klavyeden aynı sayı girene kadar döngü devam edecek
		//üst üste iki sayı girildiğinde o zamana kadar girilen sayıların ortalamasını veren program
		//son sayıyı ortalamaya katmayalım
		Scanner scanner = new Scanner (System.in);
		double sum = 0;
		int birOnceki = 0;
		double counter = 0;
		double ortalama = 0;
		boolean control = true;
		while(control){
			System.out.println("sayı giriniz");
			int num = scanner.nextInt();
			if(num != birOnceki) {
				sum+=num;
				counter++;
				birOnceki = num;			
			}
			else {
				control = false;
				ortalama = sum/counter;
				System.out.println("Ortalama: " + (ortalama));
			}
		}
	}
}

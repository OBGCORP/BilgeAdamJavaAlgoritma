package lesson003;
import java.util.Scanner;
public class Question22 {

	public static void main(String[] args) {
		// girilen sayı için çarpım tablosunu veren program
		Scanner scanner = new Scanner (System.in);
		System.out.println("sayi giriniz");
		int sayi = scanner.nextInt();
		for(int i=0; i<=10; i++) {
			int carpim = sayi * i;
			System.out.println(sayi + "x" + i + "=" + carpim);
		}
		
		System.out.println("*************");
		//iç içe for kullanarak çözelim 
		//bütün çarpım tablosunu yazdıralım
		
		for(int i=1; i<=10; i++) {
				for(int j=0; j<=10; j++) {
					System.out.println(i + " x " + j + " = " + i*j);
				}
		}
	}

}

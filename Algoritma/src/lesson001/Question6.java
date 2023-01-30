package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// kullanıcıdan alından vize ve final notlarından geçip geçmediğini hesaplama
		//vize 40%
		//final 60%
		// => 50 geçer, <50 kalır
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("vize notunuzu giriniz:");
		float vizeNotu = scanner.nextFloat();
		System.out.println("final notunuzu giriniz:");
		float finalNotu = scanner.nextFloat();
		float ortalama = vizeNotu*0.4f + finalNotu*0.6f;
		if (ortalama < 50) {
			System.err.println("dersten kaldınız.");
		}
		else
			System.out.println("dersten geçtiniz.");
	}

}

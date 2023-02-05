package lesson005;
import java.util.Random;
import java.util.Scanner;

public class Question39 {
	//sayı tahmin uygulaması
	//sürekli kullanıcıdan tahmin iste
	//eğer tahmin bulunması gereken sayıdan az ise tahmini yükseltin, fazla ise azaltın
	//doğru cevabı verince kaçıncı denemede bulduğunu söyleyelim

	public static void main(String[] args) {
		
		// random int sayı üretelim
		
		Random random = new Random();
		int randomNumber = random.nextInt(0, 101);
		
////		alternatif
//		int rastgele = (int) (Math.random() * 100);
//		System.out.println(rastgele);
		
		Scanner scanner = new Scanner(System.in);
		boolean control = true;
		int sayac = 0;
		System.out.println("Sayı tahmininizi girin");
		int sayi = scanner.nextInt();
		while (control) {
			if(sayi == randomNumber) {
				control = false;
			}
			else if(sayi < randomNumber) {
				System.out.println("Tahmininizi arttırın\n");
				System.out.println("Tekrar tahminde bulunun");
				sayi = scanner.nextInt();
			}
			else {
				System.out.println("Tahmininizi azaltın\n");
				System.out.println("Tekrar tahminde bulunun");
				sayi = scanner.nextInt();
			}
			sayac++;
		}
		System.out.println("Evet! Doğru cevap: "+ randomNumber +"."+ "\nSayıyı " + sayac + ". denemede bildiniz!");
	}

}

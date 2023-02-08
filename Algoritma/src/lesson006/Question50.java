package lesson006;

public class Question50 {

	public static void main(String[] args) {
		// dizide ard arda iki kere 2 değeri geliyorsa true gelmiyorsa false yazdıralım
		int[] sayilar = { 2, -256, -256, 2, 2, 1258, 32 };
		for(int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == 2 && sayilar[i+1] == 2) {
				System.out.println("true");
				break;
			}
			else if(i == sayilar.length - 1) {
				System.out.println("false");
			}
		}
	}
}

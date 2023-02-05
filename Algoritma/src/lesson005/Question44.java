package lesson005;

public class Question44 {

	public static void main(String[] args) {
		// sıfırdan küçükleri farklı bir diziye atalım
		int[] sayilar = { -2,-4,10,5 ,4,5,-5,-3,-3,-4,-3};
		int counter = 0;
		for(int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] < 0) {
				counter++;
			}
		}
		Integer[] newArray = new Integer[counter];
		for(int j = 0; j < newArray.length; j++) {
			for(int i = 0; i < sayilar.length; i++) {
				if(sayilar[i] < 0) {
					newArray[j] = sayilar[i];
					j++;
				}
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}
}

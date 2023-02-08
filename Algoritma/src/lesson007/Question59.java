package lesson007;

public class Question59 {
	private static int[] tekler(int[][] x) {
		int counter = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] % 2 == 1) {
					counter++;
				}
			}
		}
		int[] array = new int[counter];
		int index = 0;
		for(int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if(x[i][j] % 2 == 1) {
					array[index] = x[i][j];
					index++;
				}
			}
		}
		return array;
	}
	
	public static void arrayYazdir(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		//2 farklı metod yazalım 
		//parametre olarak dizi(array) aldığı dizideki tek elemanları 
		//farklı bir diziye atacak
		
		//diğer metod da teksayıların olduğu diziyi ekrana yazdıracak
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };

		tekler(matris);
		arrayYazdir(tekler(matris));
	}

}

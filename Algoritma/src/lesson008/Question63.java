package lesson008;

public class Question63 {
	
	private static void arrayToplar(int[] x, int[] y) {
		int[] toplam = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			toplam[i] = x[i] + y[i];
		}
		for(int i = 0; i < toplam.length; i++) {
			System.out.print(toplam[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
        int[] array2 = { 1, 2, 3, 4, 5, 6 };
        
        arrayToplar(array1, array2);

	}

}

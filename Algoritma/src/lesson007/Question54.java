package lesson007;

public class Question54 {

	public static void main(String[] args) {
		// verilen dizide rakamları farkının en az olduğu iki sayının farkını yazdıralım
		
		int[] array2 = { 1, -10, -4, -20 };
		//mutlak değer alabiliriz
		//int mutlakDeger = Math.abs(-4);
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array2.length; i++) {
			for(int j = i + 1; j < array2.length; j++) {
			int rakFark = Math.abs(array2[i] - array2[j]);
				if( rakFark < min) {
					min = rakFark;
				}
			}
		}
		System.out.println(min);
	}
}
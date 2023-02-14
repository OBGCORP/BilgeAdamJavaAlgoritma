package marathon1;

public class Q2 {

	private static void dizideTekrar(int[] x) {
		for(int i = 0; i < x.length; i++) {
			int counter = 0;
			for(int j = 0; j < x.length; j++) {
				if(x[i] == x[j]) {
					counter++;
				}			
			}
			if (counter > 1) {
				System.out.println(x[i] + " sayisi " + (counter) + " kez tekrar ediyor.");
				break;
			}
			if( i == x.length - 1) {
				System.out.println("Tekrar eden sayi bulunmamistir.");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int sayiDizisi1[] = { 9, 7, 5, 3, 7, 7, 23, 18, 2, 0, 7 };
		dizideTekrar(sayiDizisi1);
		
		System.out.println("\n***********************\n");
		
		int sayiDizisi2[] = { 0, 1, 5, 3 };
		dizideTekrar(sayiDizisi2);

	}

}

package lesson006;

public class Question49 {

	public static void main(String[] args) {
		// tek sayıları farklı bir arrayin içine atalım
		int[][] matris = {{ 56, 23, 678, 231, 5 },
						  { 234, 21, 78, 26, 6 },
						  { 654, 33, 32, 67, 2 },
						  { 189, 35, 56, 89, 8 }};
		int counter = 0;
		for (int i = 0; i < matris.length; i++) {
			for(int j = 0; j < matris[i].length; j++) {
				if(matris[i][j] % 2 == 1) {
					counter++;
				}
			}
		}
		int[] odds = new int[counter];
		int oddsIndex = 0;
		for (int i = 0; i < matris.length; i++) {
			for(int j = 0; j < matris[i].length; j++) {
				if(matris[i][j] % 2 == 1) {
					odds[oddsIndex] = matris[i][j];
					oddsIndex++;
				}
			}
		}
		for(int i = 0; i < odds.length; i++) {
			System.out.print(odds[i] + " ");
		}
	}
}

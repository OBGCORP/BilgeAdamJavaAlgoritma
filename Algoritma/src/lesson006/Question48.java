package lesson006;

public class Question48 {
	// verilen 2 matristeki sayıları toplayan program
	// toplanan sayıları 2ye 3lük yeni bir matrise atalım
	
	/*
	 * 8 10 3
	 * 10 4 12
	 */
	public static void main(String[] args) {
		
		int[][] matris1 = {{5,6,2}, {9,1,6}};
		int[][] matris2 = {{3,4,1}, {1,3,6}};
		int[][] result = new int[2][3];
		
		for(int i = 0; i < matris1.length; i++) {
			for(int j = 0; j < matris1[i].length; j++) {
				result[i][j] = matris1[i][j] + matris2[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}

package lesson006;

public class Question45 {

	public static void main(String[] args) {
		
		String[][] matris1 = { { "Bilge", "Advanced" }, { "Postgre", "Data" } };
		String[][] matris2 = { { "Adam", "Java" }, { "SQL", "Base" } };

		//BilgeAdam
		//AdvancedJava
		//...
		for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris2.length; j++) {
				System.out.println(matris1[i][j] + matris2[i][j]);
			}
		}
	}
}

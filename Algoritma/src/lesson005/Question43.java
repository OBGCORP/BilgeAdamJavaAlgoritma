package lesson005;

public class Question43 {

	public static void main(String[] args) {
		// dizi içinde 2 ve 4 ün kaç kere geçtğini
		// hangisinin daha fazla olduğunu bulan program

		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		int ikiler = 0;
		int dortler = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 2)
				ikiler++;
			else if(array[i] == 4)
				dortler++;
		}
		if(ikiler > dortler)
			System.out.println("2 ler 4 lerden daha fazla. " + ikiler + " adet 4 var");
		else if(dortler > ikiler)
			System.out.println("4 ler 2 lerden daha fazla. " + dortler + " adet 4 var");
		else
			System.out.println("2 ler ve 4 ler eşit " + dortler + "er tane 4 ve 2 var");
	}
}

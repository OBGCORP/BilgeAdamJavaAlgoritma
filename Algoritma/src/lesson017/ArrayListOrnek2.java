package lesson017;
import java.util.Random;
import java.util.ArrayList;

public class ArrayListOrnek2 {

	public static void main(String[] args) {
		ArrayList<Integer> tekler = new ArrayList<>();
		ArrayList<Integer> ciftler = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 35; i++) {
			int sayi = random.nextInt(1,100);
			if(sayi % 2 == 0) {
				ciftler.add(sayi);
			}
			else {
				tekler.add(sayi);
			}
		}
		
		System.out.println(tekler);
		System.out.println(ciftler);
	}
}

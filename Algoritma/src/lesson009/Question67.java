package lesson009;

public class Question67 {
	
	private static int kucukleriSay(int[] x, int y) {
		int sayac = 0;
		for (int i = 0; i < x.length; i++) {
			if(y > x[i]) {
				sayac++;
			}
		}
		return sayac;
	}

	public static void main(String[] args) {
		
		//girilen sayı arrayedki kaç tane sayıdan büyük oldugunu bulan method
		//array uzunlugu 1 ile 100 arasında olacak
		//girilen sayi 1 ile 100 arasında olacak
		//arrayin içindeki sayılarda 1 ile 100 arasında olacak
		//method int bir değer dönecek
		int[] myNum = { 1, 3, 4, 6, 9 };
		
//		buyukleriSay(myNum,6); //--> 3
//		buyukleriSay(myNum,3); //--> 1
		
		System.out.println(kucukleriSay(myNum, 6));
		System.out.println(kucukleriSay(myNum, 3));
		
	}

}

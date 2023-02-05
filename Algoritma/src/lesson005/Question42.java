package lesson005;

public class Question42 {

	public static void main(String[] args) {
		int[] sayilar = {2,4,10,5};

		//bu sayı çifttir ve bu sayı tektir şeklinde çıktı alan ve
		//dizideki tüm sayıların toplamını veren program
		int toplam = 0;
		for(int i=0; i<sayilar.length; i++) {
			toplam += sayilar[i];
			if(sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i]+" çifttir");
			}
			else {
				System.out.println(sayilar[i]+" tektir");
			}
		}
		System.out.println("toplam: "+ toplam);
	}
}

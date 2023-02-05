package lesson003;

public class Question24 {

	public static void main(String[] args) {
		// 1den 100e kadar çift sayıların toplamının tek sayıların toplamına oranını bulan program
		double cift=0;
		double tek=0;
		for(int i=1; i<=99; i+=2) {
			tek+=i;
		}
		for(int i=2; i<=100; i+=2) {
			cift+=i;
		}
		double oran = cift/tek;
		System.out.println("cift/tek= " + oran);
	}

}

package lesson009;

public class Question68 {
	
	private static int sesliHarfSayisi(String x) {
		int sayac = 0;
		x = x.toLowerCase();
		for(int i = 0; i < x.length(); i++) {
			if("aeiou".contains(String.valueOf(x.charAt(i)))){
				sayac++;
			}
		}
		return sayac;
	}

	public static void main(String[] args) {
		// girilen kelimelerdeki sesli harflerin sayısınu bulan metod
		//metod int dönecek parametre olarak string alacak
		System.out.println(sesliHarfSayisi("berk"));
	}

}

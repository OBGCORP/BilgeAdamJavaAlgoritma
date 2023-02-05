package lesson005;

public class Question40 {

	public static void main(String[] args) {
		// a ile biten kelimelerin yerine ? koyalım
		// değişen indexleri ve yeni değerlerini yazdıralım
		
		String[] dizi = { "Amerika", "Almanya", "İsveç", "Türkiye", "Danimarka" };
		for(int i=0; i < dizi.length; i++) {
			if(dizi[i].endsWith("a")) {				
				dizi[i] = "?";
				System.out.println(i + ". index \"?\" ile değişti");
			}
		}
		System.out.println();
		for (int i=0; i < dizi.length; i++)
		System.out.println(dizi[i]);
	}
}

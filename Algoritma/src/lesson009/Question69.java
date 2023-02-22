package lesson009;

import java.util.Iterator;

public class Question69 {
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			 "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			 "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			 "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			 "Kilis", "Osmaniye", "Düzce" };
	
	private static void ilMetodu(char x) {
		for(int i = 0; i < iller.length; i++) {
			if(iller[i].charAt(1) == x) {
				System.out.println(iller[i]+ " --> " + iller[i].substring(0,3).toUpperCase());
			}
		}
	}
	
	private static void ilMetodu2(String[] x) {
		for(String kelime : x) {
			if(kelime.charAt(0) == 'B') {
				System.out.println(kelime + " --> " + kelime.substring(0,3).toUpperCase());
			}
		}
	}
	
	private static String[] ilMetodu3() {
		String[] sesliSil = new String[iller.length];
		int a = 0;
		for(String kelime : iller) {
			for(int i = 0; i < kelime.length(); i++) {
				if("AEIOUaeiouöü".contains(String.valueOf(kelime.charAt(i)))) {
					kelime = kelime.replace((String.valueOf(kelime.charAt(i))), "");					
				}			
			}
			sesliSil[a] = kelime;
			a++;
		}
		return sesliSil;
	}
	
	public static void plakaBul(String[] array, String... il) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < il.length; j++) {
				if(array[i].equals(il[j])) {
					if(i<10) {
						System.out.println("0" + (i+1) + "-" + array[i]);
					}
					else {
						System.out.println((i+1) + "-" + array[i]);
					}
				}
			}
		}
	}
	

	
	public static void main(String[] args) {
		
//		ilMetodu('a');
//		ilMetodu2(iller);
		String[] illerYeni = ilMetodu3();
		for (int i = 0; i < illerYeni.length; i++) {
			System.out.println(illerYeni[i]);
		}
		
		plakaBul(iller, "Ankara", "Adana", "Bursa", "İzmir");

	}

}

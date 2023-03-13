package marathon2.soru2;

public class CSTRMain {

	public static void main(String[] args) {

		CustomStringTR s = new CustomStringTR("Merhaba ");
		
		System.out.println(s.uzunluk());
		
		System.out.println(s.indekstekiKarakter(3));
		
		System.out.println(s.sonunaEkle(" Dünya"));
		
		System.out.println(s.tekrarla(3));
		
		System.out.println(s.hepsiBuyukHarf());
		
		System.out.println(s.hepsiKucukHarf());
		
		System.out.println(s.ayniMi("Selam"));
		System.out.println(s.ayniMi("Merhaba "));
		
		System.out.println(s.icindeGeciyorMu("erh"));
		
		System.out.println(s.karakteriDegistir('e', 'a'));
		
		System.out.println(s.tirasla());

	}

}

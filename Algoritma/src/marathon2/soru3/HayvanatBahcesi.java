package marathon2.soru3;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HayvanatBahcesi {

	private HashSet<Hayvan> hayvanlar;

	public HayvanatBahcesi() {
		super();
		this.hayvanlar = new HashSet<Hayvan>();
	}
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		getHayvanlar().add(m);
	}
	
	public void bahceyeSurungenEkle(Surungen s) {
		getHayvanlar().add(s);
	}
	
	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}
	
	public void hayvaninCinsiniBul(String hayvanAdi) {
		List<Hayvan> hayvanc = getHayvanlar().stream().filter(h -> h.getAd().equalsIgnoreCase(hayvanAdi.trim())).collect(Collectors.toList());
		if(hayvanc.isEmpty()) {
			System.out.println(hayvanAdi + " isimli hayvan bu Hayvanat Bahçesinde bulunmuyor");
		}
		else {
			System.out.println(hayvanc.get(0).getAd() + " bir " + hayvanc.get(0).getCinsi());
		}
	}
	
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		List<Hayvan> hayvanc = getHayvanlar().stream().filter(h -> h.getAd().equalsIgnoreCase(hayvanAdi.trim())).collect(Collectors.toList());	
		if(hayvanc.isEmpty()) {
			System.out.println(hayvanAdi + " isimli hayvan bu Hayvanat Bahçesinde bulunmuyor");
		}
		else {
			System.out.println(hayvanc.get(0).toString());
		}		
	}
	
	public void hayvaniHareketEttir(String hayvanAdi) {
		List<Hayvan> hayvanc = getHayvanlar().stream().filter(h -> h.getAd().equalsIgnoreCase(hayvanAdi.trim())).collect(Collectors.toList());
		if(hayvanc.get(0).equals("Aslan") || hayvanc.get(0).equals("Maymun")) {
			MemeliHayvan mh =(MemeliHayvan) hayvanc.get(0);
			mh.yuru();
		}
		else if(hayvanc.get(0).equals("Yılan") || hayvanc.get(0).equals("Kertenkele")) {
			Surungen s = (Surungen) hayvanc.get(0);
			s.surun();
		}
		else if(hayvanc.isEmpty()) {
			System.out.println(hayvanAdi + " isimli hayvan bu Hayvanat Bahçesinde bulunmuyor");
		}
	}
	
	public HashSet<Hayvan> getHayvanlar(){
		return this.hayvanlar;
	}
	
}

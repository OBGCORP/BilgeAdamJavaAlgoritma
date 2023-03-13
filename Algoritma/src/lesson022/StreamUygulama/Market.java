
package lesson022.StreamUygulama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Market {

	EUrun[] product = EUrun.values();
	List<Urun> urunler = new ArrayList<>();
	Map<String, Double> urunMap = new HashMap<>();

	public Market() {
		urunOlustur();
		urunFiyatMapOlustur();
	}

	public void urunOlustur() {
		// product arrayini liste(internetten araştırın) çevircez daha sonra streame
		// çevircez
		// sonra içinde işlem apabilcek duruma gelcez
		// Urun nesnesi oluşturuken değerleri EURUN içinden alcaz.

		urunler = Arrays.asList(product) // Liste
				.stream()// Stream
				.map(urun -> new Urun(urun.name(), urun.fiyat)).collect(Collectors.toList());
	}

	public void urunleriListele() {
		// urunler.forEach(Urun::toString);
		// urunler.forEach(System.out::println);
		urunler.forEach(urun -> System.out.println(urun.getName()));
	}

	// urunFiyat listesi olustur
	public void urunFiyatMapOlustur() {

		urunMap = urunler.stream().collect(Collectors.toMap(urun -> urun.getName(), urun -> urun.getPrice()));

//		for (Urun urun : urunler) {
//			urunMap.put(urun.getName(), urun.getPrice());
//		}
	}

	public void fiyatListesi() {
		urunMap.forEach((key, value) -> System.out.println(key + "-->  " + value));
		// urunMap.entrySet().forEach(System.out::println);
	}
	
	//fiyati50 den büyük olan ürünleri Listeleleyelim
	public void fiyati50denBuyukOlanlar() {
		List<Entry<String, Double>> ellidenBuyukler = urunMap.entrySet().stream().filter(x -> x.getValue() > 50).collect(Collectors.toList());
		System.out.println("Fiyatı elliden büyük olanlar " + ellidenBuyukler);
	}
	
	public void ortalama() {
		List<Urun> ellidenBuyukler = urunler.stream().filter(urun -> urun.getPrice() > 50).collect(Collectors.toList());
		ellidenBuyukler.stream().mapToDouble(i -> i.getPrice()).average().ifPresent(avg -> System.out.println("Average found is: " + avg));
	}

}

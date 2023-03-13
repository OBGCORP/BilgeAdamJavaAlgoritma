package lesson022;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Kisi kisi1 = new Kisi("ahmet", 51, ECinsiyet.ERKEK, 1000);
		Kisi kisi2 = new Kisi("ali", 25, ECinsiyet.ERKEK, 5000);
		Kisi kisi3 = new Kisi("zeynep", 18, ECinsiyet.KADIN, 1000);
		Kisi kisi4 = new Kisi("defne", 42, ECinsiyet.KADIN, 4000);
		Kisi kisi5 = new Kisi("aslı", 32, ECinsiyet.KADIN, 5000);

		List<Kisi> kisiler = new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		
		List<Kisi> kadinlar = kisiler.stream().filter(kisi -> kisi.getCinsiyet().equals(ECinsiyet.KADIN)).collect(Collectors.toList());
		System.out.println("Kadınlar");
		System.out.println(kadinlar);
		
		List<Kisi> yaslaraGoreSiralanmisKisiler = kisiler.stream().sorted(Comparator.comparing(Kisi :: getAge)).collect(Collectors.toList());
		yaslaraGoreSiralanmisKisiler.forEach(System.out::println);
		
		Map<String, Integer> isimVeYaslar = kisiler.stream().collect(Collectors.toMap(kisi -> kisi.getName(), kisi -> kisi.getAge()));
		isimVeYaslar.forEach((key, value) -> System.out.println(key + " " + value));
	}

}

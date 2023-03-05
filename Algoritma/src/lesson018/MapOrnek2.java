package lesson018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MapOrnek2 {

	public static void main(String[] args) {

		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
		int[] notlar = { 60, 80, 70 };
		int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80}};

		//Hashmap --> hashcodelar hesaplanıyor ona göre sıralanıyor
		//LinkedHashMap --> direkt referans tuttuğu için sıra bozulmuyor
		
		HashMap<String, Integer> notlarMap = new HashMap<>();
		for(int i = 0; i < ogrenci.length; i++) {
			notlarMap.put(ogrenci[i], notlar[i]);
		}
		
//		for(String s : notlarMap.keySet()) {
//			System.out.println(s + " notu " + notlarMap.get(s));
//		}
		
		for (Entry<String, Integer> entry : notlarMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());		
		}
		
		HashMap<String, int[]> hm = new HashMap<>();
		for(int i = 0; i < notlar2.length; i++) {
			hm.put(ogrenci[i], notlar2[i]);
		}
		
		for (Entry<String, int[]> entry : hm.entrySet()) {
			System.out.println(entry.getKey());
			for(int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i]);
			}
		}
		
		int[][] notlar3 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80}};
		HashMap<String, List<Integer>> map3 = new HashMap<>();
		
		for (int i = 0; i < notlar3.length; i++) {
			int sira = i;
			List<Integer> listNotlar = new ArrayList<>();
			for(int j = 0; j < notlar3[i].length; j++) {
				listNotlar.add(notlar3[i][j]);
			}
			map3.put(ogrenci[i], listNotlar);
		}
		
		System.out.println(map3);
		for (Entry<String, List<Integer>> entry : map3.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

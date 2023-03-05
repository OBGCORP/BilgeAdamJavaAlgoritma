package lesson018;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String kelime = scanner.next();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < kelime.length(); i++) {
			if(hm.containsKey(kelime.charAt(i))) {
				hm.put(kelime.charAt(i), hm.get(kelime.charAt(i)) + 1);
			}
			else {
				hm.put(kelime.charAt(i), 1);
			}
		}
		
		for(Character c : hm.keySet()) {
			System.out.println(c + " - " + hm.get(c));
		}

	}

}

package lesson008;

import java.util.Scanner;

public class Question61 {

	private static boolean asalMi(int x) {
		boolean result = true;
		if (x == 1 || x == 0) {
			result = false;
		} else {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					result = false;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		for(int i = 0; i < 1000; i++) {
			if (asalMi(i)) {
				System.out.print(i + " ");
			}
		}
	}

}

package marathon1;

public class Q3 {
	
	private static int karakterSayici(String x, char y) {
		int counter = 0;
		for(int i = 0; i < x.length(); i++) {
			if(x.charAt(i) == y) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(karakterSayici("Bugün güzel bir gün", 'g'));
		System.out.println("\n*********************\n");
		System.out.println(karakterSayici("Bugün güzel bir gün", 'x'));

	}

}

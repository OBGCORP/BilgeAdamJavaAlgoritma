package marathon1;

public class Q1 {
	
	private static void printStars() {
		String star = "* ";
		for(int i = 0; i < 10; i++) {
			if(i < 6) {
				System.out.println(star);
				star += "* ";					
				}
			else {
				System.out.println(star);
			}
		}
	}

	public static void main(String[] args) {

		printStars();

	}

}

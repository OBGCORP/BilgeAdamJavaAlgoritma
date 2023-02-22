package lesson008;

public class Question64 {
	
	private static String harfDegistir(String x) {
		String result = "";
		if(x.length() > 1) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(x.charAt(x.length()-1));
			stringBuilder.append(x.substring(1, x.length()-1));
			stringBuilder.append(x.charAt(0));
			result = stringBuilder.toString();
		}
		else {
			result = x;
		}
		return result;
	}
	
	private static boolean isPalindrome(String x) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = x.length()-1; i >= 0; i--) {
			stringBuilder.append(x.charAt(i));
		}
		return x.equals(stringBuilder.toString());
	}

	public static void main(String[] args) {
		
		System.out.println(harfDegistir("c"));
		System.out.println(isPalindrome("obg"));

	}

}

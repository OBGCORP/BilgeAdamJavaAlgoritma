package lesson011.helper;
import java.util.Random;

public class RandomGenerateID {
	
	public static String IDGenerator() {
		Random random = new Random();
		String randomID = Integer.toString(random.nextInt(9999,99999));
		return randomID;
	}
	
//	public static String generateProductCode(String productName) {
//		Random random = new Random();
//		String randomCode = Integer.toString(random.nextInt(100,1000));
//		return productName.substring(0,3) + randomCode;
//	}
	
	public static String generateProductCode(String productName) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append(productName.substring(0,3));
		sb.append(Integer.toString(random.nextInt(100,1000)));		
		return sb.toString();
	}
}

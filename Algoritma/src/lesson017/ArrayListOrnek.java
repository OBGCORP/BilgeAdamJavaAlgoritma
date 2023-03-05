package lesson017;
import java.util.ArrayList;

public class ArrayListOrnek {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ankara");
		list.add("izmir");
		list.add("istanbul");
		list.add("bursa");
		list.add("bodrum");
		
		for(String string : list) {
			if(string.startsWith("an")) {
				string = "xxx";
			}
			System.out.println(string);
		}
		
		for(String string : list) {
			
		}
		
	}	
}

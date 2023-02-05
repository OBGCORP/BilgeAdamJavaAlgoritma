package lesson004;

public class Question35 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React
		
		String text = "Java,Spring,Postgre,React";
		String[] text1 = text.split(",");
		for(int i = 0; i < text1.length; i++) {
			System.out.println(text1[i]);
		}
		
		System.out.println("\n*********************\n");
		
		//alternatif yöntem substring ile:
		System.out.println(text.substring(0,4));
		System.out.println(text.substring(5,11));
		System.out.println(text.substring(12,19));
		System.out.println(text.substring(20,25));
		
		System.out.println("\n*********************\n");
		
		//veya
		int index =0;
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) == ',') {
				System.out.println(text.substring(index,i));
				index = i + 1;
			}
		}
		System.out.println(text.substring(index));
		
		System.out.println("\n*********************\n");
		
		//veya
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				System.out.println();
			}
			else {
				System.out.print(text.charAt(i));
			}
		}
	}

}

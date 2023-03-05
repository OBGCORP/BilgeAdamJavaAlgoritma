package lesson017;

import java.util.Stack;

public class StackOrnek2 {
	static Stack<Character> stack = new Stack<>();
	
	public static void polindrome(String string) {
		for(int i = 0; i < string.length(); i++) {
			stack.add(string.charAt(i));
			System.out.println(stack.get(i));
		}
	}
	
	public static boolean isPolindrome(String string) {
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		polindrome("cabbac");
		System.out.println(isPolindrome("cabbac"));

	}

}

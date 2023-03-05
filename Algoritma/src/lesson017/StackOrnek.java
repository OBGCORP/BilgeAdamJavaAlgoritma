package lesson017;

import java.util.Stack;

public class StackOrnek {

	public static void main(String[] args) {
		// Stack -> (LIFO) last in first out
		
		Stack<Integer> stack = new Stack<>();
		stack.add(4);
		stack.add(5);
		stack.add(1);
		stack.add(4);
		stack.add(8);
		stack.add(6);
		stack.add(2);
		stack.add(7);
		stack.add(11);
				
		System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}

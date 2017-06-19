package collection.linkedlist;

import java.util.Stack;

public class StackPalimdrome {
	
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String s = "hannah";
		
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		
		String reverse = "";
		while (!stack.isEmpty()) {
			reverse += stack.pop();
		}
		
		if (s.equals(reverse)) {
			System.out.println("Palimdrome");
		} else 
		System.out.println("No Palimdrome");
	}
}

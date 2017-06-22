package collection.lesson9_1_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		/*q.add("sam");
		q.add("jam");
		q.add("pauroti");
		
		System.out.println(q.poll());
		System.out.println(q.peek());*/
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		sc.close();
		for (int i = s.length() - 1; i >= 0; i--) {
			q.add(s.charAt(i));
		}
		
		String reverse = "";
		while(!q.isEmpty()) {
			reverse += q.remove();
		}
		if (s.equals(reverse)) {
			System.out.println("Palindrome");
		} else 
			System.out.println("Not Palindrome");
		
	}
	
	
}

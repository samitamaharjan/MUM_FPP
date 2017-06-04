package nestedclass;

import nestedclass.Static.Pair;

public class LocalInner {
	private String name = "Joe";
	
	public void printPair(int x, int y) {
		class Pair {
			int first;
			int second;
			
			Pair() {
				printHello(name);
			}
			
			public String toString() {
				return "(" + first + ", " + second + ")";
			}
		}
		
		Pair p = new Pair();
		p.first = x;
		p.second = y;
		System.out.println(p);
	}
	
	private void printHello(String name1) {
		System.out.println("Hello " + name1);
	}
	
	public static void main(String[] args) {
		(new LocalInner()).printPair(11, 3);
	}
}

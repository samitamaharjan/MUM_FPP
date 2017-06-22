package collection.tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedTest {

		public static void main(String[] args) {
			TreeSet<String> tSet = new TreeSet<String>();
		    tSet.add("Banana");
		    tSet.add("Apple");
		    tSet.add("Papaya");
		    tSet.add("Grapes");
		    tSet.add("Orange");
		    tSet.add("Berries");
		    tSet.add("Mango");
		    tSet.add("Mango");
		    System.out.println("Treeset : " + tSet);
		    SortedSet sortedSet = tSet.headSet("Berries");
		    System.out.println("Head Set : " + sortedSet);
		    SortedSet sortedSet1 = tSet.tailSet("Grapes");
		    System.out.println("Tail Set : " + sortedSet1);
		    System.out.println("Sorted SubSet Contains : " + tSet.subSet("Apple", "Orange"));
		    SortedSet reverseSet = tSet.descendingSet();
		    System.out.println("Decending order :" + reverseSet);
		   
		}
}
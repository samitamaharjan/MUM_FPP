package recursion;

public class DivideSort {
	public static void main(String[] args) {
		String s = "samita";
		System.out.println(divideAndMerge(s));
	}
	
	public static String[] divide(String str) {
		String[] n = new String[2];
		String left = (str.substring(0, str.length() / 2));
		String right = str.substring(str.length() / 2 + 1);
		
		n[0] = left;
		n[1] = right;
		return n;
	}
	
	public static String merge(String[] str) {
		return sort(str[0] + str[1]);
	}
	
	public static String sort(String str) {
		char min = str.charAt(0);
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < min) {
				min = ch;
				index = i;
			}
		}
		return min + sort(str.substring(0, index) + str.substring(index + 1));
	}
	
	public static String divideAndMerge(String str) {
		if (str.length() == 0) return "";
		String s1 = sort(merge(divide(str.substring(0, str.length() / 2))));
		String s2 = sort(merge(divide(str.substring(str.length() / 2 ))));
		
		String s = s1 + s2;
		return s;
	}
 }

package recursion;

public class BinSearch {

	public static void main (String[] args) {
        String str = "samita";
        char ch = 'a';
        System.out.println(search(str, ch));
    }
    
    public static boolean search(String s, char ch) {
        if (s.length() == 0) return false;
        
        int m = s.length() / 2;
        if (s.charAt(m) == ch) return true;
        if (ch < s.charAt(m)) {
        	return search(s.substring(0, m - 1), ch);
        } else {
        	return search(s.substring(m + 1), ch);
        }
    }
}

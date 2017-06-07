package recursion;

public class secondSmallest {
	public static void main (String[] args) {
        String str = "sfbacde";
        System.out.println(getSecondSmallest(str));
    }
    
	public static char getSecondSmallest(String s) {
		char min1;
		char min2;
		if (s.length() == 1) return s.charAt(0);
		else {
            min1 = getSecondSmallest(s.substring(1));
            min2 = min1;
            char ch = s.charAt(0);
            if (ch <= min1) {
                min2 = min1;
                min1 = ch;
                return min1;
            } else if (ch != min1 && ch < min2) {
                min2 = ch;
           }
        }
        return min2;
    }
}
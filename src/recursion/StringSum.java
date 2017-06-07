package recursion;

public class StringSum {
	static int count;
	public static void main (String[] args) {
        String str = "0000001111";
        System.out.println("Sum of 1s is " + sumOfString(str) + "\nNumber of loop is " + count);
    }
    
    public static int sumOfString(String s) {
    	if (s.length() > 8 && s.charAt(s.length() / 2) == '1') {
	        int val = Character.getNumericValue(s.charAt(0));
	        if (val == 1) return s.length();
	        if (val == 0) {
	        	count++;
	        	return sumOfString(s.substring(1));
	         }
    	} 
    	return 0;
    }
}

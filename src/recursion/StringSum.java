package recursion;

public class StringSum {
	static int count;
	public static void main (String[] args) {
        String str = "0000001111";
        System.out.println("Sum of 1s is " + sumOfString(str) + "\nNumber of loop is " + count);
    }
    
    public static int sumOfString(String s) {
    	if (s.length() == 0) return 0;
    	if (s.charAt(s.length() / 2) == '1') {
    		int val = Character.getNumericValue(s.charAt(0));
	        if (val == 1) return s.length();
	        if (val == 0) {
	        	count++;
	        	return sumOfString(s.substring(1));
		    }
    	} else if (s.charAt(s.length() / 2) == '0'){
    		if (s.length() < 8) {
	    		int val1 = Character.getNumericValue(s.charAt(s.length() / 2 - 1));
	    		if (val1 == 1) return s.length();
		        if (val1 == 0) {
		        	count++;
		        	return sumOfString(s.substring(1));
		         }
    		}
    	}
    }
}

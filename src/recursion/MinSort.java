package recursion;

class MinSort {
	
    public static void main (String[] args) {
        String str = "samita";
        System.out.println(sort(str));
    }
    
    public static String sort(String s) {
        if (s.length() == 0) return ""; // base case
        
        char min = s.charAt(0);
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch < min) {
				min = ch;
				index = i;
			}
		}
        return min + sort(s.substring(0, index) + s.substring(index + 1 ));
    }
}



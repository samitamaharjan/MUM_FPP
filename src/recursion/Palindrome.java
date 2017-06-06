package recursion;

public class Palindrome {
	public static void main (String[] args) {
        System.out.println(isPalindrome("HANNAH"));
    }
    
    private static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    private static boolean isPalindrome(String str, int index1, int index2) {
        if (index1 > index2) return true;
        if (str.charAt(index1) != str.charAt(index2)) return false;
        return isPalindrome(str, index1 + 1 , index2 - 1);
    }
}

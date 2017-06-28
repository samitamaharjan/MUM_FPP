import java.util.*;

public class UsingChar {
	public static void main(String args[]) {

		Charset utf16 = Charset.forName("UTF-16BE");
		Charset isolatin = Charset.forName("ISO-8859-1");
		String abc = "ABC";
		byte[] asUtf16 = abc.getBytes(utf16);
		byte[] defaultEnc = abc.getBytes();
		byte[] asIsolatin = abc.getBytes(isolatin);
		printArray(asUtf16);
		printArray(defaultEnc);
		printArray(asIsolatin);
		String newAbc = new String(asIsolatin);
		System.out.println(newAbc);
	}
}

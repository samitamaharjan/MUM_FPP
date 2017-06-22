package Exception;


import java.io.BufferedReader;
import java.io.InputStreamReader;

class myException extends Exception {
	myException()

	{
		super();
		System.out.println("Error:Password too short");
	}

	myException(int n) {
		System.out.println("Error:Only adults can join");
	}
}

class UserException {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter user name : ");
			String n = "Samita";
			System.out.print("Enter your password : ");
			String m = "date";
			if (m.length() < 6)
				throw new myException();
			System.out.print("Enterd your age : ");
			int o = Integer.parseInt("52");
			if (o < 18)
				throw new myException(o);
		} catch (Exception e) {
		} finally {
			System.out.println("End");
		}
	}
}
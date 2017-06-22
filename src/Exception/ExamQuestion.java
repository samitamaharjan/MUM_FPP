package Exception;

class ExamQuestion {
	static int balance = 5000;
	
	public static void checkAccount(int amt) throws BadAttemptException {
		if (balance < amt) {
			throw new BadAttemptException("Amount is more than balance");
		} 
		balance -= amt;
	}
	
	public static int withdrawal(int amt) throws BadAttemptException {
		checkAccount(amt);
		return balance;
	}
	
	public static void main(String[] args) throws BadAttemptException {
		try {
			int amt = withdrawal(5555);
			System.out.println(amt);
		} catch (BadAttemptException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

@SuppressWarnings("serial")
class BadAttemptException extends Exception {
	public BadAttemptException(String message) {
		super(message);
	}
}

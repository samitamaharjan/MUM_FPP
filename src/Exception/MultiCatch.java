package Exception;
public class MultiCatch {

		public static void main(String[] args) {
			int a=10, b=0;
			int arr[] = null;
			int vals[] = { 1, 2, 3 };
			try {
			int result = a / 0; 
			vals[3] = 19; // generate an ArrayIndexOutOfBoundsException
			System.out.println(arr[0]);
			} 
			
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.err.println(e);
				System.out.println("Exception Occured\n")	;
				
			}
			//multicatch parameters are implicitly final
			System.out.println("After multi catch");
		}

}

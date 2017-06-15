package collection.lesson9_2;

public class Main {

	public static void main(String[] args) {
		SymbolBalancer symbolBalancer = new SymbolBalancer("Employee.java");
		System.out.println(symbolBalancer.symbolsBalanced("[](){}"));
	}

}

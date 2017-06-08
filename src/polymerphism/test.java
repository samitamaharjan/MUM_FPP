package polymerphism;

class test {

	public static void main(String[] args) {
		System.out.println( B.val);

	}

}

interface A {
	int val = 1;
}

interface B extends A {
	int val = 2;
	int sum = val + 2;
}
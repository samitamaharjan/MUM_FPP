package Lesson4;

public class MainMyTable {

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t);
		
		String s = t.get('b');
		System.out.println(s);
	}

}

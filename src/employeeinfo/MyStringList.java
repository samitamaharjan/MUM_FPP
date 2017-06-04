package employeeinfo;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size, index;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if (size >= strArray.length) {
			resize();
		} 
		strArray[size] = s;
		size++;
	}
	
	public String get(int i){
		return strArray[i];
	}
	
	public boolean find(String s){
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s)) {
				//find the index where the string was found
				index = i;
				return true;
			}
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if (size >= strArray.length) {
			resize();
		}
		//shift all the elements of array to the left from the inserted position then insert string to that position
		System.arraycopy(strArray, pos, strArray, pos + 1, size - pos);
		strArray[pos] = s;
		size++;
	}
	
	public boolean remove(String s){
		if (find(s)) {
			//shift all the elements of array to the right from the removed position
			System.arraycopy(strArray, index + 1, strArray, index, strArray.length - index - 1);
			strArray[size - 1] = null;
			size--;
			return true;
		}
		return false;
	}
	
	private void resize(){
		if (size + 1 > strArray.length) {
			System.out.println("Resizing...");
			String[] arr = new String[size * 2];
			//copy all the elements of strArray to arr
			System.arraycopy(strArray, 0, arr, 0, strArray.length);
			strArray = arr;
		} 		
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(strArray[i]);
			if(i < size - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	public int size() {
		return size;		
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
	}
}

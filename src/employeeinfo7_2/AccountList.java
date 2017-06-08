package employeeinfo7_2;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] accountArray; 
	private int size, index;
	
	public AccountList() {
		accountArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account s){
		if (size >= accountArray.length) {
			resize();
		} 
		accountArray[size] = s;
		size++;
	}
	
	public Account get(int i){
		return accountArray[i];
	}
	
	public boolean find(String s){
		for (int i = 0; i < size; i++) {
			if (accountArray[i].equals(s)) {
				//find the index where the account  was found
				index = i;
				return true;
			}
		}
		return false;
	}
	
	public void insert(Account s, int pos){
		if (size >= accountArray.length) {
			resize();
		}
		//shift all the elements of array to the left from the inserted position then insert string to that position
		System.arraycopy(accountArray, pos, accountArray, pos + 1, size - pos);
		accountArray[pos] = s;
		size++;
	}
	
	public boolean remove(String s){
		if (find(s)) {
			//shift all the elements of array to the right from the removed position
			System.arraycopy(accountArray, index + 1, accountArray, index, accountArray.length - index - 1);
			accountArray[size - 1] = null;
			size--;
			return true;
		}
		return false;
	}
	
	private void resize(){
		if (size + 1 > accountArray.length) {
			//System.out.println("Resizing...");
			Account[] arr = new Account[size * 2];
			//copy all the elements of strArray to arr
			System.arraycopy(accountArray, 0, arr, 0, accountArray.length);
			accountArray = arr;
		} 		
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(accountArray[i]);
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
}

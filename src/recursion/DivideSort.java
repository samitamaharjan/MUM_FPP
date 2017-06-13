package recursion;

public class DivideSort {

	public static void main(String[] args) {
		DivideSort divSort = new DivideSort();
		System.out.println(divSort.sort("fundamentalclass"));
	}
	
	private String recSort(String str) {
		if (str.length() == 1 || str.isEmpty()) return str;
		int len = str.length() / 2;
		String left = recSort(str.substring(0, len));
		String right = recSort(str.substring(len));
		return (new Merge().merge(left, right));
	}
	
	public String sort(String str) {
		if (str == null || str.isEmpty()) return str;
		return recSort(str);
	}
}




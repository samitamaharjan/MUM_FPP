package classwork;

public class Minimum {

	public static void main(String[] args) {
		int[] arr = {10, 25, 2, 5, 6};
		System.out.println(min(arr));
	}
	
	public static int min(int[] arr) {
		int mini = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= mini) {
				mini = arr[i];
			}
		}
		return mini;
	}
}

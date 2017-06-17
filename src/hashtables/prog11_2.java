package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prog11_2 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(20);
		list.add(15);
		
		System.out.println(checkSum(list, 16));
		//checkForSum(list, 15);
	}
	
	public static boolean checkForSum(List<Integer> list, Integer z) {
		//Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < list.size(); i++) {
			int sum = list.get(i) + list.get(i + 1);
			if (sum == z) return true;
		}
		
		/*for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int sum = 0;
			sum = entry.getKey() + entry.getValue();
			if (sum == z) return true;
		}*/
		return false;
	}
	
	public static boolean checkSum(List<Integer> list, Integer z) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (i == j) continue;
				int sum = list.get(i) + list.get(j);
				if (sum == z) return true;
			}
		}
		return false;
	}
	
}



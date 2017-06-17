package hashtables;
import java.util.*;

class CheckSum {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 8);
        System.out.println(checkForSum(list, 1));
        System.out.println(checkSumSet(list, 5));
        System.out.println(checkSumMap(list, 5));
    }
    
    public static boolean checkForSum(List<Integer> list, int z) {
        for (int num : list) {
            int n = z - num; 
            if (list.contains(n) && n != num) return true; 
        }
        return false;
    }
    
    public static boolean checkSumSet(List<Integer> list, int z) {
        Set<Integer> set = new HashSet<>();
        
        for (Integer num : list) {
            int n = z - num;
            if (set.contains(n)) return true;
            set.add(num);
        }
        return false;
    }
    
    public static boolean checkSumMap(List<Integer> list, int z) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (Integer num : list) {
            int n = z - num;
            if (map.containsKey(n)) return true;
            map.put(num, 1);
        }
        return false;
    }
}


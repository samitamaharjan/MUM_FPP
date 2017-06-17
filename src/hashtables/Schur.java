package hashtables;
import java.util.*;

class Schur {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 8);
        System.out.println(checkForSum(list, 1));
        System.out.println(checkForSum(list, 5));
        System.out.println(checkForSum(list, 6));
     }
    
    public static boolean checkForSum(List<Integer> list, int z) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (Integer num : list) {
            int n = z - num;
            if (map.containsKey(n)) return true;
            map.put(num, 1);
        }
        return false;
    }
}
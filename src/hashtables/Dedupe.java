package hashtables;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Dedupe {
    public static void main(String[] args) {
        int[] arr = {12, 25, 25, 12, 58};
        System.out.println(Arrays.toString(dedupe(arr)));
    }
    
    public static int[] dedupe(int[] arr) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        
        int[] newArr = new int[set.size()];
        
        int i = 0;
        for (Integer val : set) {
            newArr[i] = val;
            i++;
        }
        return newArr;
    }
}

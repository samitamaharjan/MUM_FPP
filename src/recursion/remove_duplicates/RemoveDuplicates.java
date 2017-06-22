package recursion.remove_duplicates;

import java.util.ArrayList;
import java.util.List;

class RemoveDuplicates {
    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(12);
        list.add(5);
        list.add(45);
        list.add(23);
        list.add(5);
        list.add(17);
        list.add(12);
        list.add(23);
        
        ListLibrary.removeDuplicates(list);
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}

// 23 -> 12 -> 5 -> 45 -> 23 -> 5 -> 17 -> 12 -> 23
// 23 -> 12 -> 5 -> 45 -> 23 -> 5 -> 17 -> 12
// 23 -> 12 -> 5 -> 45 -> 5 -> 17 -> 12
// 23 -> 12 -> 5 -> 45 -> 5 -> 17
// 23 -> 12 -> 5 -> 45 -> 17

class ListLibrary {
    
    public static void removeDuplicates(List<Integer> list) {
        removeDuplicates(list, 0);
    }
    
    private static void removeDuplicates(List<Integer> list, int currentIndex){
        if(currentIndex >= list.size()) return;

        int val = list.get(currentIndex);
        int lastIndex = list.lastIndexOf(val);
        
        if(lastIndex != currentIndex) {
            list.remove(lastIndex);
            currentIndex--;
        }
        removeDuplicates(list, currentIndex + 1);
    }
}
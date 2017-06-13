package collection;

import java.util.Arrays;

class GenericComparable<T extends Comparable<T>> {
    
    T[] arr;
    
    GenericComparable(T[] arr){
        this.arr = arr;
    }
    
    public void sort(){
        if(arr == null || arr.length <=1) return;
        int len = arr.length;
        int temp = 0;
        for(int i = 0; i < len; ++i){
            int nextMinPos = minpos(i,len-1);
            swap(i,nextMinPos); 
        }
    }
    
    void swap(int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    //find minimum of arr between the indices bottom and top
    public int minpos(int bottom, int top){        
        T m = arr[bottom];
        int index = bottom;
        for(int i = bottom+1; i <= top; ++i){
            if((arr[i].compareTo(m)) < 1) {
                m = arr[i];
                index = i;
            }
        }
        //return location of min, not the min itself
        return index;
    }
    
    public static void main(String[] args){
        Integer[] test = new Integer[]{21,13,1,-22, 51, 5, 18};
        GenericComparable<Integer> ss = new GenericComparable<>(test);
        ss.sort();
        System.out.println(Arrays.toString(ss.arr));
        
        String[] test1 = new String[] {"big", "small", "tall", "short", "round", "square",
        		"enormous", "tiny","gargantuan", "lilliputian",
        		"numberless", "none", "vast", "miniscule"};
        GenericComparable<String> ss1 = new GenericComparable<>(test1);
        ss1.sort();
        System.out.println(Arrays.toString(ss1.arr));
    }
}

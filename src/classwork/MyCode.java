package classwork;

public class MyCode {

    private static int count;
    int count1;
    
    private MyCode(int count){
        this.count = count;
        count++;
        count1++;
    }
    
    public static int getCount(){
        return count;
    } 
    
    public int getCount1(){
        return count1;
    } 
                
    public static void main(String[] args){
        MyCode inst = null;
        for(int i = 0; i < 10; i++){
            inst  = new MyCode(i);
            
         }    
        System.out.println("Number of instances so far = " 
                + inst.getCount() + " and " + inst.getCount1());
}
       
}

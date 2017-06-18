package Exception;
class myCode {
    public static void main (String[] args) {
        display();
        System.out.println("Program execution complete");
    }
    
    public static void display() {
        try {
            print();
            System.out.println("Executing this after print");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds excpetion was caught. Program continued");
            return;
        } finally {
            System.out.println("This gets executed anyway!!!!!!!");
        }
        System.out.println("Calling some other service");
    }
    
    public static void print() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[10];
        for (int i = 0; i <= 10; i++) {
            arr[i] = i;
        }
    }
}
package classwork;

import java.util.Random;
import java.util.stream.IntStream;

class FormatWithLambda {
    
    private static final int ROWS = 5, COLS = 3;
    
    public static void main(String[] args) {
        IntStream.range(0, ROWS).forEach((i) -> {
            printNumber(false);
            printNumber(true);
            printDashes();
        });
    }
    
    public static void printNumber(boolean printSymbol) {
        String format = printSymbol ? "%+10d" : "%10d";
        IntStream.range(0, COLS).forEach((i) -> System.out.printf(format, new Random().nextInt(100)));
        System.out.println();
    }
    
    public static void printDashes() {
        IntStream.range(0, COLS).forEach((i) -> System.out.printf("%10s", "-------"));
        System.out.println("\n\n");
    }
}

package Exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AssertionTest {
	
	static Logger LOGGER = Logger.getLogger(AssertionTest.class.getName());
	    
    public static void main (String[] args) {
    	LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("severe Log");
        LOGGER.warning("warning Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");

        // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
        LOGGER.setLevel(Level.FINEST);
        LOGGER.severe("infoSevere Log");
        LOGGER.warning("InfoWarning Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");
    }
	
	/*public static void main(String[] args) {
	    int i; int sum = 0;
	    for (i = 0; i < 10; i++) {
	      sum += i; 
	    }
	    assert i == 10;
	    System.out.println("Sum : " + sum);
	    assert sum > 10 && sum < 5 * 10 : "sum is " + sum;
	}*/
	
	
}

package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringFunctionTest {
	
		@Test
		public void test() {
			StringFunction sf = new StringFunction();
			String Ooutput = sf.StringJoin("radha", "krishna");
			String Eoutput = "radhakrishna";
			assertEquals(Ooutput,Eoutput);
		}
		@Test
		public void test2()
		{
			StringFunction sf = new StringFunction();
			int ao =sf.Multiply(10, 20);
			int eo = 200;
			assertEquals(ao,eo);
			
		}
		
	}



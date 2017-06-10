package clone.clonebad1;

public class CallingClass {
	void myMethod(MyDataClass cl) {
		//clone method not visible from here
		//even though MyDataClass and CallingClass
		//are subclasses of Object
		
       // MyDataClass copy = (MyDataClass)cl.clone();
		
	}
}

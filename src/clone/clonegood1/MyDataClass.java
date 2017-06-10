package clone.clonegood1;

public class MyDataClass implements Cloneable {
	public MyDataClass clone() throws CloneNotSupportedException {
		return (MyDataClass)super.clone();
	}
}

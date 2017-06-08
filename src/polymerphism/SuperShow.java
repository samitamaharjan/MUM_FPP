package polymerphism;

class SuperShow {
	public static void main(String[] args) {
		ExtendShow ext = new ExtendShow();
		SuperShow sup = new ExtendShow();
		sup.show();
		ext.show();
		
		System.out.println("Super string: " + sup.str);
		System.out.println("Extend string: " + ext.str);
	}
	public String str = "SuperStr";
	
	public void show() {
		System.out.println("Super show: " + str);
	}
}

class ExtendShow extends SuperShow {
	public String str = "ExtendStr";
	
	public void show() {
		System.out.println("Extend show: " + str);
	}
}

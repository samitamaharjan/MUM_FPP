package classwork;

public class Main {

	public static void main(String[] args) {
		TankMutable tank1 = new TankMutable(2.0, 2.0);
		System.out.println(tank1.getLength());
		TankMutable tank2 = new TankMutable(2.0, 4.0);
		System.out.println(tank2.getLength());
}

}

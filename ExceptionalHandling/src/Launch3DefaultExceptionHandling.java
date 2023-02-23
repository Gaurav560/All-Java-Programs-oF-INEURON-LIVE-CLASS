
public class Launch3DefaultExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
doStuff();
System.out.println(10/0);
	}

	private static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
		System.out.println("hi");
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}

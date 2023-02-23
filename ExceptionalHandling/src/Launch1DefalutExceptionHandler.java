
public class Launch1DefalutExceptionHandler {

	public static void main(String[] args) {
		doStuff();

	}

	private static void doStuff() {
		doMoreStuff();
		
	}

	private static void doMoreStuff() {
		System.out.println(10/0);
		
	}

}
//run the program u will understand it all.

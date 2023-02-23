

public class Launch2DefaultExceptionHandler {

	public static void main(String[] args) {
	 doStuff();

	}

	private static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
	//	in the below line JVM will Check if there is any handling statement to handle the
		// exception object created by this method with the help of jvm or not. 
		//if not it will terminate this method abruptly and goes for searching the 
		//the handling code in the method from which this method is called.
		//if there also it does not find the handling code it will terminate that method also
		//at last after terminating main also (if it does not have handling code)
		//JVM will itself call DHE(Default exception handler) that will terminate the program abruptly 
		//and print exception with name and Stack trace.
		
		System.out.println(100/0);
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}

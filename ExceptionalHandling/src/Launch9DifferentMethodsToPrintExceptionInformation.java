
public class Launch9DifferentMethodsToPrintExceptionInformation {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);	
		} catch (Exception e) 
		{
		//there are only three methods to print exception information 
			//these methods are automatically available for all the exception classes
			//and error classes  as these methods are available in Throwable Class(root class of exception)
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}

import java.io.FileNotFoundException;

public class Launch13FinallyBlockWhenExceptionIsPresentAndNotHandled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try
//		{
//			System.out.println("try");
//			System.out.println(10/0);
//		}
		
		//exception is not handled as exception is of Arithmetic type and u are giving 
		//file not found exception to handle it
		//catch (FileNotFoundException e)
		{
			System.out.println("Catch");
		}
	//finally {
		System.out.println("finally block will be executed irrespective of "
+ "whether the exception is handled or not .it will be executed in any scenario");
	
	}

}}

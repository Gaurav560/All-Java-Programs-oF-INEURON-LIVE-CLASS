
public class Launch12FinallyBlockWhenExceptionIsPresentAndHandledAlso {

	public static void main(String[] args) 
	{
		
		
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Catch");
		}
	finally {
		System.out.println("finally block will be executed irrespective of "
+ "whether the exception is handled or not .it will be executed in any scenario");
	}
	

	}
	}




public class Launch18TryCatchFinallyBlockWithExceptionAtStatement2ndAndHandled
{

	public static void main(String[] args) {
		try
		{
			System.out.println("1");
			System.out.println(10/0);
			System.out.println("3");
		} 
		
		catch (ArithmeticException e)
		{
			System.out.println("4");
		}
finally 
{
	System.out.println("5");
}
	System.out.println("6");

	}

}

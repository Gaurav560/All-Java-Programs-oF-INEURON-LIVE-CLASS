
public class Launch22TryCatchFinallyBlockWithExceptionAtStatement6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("1");
			System.out.println(11/0);
			System.out.println("3");
		} 
		
		catch (ArithmeticException e)
		{
			System.out.println(10/0);
		}
finally 
{
	System.out.println(22/0);
}
	System.out.println(12/0);
	}

}

import java.io.FileNotFoundException;

public class Launch19TryCatchFinallyBlockWithExceptionAtStatement2ndAndNotHandled {
	public static void main(String[] args) {
		try
		{
			System.out.println("1");
			System.out.println(10/0);
			System.out.println("3");
		} 
		
		catch (NullPointerException e)
		{
			System.out.println("4");
		}
finally 
{
	System.out.println("52");
}
	System.out.println("6");
	}
}

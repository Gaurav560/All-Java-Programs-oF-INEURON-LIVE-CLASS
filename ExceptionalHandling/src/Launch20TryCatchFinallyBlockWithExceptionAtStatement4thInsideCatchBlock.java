
public class Launch20TryCatchFinallyBlockWithExceptionAtStatement4thInsideCatchBlock {

	public static void main(String[] args) {
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
	System.out.println("52");
}
	System.out.println("6");

	}

}


public class Launch23NestedTryCatchFinally {

	public static void main(String[] args) {
		try
		{
			System.out.println("outer try block");
			try 
			{
				System.out.println("inner try block");
				System.out.println(10/0);//Arithmetic exception
				
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("inner catch block ");
			}
			
			System.out.println("After inner try catch");
		}
		
		catch (Exception e)
		{
		System.out.println("external catch block ");
		}
finally
{
	System.out.println("finally block");
}
	}

}

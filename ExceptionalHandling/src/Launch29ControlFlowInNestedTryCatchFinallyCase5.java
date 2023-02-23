
public class Launch29ControlFlowInNestedTryCatchFinallyCase5 {

	
	//exception raised at st 5 and inner catch not matched but outer catch matched
	public static void main(String[] args) 
	{
	
		try
		{
			System.out.println("Statement1");
			System.out.println("Statement 2");
			System.out.println("Statement3");
			try 
			{
				System.out.println("Statement 4");
				System.out.println(10/0);
				System.out.println("Statement 6");
			} 
			
			catch (NullPointerException e) 
			{
				System.out.println("Statement 7");
			}
			
			finally 
			
			{
				System.out.println("Statement 8");
			}
			System.out.println("Statement 9");
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("Statement 10");
		}
		finally
		{
			System.out.println("Statement 11");
		}
		System.out.println("Statement 12");

	}

}

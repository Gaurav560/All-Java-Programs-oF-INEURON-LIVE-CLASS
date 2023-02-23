
public class Launch27ControlFlowInNestedTryCatchFinallyCase3 {

	
	//case 3:exception at st 2 and corresponding catch block not matched
	
	public static void main(String[] args) {
		

		try
		{
			System.out.println("Statement1");
			System.out.println(10/0);
			System.out.println("Statement3");
			try 
			{
				System.out.println("Statement 4");
				System.out.println("Statement 5");
				System.out.println("Statement 6");
			} 
			
			catch (ArithmeticException e) 
			{
				System.out.println("Statement 7");
			}
			
			finally 
			
			{
				System.out.println("Statement 8");
			}
			System.out.println("Statement 9");
		} 
		
		catch (NullPointerException e) 
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

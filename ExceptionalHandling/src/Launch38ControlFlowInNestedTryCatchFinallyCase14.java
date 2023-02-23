
public class Launch38ControlFlowInNestedTryCatchFinallyCase14 {

	//case:exception is raised at 12 or st 11
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Statement1");
			System.out.println("Statement 2");
			System.out.println("Statement3");
			try 
			{
				System.out.println("Statement 4");
				System.out.println(11/0);
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
			System.out.println(12/0);
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println(23/0);
		}
		finally
		{
			System.out.println(22/0);
		}
		System.out.println(44/0);


	}

}

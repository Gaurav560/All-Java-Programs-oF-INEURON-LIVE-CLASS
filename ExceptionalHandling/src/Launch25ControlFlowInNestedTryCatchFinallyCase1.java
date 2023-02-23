
public class Launch25ControlFlowInNestedTryCatchFinallyCase1 {

	
	//case1:no exception 
	public static void main(String[] args)
	{
	
		
		try
		{
			System.out.println("Statement1");
			System.out.println("Statement2");
			System.out.println("Statement3");
			try 
			{
				System.out.println("Statement 4");
				System.out.println("Statement 5");
				System.out.println("Statement 6");
			} 
			
			catch (Exception e) 
			{
				System.out.println("Statement 7");
			}
			
			finally 
			
			{
				System.out.println("Statement 8");
			}
			System.out.println("Statement 9");
		} 
		
		catch (Exception e) 
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


public class Launch30ControlFlowInNestedTryCatchFinallyCase6 {

	//exception at st 5 but both inner and outer catch not matched
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

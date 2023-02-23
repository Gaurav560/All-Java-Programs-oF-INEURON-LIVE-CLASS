
public class Launch33ControlFlowInNestedTryCatchFinallyCase9 {

	
	//case:exception raised at st 8 and corresponding catch block matched
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
				System.out.println(11/0);
				System.out.println("Statement 6");
			} 
			
			catch (ArithmeticException e) 
			{
				System.out.println(22/0);
			}
			
			finally 
			
			{
				System.out.println(55/0);
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

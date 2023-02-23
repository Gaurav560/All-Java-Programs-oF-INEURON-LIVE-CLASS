
public class Launch16FinallyBLockVsSystemExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

	private static void m1() 
	{
		try 
		{
			System.out.println("hi");
			System.exit(0);
		}
		
		catch (Exception e)
		{
			System.out.println("catch");
		}
		
		finally 
		{
		System.out.println("bye");
		}
		//System.exit(0) dominates over finally block 
}}

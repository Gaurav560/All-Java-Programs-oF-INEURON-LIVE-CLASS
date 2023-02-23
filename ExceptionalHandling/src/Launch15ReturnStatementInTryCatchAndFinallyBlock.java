
public class Launch15ReturnStatementInTryCatchAndFinallyBlock {

	public static void main(String[] args)
	{
		System.out.println(m1());


	}

	@SuppressWarnings("finally")
	private static int m1() 
	{
		try 
		{
			return 777;
		}
		
		catch (Exception e)
		{
			return 888;
		}
		
		finally 
		{
			return 999;
		}
		
		//return block of finally statement will be executed.
	}

}

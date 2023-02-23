
public class Launch24NestedTryCatchFinallyWhenExceptionIsNotHandledByInnerCatch {
	
	//if the inner catch block is unable to handle the exception of 
	//the  inner try then it will throw the exception to outer catch block 
	//and rest of main try block code will not be executed and again if 
	//outer catch block is unable to handle the exception then it will result
	 // in abnormal termination.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("outer try block");
			try 
			{
				System.out.println("inner try block");
				System.out.println(10/0);//Arithmetic exception
				
			} 
			catch (NullPointerException e) 
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

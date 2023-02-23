
public class Launch14FinallyVBlockVsReturnStatement {

	public static void main(String[] args) {
		try
		{
			System.out.println("try");
			return;
		}
		
		catch (Exception e) 
		{
			System.out.println("catch");
		}
finally {
	System.out.println("this block executes before the end of this function execution ");
	//return rahe ya na rahe finally block to execute ho ke rahega 
}
	}

}

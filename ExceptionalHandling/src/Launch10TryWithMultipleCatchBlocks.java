
public class Launch10TryWithMultipleCatchBlocks {

	public static void main(String[] args)
	{
		
		//right syntax of try with multiple catch blocks
		//child class exception(Arithmetic exception class comes 1st)
//		try 
//		{
//			System.out.println(10/0);
//		} 
//		catch (ArithmeticException e) 
//		{
//			System.out.println("AE found ");
//		}
//		catch (Exception e) 
//		{
//			System.out.println("Exception found ");
//		}
		
		
		
		
		//wrong syntax of try with multiple
		//parent exception class always comes last 
		//but in this exception class comes first then Arithmetic Class comes
		try 
		{
			System.out.println(10/0);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("AE found ");
		}
		catch (Exception e) 
		{
			System.out.println("Exception found ");
		}

		//also wrong syntax -u cant write multiple times the same exception inside different catch
//		try 
//		{
//			System.out.println(10/0);
//		} 
//		catch (ArithmeticException e) 
//		{
//			System.out.println("AE found ");
//		}
//		catch (ArithmeticException e) 
//		{
//			System.out.println("Exception found ");
//		}
	}

}

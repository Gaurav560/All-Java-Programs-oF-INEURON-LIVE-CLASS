
public class Launch39ThrowKeywordCase1 {

	//part 1 case 1  exception object creation
	//static ArithmeticException e=new ArithmeticException();
	//gives Arithmetic exception in thread main 
	
	
	//part 2 case 1 
	//only reference of exception object 
	static ArithmeticException e;//gives NullPointerException as static varibles default values is null
	public static void main(String[] args) 
	{
		//without throw keyword
		//System.out.println(10/0);
		
//with throw keyword
		//throw keyword is used to handover our created exception object to jvm manually
		//new keyword is used to create exception object
		//throw new ArithmeticException("/ by zero");
		
		//case 1 
		throw e;
	}

}


public class Launch40ThrowKeywordCase2 {

	public static void main(String[] args) 
	{
		//this case gives Runtime Exception: arithmetic exception
//		System.out.println(10/0);
//		System.out.println("hello");
		
		//when object exception is created
	throw new ArithmeticException("/ by zero");
	//below line is unreachable code (when we use throw keyword compiler knows in advance
	 // below lines cant be executed. it will gives compile time error unreachable code)
	//System.out.println("Hello");
		

	}

}

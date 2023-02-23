

public class Launch1LambdaExpression {
	@FunctionalInterface
	interface Demo
	{
		void disp();		
		}


	public static void main(String[] args) {
		// Lambda exp
		//before writing lambda exp one should know the following concepts
		//:Interface,functional interface,abstract keyword,lambda operator 
		//lambda expression is also called unnamed method 
		//parameter on the left and method body on the right side of the parameter
		//it is called using reference variable of interface 
	
Demo d=()->System.out.println("HelloInTheWorldOfFfriend");
//i have ignored the curly braces in the body of lambda expression as it is a single statement
d.disp();
}
	}

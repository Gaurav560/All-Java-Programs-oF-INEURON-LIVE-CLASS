@FunctionalInterface
interface Demo
{
void add(int num1,int num2);
//void sub(int num3,int num4);
//void SimpleIntrest(int principal,int time,float rateOfInterest);
}

@FunctionalInterface
interface Sub
{
	int sub(int num1);
}

public class LaunchLambdaExpressionParametersWithoutDataTypeGiven 
{

	public static void main(String[] args) 
	{
		
		//LambdaExpression
		//parameters are written without their data type
	 Demo d= (a,b)->
	 {
		 int result=a+b;
		 System.out.println(result);
	 };
d.add(30, 40);

//NEW lambda expression
//in this only one parameter is there so u can avoid brackets but remember 
//avoiding brackets is optional only for a single parameter
//data type of parameters is avoided in lambda expression in any case
Sub s=num1->{int result=num1-7;return result;};
System.out.println("the difference between num1 and 7 is :"+s.sub(10));

	}

}

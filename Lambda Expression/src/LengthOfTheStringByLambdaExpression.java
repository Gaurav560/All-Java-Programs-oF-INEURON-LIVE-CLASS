
//note:Lamba expression can't be written independently.it can be only written
//with the help of FUnctional interface
interface ComputeLengthOfTheString 
{
int getLength(String str);	
}


//method 1 to find the length of the String by implementing the interface in the class LOS
//and override the abstract method of interface
class LOS implements ComputeLengthOfTheString
{
	public int getLength(String str)
	{
		return str.length();
	}
}

//Driver class
public class LengthOfTheStringByLambdaExpression 
{
//Driver method
	public static void main(String[] args) 
	{
		
		//2nd method to find the length of the string byLAMBDA EXPRESSION
		ComputeLengthOfTheString s=str->{return str.length();};
System.out.println("the lenth of String Gaurav by implementing  Lambda Expression is: "+s.getLength("Gaurav"));

//creating an object of the class LOS and calling method of class LOS
LOS l1=new LOS();
int l2=l1.getLength("Gaurav");
System.out.println("the length of String by implementing an interface in class LOS is: "+l2);


//3rd method -by ANONYMOUS INNER CLASS
ComputeLengthOfTheString c1=new ComputeLengthOfTheString() 
{
	
	@Override
	public int getLength(String str) 
	{
		int length=str.length();
		return length;
	}
};
int l3=c1.getLength("Shweta");
System.out.println("the length of String by Anonymous Class is is :"+l3);
	}

}

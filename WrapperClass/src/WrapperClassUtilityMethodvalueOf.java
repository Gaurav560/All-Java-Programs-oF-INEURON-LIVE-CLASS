

public class WrapperClassUtilityMethodvalueOf
{
public static void main(String[] args) 

{
	//valueOf is alternative to constructor of Wrapper classes(not suggestible to use)
	//three overloaded valueOf method (works for all wrapper classes)
	
	//1st overloaded valueOf method
	Integer i1=Integer.valueOf(10);
	System.out.println(i1);
	//here 10 is a primitive data given to Integer.valueOf method
	//i1 is a Wrapper class object reference.
	//valueOf method converts String and Primitive Data type in Wrapper Class objects
	
	//2nd overloaded method
	Integer i2=Integer.valueOf("10");
	System.out.println(i2);
	
	
	Boolean boolean1=Boolean.valueOf("gaurav");
	System.out.println(boolean1);
	//note:Boolean.valueOf in case of String arguments it returns true only if true is passed
	//irrespective of case .rest everything will be considered as false
	
	//3rd valueOf(String data ,int radix)->here radix means base
	//and radix cant be more than 36 and less than 2 
	System.out.println(Character.MAX_RADIX);
	System.out.println(Character.MIN_RADIX);
	Integer i3=Integer.valueOf("200", 15);
	System.out.println(i3);
	

}

}

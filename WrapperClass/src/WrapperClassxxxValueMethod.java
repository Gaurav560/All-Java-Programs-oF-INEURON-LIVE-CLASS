
public class WrapperClassxxxValueMethod 
{

	public static void main(String[] args) 
	{
		
		Integer i=Integer.valueOf(150);//primitive to Wrapper object
	//	System.out.println(i);
		
		//total 6 Value method for each Wrapper class except Boolean and Character class
		//in short 36 Value() method for all Wrapper Classes combined
		//xxxValue() converts Wrapper class object into primitive data type 
        System.out.println(i.intValue());//150
        System.out.println(i.byteValue());// answer is -106 as byte 
       // range is -128 to 127(0 included)
        //it starts backward counting means -128 +22
        //formula 
        //result=minrange+(total-maxrange-1) for finding the value in byte type 
        System.out.println(i.floatValue());//150.0
        System.out.println(i.doubleValue());//150.0
        System.out.println(i.shortValue());//150
        System.out.println(i.longValue());//150
       
        
        //only one method in Char and one in Boolean Wrapper Class for Value method
        @SuppressWarnings("removal")
		Character c1=new Character('a');
        		System.out.println(c1.charValue());
        @SuppressWarnings("removal")
		Boolean b=new Boolean("true");
        System.out.println(b.booleanValue());
        
        
	}

}


public class Launch1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
	
		//Integer Class
		Integer i1=new Integer(10);
		System.out.println(i1);
		Integer i2=new Integer("10");
		System.out.println(i2);
//		Integer i3=new Integer("ten");
		//System.out.println(i3);
//		Integer i4=new Integer("55.6");
//		System.out.println(i4);
		//this will create a NumberFormatException at runtime as in argument of 
		//of String type it only takes numbers in String format but not words in String format
		
		
		//Float Class
		Float f1=new Float(33.5);
		System.out.println(f1);
		Float f2=new Float("44.7");
		System.out.println(f2);
		Float f3=new Float(36.7f);
        System.out.println(f3);

//Float f4=new Float("thirty nine.five");//gives NumberFormatException(in String only float values can come)
//System.out.println(f4);

        //Character Class(its constructor takes only character as an argument)
        //wherever character data comes String will never participate in that picture
        Character c1=new Character('a');
        System.out.println(c1);
        
        
//DANGEROUS: Boolean Class has two constructors one takes boolean as an argument other String
        //only true in any case will be returned as true rest everything will be returned as false
        Boolean b1= new Boolean(true);
        System.out.println(b1);
        Boolean b2= new Boolean(false);
        System.out.println(b2);
        Boolean b3= new Boolean("true");
        System.out.println(b3);
        Boolean b4= new Boolean("tRue");
        System.out.println(b4);
        Boolean b5= new Boolean("TRUE");
        System.out.println(b5);
        Boolean b6= new Boolean("ankit");
        System.out.println(b6);
        Boolean b7= new Boolean("false");
        System.out.println(b7);
        Boolean b8= new Boolean("FALSE");
        System.out.println(b8);
        Boolean b9= new Boolean("SHWETA");
        System.out.println(b9);
        
        
        //example
        Boolean b10=new Boolean("yes");
        Boolean b11=new Boolean("no");
        System.out.println(b10);//false
        System.out.println(b11);//false
        //in Wrapper class .equals method compares the data in the object
        //and== compares the reference of the object
        System.out.println(b10.equals(b11));//true
        System.out.println(b10==b11);//false
        
        
        //example
        Integer i10=new Integer(10);
        Integer i11=new Integer(10);
       
        System.out.println(i10);
        System.out.println(i10.equals(i11));
        System.out.println(i10==i11);
	}

}

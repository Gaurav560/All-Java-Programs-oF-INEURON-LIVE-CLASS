
class Static {
	//static variables
	static int a;
	static int b;
	//static block 
	static {
		a=10;
		b=20;
	}
	
	//static method
	public static void display() 
	{
		System.out.println(a+b);
		
	}
	
	//instance variable 
	int c,d;
	
	
	
	//java block(non-static block)
	{
		c=40;d=50;
		
	}
	
	
	
	//ye to constructor hai khud hi call ho jaayega jvm kar lega (iske andar java block execute hota hai sabse pehle)
	public Static()
	{
		System.out.println("the addition of c and d is happening inside non-static java block which is inside the default constructor "+(c+d));
	}
	
	
	//is method ko mujhe khud hi call karna padega kyunki ye non static method hai wo bhi object banake
	public void multiply()
	{
		System.out.println("this method is  non static method and values are taken from java block and result is : "+ c*d);
	}
}
public class StaticKeyword {

	
	//main method is first static method to be execute then after any main method be executed
	public static void main(String[] args)
	{
//object is created for Static class with reference variable s1		
Static s1=new Static();

//non static method multiply is called using object s1
s1.multiply();

//static method display is directly accessed using Class name
Static.display();

	}

}

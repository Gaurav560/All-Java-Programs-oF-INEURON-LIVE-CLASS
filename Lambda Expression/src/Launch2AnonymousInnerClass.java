
public class Launch2AnonymousInnerClass {

	interface Demo{
		void disp();
		void add (int a ,int b);
	}
	
	public static void main(String[] args) {
		// we can define the methods of interface in more than one ways.
		//1. when a class implements interface and override its methods 
		//2.by using a anonymous inner class 
		//3. by lambda expression if the interface is functional 
		
		//creating an anonymous inner class and overriding the method 
	Demo d= new Demo () 
	{
		//overriding the disp method  of interface Demo
		//conclusion :we can implement any no of methods or any interface like normal or functional
		//in anonymous inner class with any number of parameters unlike Lambda expression which can implement only one method
		//of interface (functional )
		public void disp() 
		{
			System.out.println("Hello Java Developers !");
			System.out.println("How are you ?");
			
		}
		public void add(int a ,int b) {
			int c=a+b;
			System.out.println("the addition of two numbers is :"+c);
		}
		
	};
	
	//calling the disp() method 
	d.disp();
	d.add(22, 44);
	}

}

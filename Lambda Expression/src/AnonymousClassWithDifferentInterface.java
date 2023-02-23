
//1st interface
interface Demo1
{
	//abstract methods
	int add(int a,int b);
	int subtract(int a,int b);
}

//2nd interface
interface Demo2
{
	//abstract methods
	int multiply(int a,int b);
	float divide(float a, float b);
	
	
}
public class AnonymousClassWithDifferentInterface {

	public static void main(String[] args) {
		
		//anonymous inner class
		Demo1 d1=new Demo1() {
			
			@Override
			public int subtract(int a, int b) {
				int c=a-b;
				return c;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				int c=a+b;
				return c;
			}
		};
		Demo2 d2= new Demo2() {
			
			@Override
			public int multiply(int a, int b) {
				// TODO Auto-generated method stub
				int c=a*b;
				return c;
			}
			
			@Override
			public float divide(float a,float b) {
				// TODO Auto-generated method stub
				float c=a/b;
				return c;
			}
		};

		int Add=d1.add(20, 15);
		int Sub=d1.subtract(20, 20);
		int Mul=d2.multiply(40, 20);
	float Div=d2.divide(200.4f, 102.4f);
	System.out.println("addtion: "+Add);
	System.out.println("subtraction: "+Sub);
	System.out.println("Multiplication: "+Mul);
	System.out.println("Div: "+Div);
		
	}

}

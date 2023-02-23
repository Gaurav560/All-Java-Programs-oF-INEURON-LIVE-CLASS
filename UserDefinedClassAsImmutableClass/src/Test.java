
final class Test {

	int i;//instance variable
	public Test(int i)
	{
		this.i=i;
		
	}
	public Test modify(int i) //this method returns an object of class Test and accepts the data
	{
		if (this.i==i) {
			return this;
			
		}
		else {
			return new Test(i);
		}
		
	}
	public static void main(String[] args) {
		
Test t1=new Test(10);
Test t2=t1.modify(10);
Test t3=t1.modify(100);

System.out.println(t1==t2);
System.out.println(t1==t3);
System.out.println(t2==t3);

	}

}

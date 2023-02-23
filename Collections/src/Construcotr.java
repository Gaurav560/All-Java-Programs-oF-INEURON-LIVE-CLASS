import java.util.concurrent.CountDownLatch;

class a1{
	public int a;
	public static int b=0;
	public static a1 instance=null;
	private a1() 
	{
		b++;
		System.out.println("Count = "+b);
		
	}
	public static a1 getdata()
	{
		if(instance==null)
		{
			instance=new a1();
		}
		return instance;
	}
	public void usedata(String message)
	{
		System.out.println("this a "+ message);
	}
	
}

public class Construcotr {

	public static void main(String[] args) {
	     
		System.out.println("4"+5);
	}

}

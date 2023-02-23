

class demo1{
	int a;
	int b;
	
	//int count;
	
	//agar hm count ko instance variable ke jaise use karenge to har baar
	//object creat ke time pe uska value initialize hoke zero banjaayega tab count++
	//hoga .isiliye hm count variable ko hm final bana rahe hain kyunki uska 
	//value ek hi baar initialize hoga heap mein uske baad har baar object banne pe
	//count++ hoga .
	
	
	static int count;
	{count++;}
	public demo1()
	{
		//no need to include count++ every time in constructor as while executing constructor
		//every time it will first execute the non static java block each time.
		//count++;
}
	public demo1(int a) {
		this.a=a;
		//count++;
	}public demo1(int a,int b) {
		this.a=a;
		this.b=b;
		//count++;
	}
	
}
public class NonStaticBlock {

	public static void main(String[] args) {
	
demo1 d1=new demo1();
demo1 d2=new demo1(7);
demo1 d3=new demo1(16,67);

System.out.println(demo1.count);
	}

}

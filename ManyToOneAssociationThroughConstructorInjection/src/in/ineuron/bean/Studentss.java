package in.ineuron.bean;

public class Studentss {
	public String sname;
	public String sid;
	public String saddr;
	public Branch1 branch1;
	public Studentss(String sname, String sid, String saddr, Branch1 branch1) 
	{
		super();
		this.sname = sname;
		this.sid = sid;
		this.saddr = saddr;
		this.branch1 = branch1;
	}
public void getStudentDetails() {
	
	
	System.out.println("Student id is: "+sid);
	System.out.println("Student name is: "+sname);
	System.out.println("Student addr is: "+saddr);
	System.out.println("Student branch id is: "+branch1.bid);
	System.out.println("Student branch name is: "+branch1.bname);
	System.out.println("Student branch address is: "+branch1.baddr);
	System.out.println("==============================");
}
}

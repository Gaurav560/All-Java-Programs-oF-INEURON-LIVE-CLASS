package in.ineuron.bean;

public class Department1 {
	private String did;
	private String dname;
	
	//HAS A RELATIONSHIP
	//an array of reference variables emps
	private Employees1[] emps;
	
	public void setDid(String did) 
	{
		this.did = did;
	}

	public void setDname(String dname)
	{
		this.dname = dname;
	}
	
	public void setEmps(Employees1[] emps)
	{
		this.emps = emps;
	}
	public void getDepartment1Details() 
	{
		System.out.println("department id is:"+did);
		System.out.println("department name is:"+dname);
		System.out.println("==========================");
		System.out.println("employees details are:");
		System.out.println("==================");
		//here employees1 is a local variable of type Employees1 iterating over every element in array emps
		for (Employees1 employees1 : emps) 
		{
			System.out.println("Employee id is :"+employees1.getEid());
			System.out.println("Employee id is :"+employees1.getEname());
			System.out.println("Employee id is :"+employees1.getEaddr());
			System.out.println(" ");
		}
		
		
		
	}
}

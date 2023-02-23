package in.ineuron.bean;
//target object
public class Department
{
private String did;
private String dname;
//HAS A RELATION
private Employees[] emps;
//CONSTRUCTOR INJECTION
public Department(String did, String dname, Employees[] emps)
{
	super();
	this.did = did;
	this.dname = dname;
	this.emps = emps;
}
public void getDepartmentDetails()
{
	System.out.println("Department details are:");
	System.out.println("------------------------");
	System.out.println("Department Id is :"+did);
	System.out.println("Department name is :"+dname);
	System.out.println("----------------------------");
	System.out.println("employee details are :");
	System.out.println("====================");
	//means i am traversing an array  emps with the help of a local variable employees and data type of that local variable is Employees
	for (Employees employees : emps)
	{
		System.out.println("Employee id is:"+employees.eid);
		System.out.println("Employee name is:"+employees.ename);
		System.out.println("Employee address is:"+employees.eaddr);
		System.out.println("===================================");
	}
	
}

}

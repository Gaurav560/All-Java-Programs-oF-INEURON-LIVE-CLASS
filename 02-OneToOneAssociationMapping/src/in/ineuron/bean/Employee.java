package in.ineuron.bean;

public class Employee {

	//instance variable of class Employee
	private String eid;
	private String ename;
	private String eaddr;

	
	//HAS-A-RELATIONSHIP
	Account account;//note :account is also an instance variable in the class Employee
	//we will initialize the variable account through constructor
	
	
	//injecting the values in instance variables through a constructor[CONSTRUCTOR INJECTION]
	public Employee(String eid, String ename, String eaddr,Account account) 
	{
		super();
		this.eid=eid;
		this.ename=ename;
		this.eaddr=eaddr;
		this.account=account;//initializing the account reference variable through constructor injection 
		
	}
	
	//to print the details of employee
	
	public void getEmployeeDetails() {
		System.out.println("employee details are :");
		System.out.println("EMPID :"+eid);
		System.out.println("EMPADDRESS :"+eaddr);
		System.out.println("EMPNAME :"+ename);
		
		System.out.println("=============================================");
		
		System.out.println("account details are:");
		System.out.println("ACCNO:"+account.accNo);
		System.out.println("ACCNAME:"+account.accName);
		System.out.println("ACCTYPE:"+account.accType);
	}
}

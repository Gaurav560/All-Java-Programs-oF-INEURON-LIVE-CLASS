package in.ineuron.bean;

public class Employee1 {

	private String eid;
	private String eName;
	private String eAddr;
	//has a relation
	Account1 account;
	
	//Initializing the variables through setters

public void setEid(String eid) {
	this.eid = eid;
}

public void seteName(String eName) {
	this.eName = eName;
}

public void seteAddr(String eAddr) {
	this.eAddr = eAddr;
}

public void setAccount(Account1 account) {
	this.account = account;
}
	
	//printing  the employee details
public void getEmployeeDetails1() 
{
	System.out.println("employees details are:");
	System.out.println("EID is:"+eid);
	System.out.println("ENAME is:"+eName);
	System.out.println("EADDR is:"+eAddr);
	System.out.println("======================================================");
	System.out.println("account details are:");
	System.out.println("ACCNO is:"+account.getAccNo());
	System.out.println("ACCNAME is:"+account.getAccName());
	System.out.println("ACCTYPE is:"+account.getAccType());
	
}

}

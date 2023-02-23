package in.ineuron.bean;

//dependent object
public class Account {

	//instance variables
	 String accNo;
	 String accName;
	 String accType;
	
	
	//injecting value to these instance variables through constructor
	public Account(String accNo, String accName, String accType)
	{
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}
	
}

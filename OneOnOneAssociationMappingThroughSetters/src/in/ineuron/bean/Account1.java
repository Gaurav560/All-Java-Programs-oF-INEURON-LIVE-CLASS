package in.ineuron.bean;

public class Account1 
{

	 private String accNo;
	private String accName;
	private String accType;
	
	//injecting values inside instance variables of this class through setters
	public void setAccNo(String accNo) 
	{
		this.accNo=accNo;
	}
	public void setAccName(String accName) 
	{
		this.accName=accName;
	}
	
	public void setAccType(String accType) 
	{
		this.accType=accType;
	}
	
	public String getAccNo()
	{
		return accNo;
	}
	public String getAccName()
	{
		return accName;
	}
	public String getAccType()
	{
		return accType;
	}
}

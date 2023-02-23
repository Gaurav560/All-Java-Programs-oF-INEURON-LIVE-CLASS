package in.ineuron.main;

public class Student {

	//instance variables(of object type not primitive type as wrapper class is being used)
	private Integer sid;
	private String sname;
	private Integer sage;
	
	//now there are tow ways in which i can set values to these variables
	//1. by constructor and 2. by setters
	
	
	//we are using constructor to set the values to these instance variables
	public Student(Integer sid,String sname,Integer sage) 
	{
		super();//the first line in constructor 
	this.sid=sid;
	this.sname=sname;
	this.sage=sage;
	}
	
	//getters to set the value
	public Integer getSid() 
	{
		return sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public Integer getSage() 
	{
		return sage;
	}

	//if we don't override toString method it will make a call to object class toString method 
	//and object class toString method will never print the values associated with instance variables
	//it will print some random values starting with package name.class name
	public String toString() 
	{
		return "sname is "+sname+"\n sage is "+sage+" \nsid is "+sid+" ";
	}
}

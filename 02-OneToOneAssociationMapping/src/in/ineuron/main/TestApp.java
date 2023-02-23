package in.ineuron.main;

import in.ineuron.bean.Account;
import in.ineuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) 
	{
		
		//now as coding of Account is ready
		//object of class Account should be created first
	Account	account=new Account("37734589394", "ANKIT", "savings");//passing arguments while object 
	//creation .these values reach the constructor and constructor will initialize the instance variables
	
	
	//constructor injection as account is being injected in constructor of an employee
	//u can also see that object of Account class is being injected in object of class Employee
                Employee employee = new Employee("1809146","ANIT", "KASHIPUR", account);
                employee.getEmployeeDetails();
	}

}

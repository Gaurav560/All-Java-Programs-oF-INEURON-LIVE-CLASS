package in.ineuron.main;

import in.ineuron.bean.Account1;

import in.ineuron.bean.Employee1;

public class TestApp1 {

	public static void main(String[] args) 
	{
		//creating a dependent object
	Account1 account1=new Account1();
	//initializing the  instance variables of dependence class through object of 
	//this dependent class and setter functions
	account1.setAccName("Gaurav");
account1.setAccNo("37734589394");
account1.setAccType("personal");


//creating a target object name employee and initialize its instance variables 
//through this employee object using setter functions
Employee1 employee=new Employee1();
employee.setAccount(account1);
employee.setEid("1809146");
employee.seteAddr("kashipur");
employee.seteName("ankit");

employee.getEmployeeDetails1();
}

}

package in.ineuron.main;

import in.ineuron.bean.Department;
import in.ineuron.bean.Employees;

public class Test2 {

	public static void main(String[] args)
	{
		//creating objects of class employee for injecting in object of class department
		Employees e1=new Employees("10","sachin" , "mi");
		Employees e2=new Employees("7","dhoni" , "csk");
		Employees e3=new Employees("18","virat" , "rcb");

		//creating an array emps 
		Employees[] emps=new Employees[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		//multiple employees injecting in department through constructor{Constructor injection}
		Department d=new Department("Ipl16", "BCCi", emps);
		d.getDepartmentDetails();
	}

}

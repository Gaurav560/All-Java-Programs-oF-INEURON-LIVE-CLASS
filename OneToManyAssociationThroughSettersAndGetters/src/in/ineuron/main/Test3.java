package in.ineuron.main;

import in.ineuron.bean.Department1;
import in.ineuron.bean.Employees1;

public class Test3 {

	public static void main(String[] args) {
		Employees1 e1=new Employees1();
	e1.setEid("10");
	e1.setEname("MESSI");
	e1.setEaddr("BARCA");
	Employees1 e2=new Employees1();
	e2.setEid("9");
	e2.setEname("LUIS SUAREZ");
	e2.setEaddr("BARCA");
	Employees1 e3=new Employees1();
	e3.setEid("7");
	e3.setEname("COUTINHO");
	e3.setEaddr("BARCA");
	Department1 d2= new Department1();
	d2.setDid("LALIGA");
	d2.setDname("SPAIN");
	
	Employees1[] emps= new Employees1[3];
	emps[0]=e1;
	emps[1]=e2;
	emps[2]=e3;
d2.setEmps(emps);
d2.getDepartment1Details();
	}

}

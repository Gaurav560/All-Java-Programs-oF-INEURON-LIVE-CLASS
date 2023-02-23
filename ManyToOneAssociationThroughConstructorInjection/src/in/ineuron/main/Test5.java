package in.ineuron.main;

import in.ineuron.bean.Branch1;
import in.ineuron.bean.Studentss;

public class Test5 {

	public static void main(String[] args) 
	{
	//dependent object
		
		Branch1 b= new Branch1("5554","JAVA FULLSTACK", "INEURON BANGALORE");
		
		//injection of dependent object through constructor in the objects of targets
		
		//target objects
		Studentss s1=new Studentss("gaurav", "14", " police line road gaya", b);
		Studentss s2=new Studentss("shweta bharty", "54", " beldari tola gaya", b);
		Studentss s3=new Studentss("nishant", "58", " zila school gaya", b);
		Studentss s4=new Studentss("aditya", "03", "madhupur deoghar", b);
		System.out.println("student details are:");
		System.out.println("==========================");
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
		s4.getStudentDetails();

	}
	
}

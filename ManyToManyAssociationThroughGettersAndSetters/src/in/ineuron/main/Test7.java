package in.ineuron.main;

import in.ineuron.bean.Courses1;
import in.ineuron.bean.Students1;

public class Test7 {

	public static void main(String[] args) 
	{
//creating dependent object c1 and initializing the instance variables of that class using setters
		Courses1 c1=new Courses1();
		c1.setCid("101");
		c1.setCname("Java FullStack");
		c1.setCprice("16000");
		//creating dependent object c2 and initializing the instance variables of that class using setters
		Courses1 c2=new Courses1();
		c2.setCid("102");
		c2.setCname("DOtNet FullStack");
		c2.setCprice("14000");
		
		//creating dependent object c3 and initializing the instance variables of that class using setters
		Courses1 c3=new Courses1();
		c3.setCid("103");
		c3.setCname("Machine Learning FullStack");
		c3.setCprice("20000");
		Courses1[] course=new Courses1[3];
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		Students1 s1=new Students1();
		s1.setSid("1809157");
		s1.setSname("gaurav");
		s1.setSaddr("police line road gewal bigha bathan gaya");
		s1.setCourses1(course);
		Students1 s2=new Students1();
		s2.setSid("1809154");
		s2.setSname("shweta bharty");
		s2.setSaddr("beladari tola gaya");
		s2.setCourses1(course);
		Students1 s3=new Students1();
		s3.setSid("1809153");
		s3.setSname("nishant prakash");
		s3.setSaddr("zila school gaya");
		s3.setCourses1(course);
		Students1 s4=new Students1();
		s4.setSid("1809155");
		s4.setSname("aditya raj");
		s4.setSaddr("rangamati, post padjori madhupur deoghar");
		s4.setCourses1(course);
		Students1 s5=new Students1();
		s5.setSid("1809146");
		s5.setSname("ankit");
		s5.setSaddr("kashipur udham singh nagar");
		s5.setCourses1(course);
		s1.getStudentDetails();
		System.out.println("");
		s2.getStudentDetails();
		System.out.println("");
		s3.getStudentDetails();
		System.out.println("");
		s4.getStudentDetails();
		System.out.println("");
		s5.getStudentDetails();
		
	}

}

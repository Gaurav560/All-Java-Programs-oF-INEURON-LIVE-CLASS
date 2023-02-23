package in.ineuron.main;

import in.ineuron.bean.Courses;
import in.ineuron.bean.Students;

public class Test6 {

	public static void main(String[] args) {
		Courses[] c=new Courses[3];
		Courses c1=new Courses("22", "java fullStack", "16000");
		Courses c2=new Courses("23", "machine learning fullStack", "15000");
		Courses c3=new Courses("24", "dont net fullStack", "14000");
		c[0]=c1;
		c[1]=c2;
		c[2]=c3;
		Students s1=new Students("s11", "gaurav", "police line road gaya", c);
		Students s2=new Students("s12", "shweta bharty", "beldari tola gaya", c);
		Students s3=new Students("s13", "nishant prakash", "zila school gaya", c);
		Students s4=new Students("s14", "ankit", "kashipur", c);
		Students s5=new Students("s14", "aditya raj", "padjori,madhupur ,deoghar", c);
s1.getStudentDetails();
s2.getStudentDetails();
s3.getStudentDetails();
s4.getStudentDetails();
s5.getStudentDetails();
	}

}

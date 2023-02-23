package in.ineuron.bean;

public class Students {
public String sid;
public String sname;
public String saddr;
//array of reference variables
Courses[] courses;
public Students(String sid, String sname, String saddr, Courses[] courses) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.saddr = saddr;
	this.courses = courses;
}

public void getStudentDetails() {
	System.out.println("Student id is:"+sid);
	System.out.println("Student name is:"+sname);
	System.out.println("Student address is:"+saddr);
	System.out.println("");
	System.out.println("course details are:");
	System.out.println("");
	for (Courses i : courses)
	{
		System.out.println("Course id is :"+i.cid);
		System.out.println("Course name is :"+i.cname);
		System.out.println("Course price is :"+i.cprice);
		System.out.println("");
	}
	System.out.println("=============================");
}
}

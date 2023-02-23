package in.ineuron.bean;

public class Students1 {
private String sid;
private String sname;
private String saddr;
private Courses1[] courses1;
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddr() {
	return saddr;
}
public void setSaddr(String saddr) {
	this.saddr = saddr;
}
public Courses1[] getCourses1() {
	return courses1;
}
public void setCourses1(Courses1[] courses1) {
	this.courses1 = courses1;
}
public void getStudentDetails() 
{
	System.out.println("student details are :");
	System.out.println("Student id is :"+sid);
	System.out.println("Student name is :"+sname);
	System.out.println("Student address is :"+saddr);
	System.out.println("");
	System.out.println("course details are");
	System.out.println("");
	for (Courses1 i : courses1) 
	{
	System.out.println("Course id is :"+i.getCid());	
	System.out.println("Course name is :"+i.getCname());	
	System.out.println("Course price  is :"+i.getCname());
	System.out.println("");
	}
	System.out.println("=================================");
}

}

package in.ineuron.main;

import in.ineuron.bean.Branch;
import in.ineuron.bean.Students;

public class Test4 {

	public static void main(String[] args) {
	Branch b=new Branch();
	b.setBid("4567");
	b.setBname("JAVA FULL STACK ");
	b.setBaddr("INEURON BENGALURU");

	Students s1=new Students();
	s1.setSid("14");
	s1.setSname("gaurav");
	s1.setSaddr("police line");
	s1.setBranch(b);
	
	Students s2=new Students();
	s2.setSid("03");
	s2.setSname("ankit");
	s2.setSaddr("kashipur");
	s2.setBranch(b);
	
	Students s3=new Students();
	s3.setSid("54");
	s3.setSname("shweta bharty");
	s3.setSaddr("nutan nagar");
	s3.setBranch(b);
	
	Students s4=new Students();
	s4.setSid("58");
	s4.setSname("nishant prakash");
	s4.setSaddr("zila school");
	s4.setBranch(b);
	System.out.println("student details are :");
	System.out.println("===================================");
	System.out.println("Student id is "+s1.getSid());
	System.out.println("Student name is "+s1.getSname());
	System.out.println("Student addr is "+s1.getSaddr());
	System.out.println("Student branch is "+s1.getBranch().getBid());
	System.out.println("Student branch name is "+s1.getBranch().getBname());
	System.out.println("Student branch address is "+s1.getBranch().getBaddr());
	System.out.println("===================================");
	
	System.out.println("student details are :");
	System.out.println("Student id is "+s2.getSid());
	System.out.println("Student name is "+s2.getSname());
	System.out.println("Student addr is "+s2.getSaddr());
	System.out.println("Student branch id is "+s2.getBranch().getBid());
	System.out.println("Student branch name is "+s2.getBranch().getBname());
	System.out.println("Student branch address is "+s2.getBranch().getBaddr());
	System.out.println("===================================");
	System.out.println("student details are :");
	System.out.println("Student id is "+s3.getSid());
	System.out.println("Student name is "+s3.getSname());
	System.out.println("Student addr is "+s3.getSaddr());
	System.out.println("Student branch is "+s3.getBranch().getBid());
	System.out.println("Student branch name is "+s3.getBranch().getBname());
	System.out.println("Student branch address is "+s3.getBranch().getBaddr());
	System.out.println("===================================");
	System.out.println("student details are :");
	System.out.println("Student id is "+s4.getSid());
	System.out.println("Student name is "+s4.getSname());
	System.out.println("Student addr is "+s4.getSaddr());
	System.out.println("Student branch is "+s4.getBranch().getBid());
	System.out.println("Student branch name is "+s4.getBranch().getBname());
	System.out.println("Student branch address is "+s4.getBranch().getBaddr());
	System.out.println("===================================");
	}

}

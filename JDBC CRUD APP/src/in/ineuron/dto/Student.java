package in.ineuron.dto;

import java.io.Serializable;

public class Student implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Integer sid;
private String sname;
private Integer sage;
private String saddress;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Integer getsAge() {
	return sage;
}
public void setsAge(Integer sAge) {
	this.sage = sAge;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sAge=" + sage + ", saddress=" + saddress + "]";
}


}

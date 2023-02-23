package in.ineuron.bean;
//independent object will be from this class

public class Students {
private String sname;
private String sid;
private String saddr;
Branch branch;
public void setBranch(Branch branch) {
	this.branch=branch;
}
public Branch getBranch() {
	return branch;
}

public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSaddr() {
	return saddr;
}
public void setSaddr(String saddr) {
	this.saddr = saddr;
}

}

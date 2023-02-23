package in.ineuron.bean;
//dependent object will be from this class
public class Branch {
private String bid;
private String bname;
private String baddr;
public void setBid(String bid) {
	this.bid=bid;
}
public String getBid() {
	return bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBaddr() {
	return baddr;
}
public void setBaddr(String baddr) {
	this.baddr = baddr;
}

}

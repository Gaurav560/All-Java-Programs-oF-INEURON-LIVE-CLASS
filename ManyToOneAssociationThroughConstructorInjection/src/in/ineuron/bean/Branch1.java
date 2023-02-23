package in.ineuron.bean;

//many students has a branch1
//many to one association
//this class is dependent class

public class Branch1 {
	String bid;
	 String bname;
	 String baddr;
	public Branch1(String bid, String bname, String baddr) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.baddr = baddr;
	}
	
}

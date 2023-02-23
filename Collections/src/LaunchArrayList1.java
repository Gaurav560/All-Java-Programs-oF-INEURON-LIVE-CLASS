import java.util.ArrayList;

public class LaunchArrayList1 {
	//ArrayList -internally it follows dynamically Array DataStructure(which can expand or shrink its size at runtime)
//can store both heterogeneous and homogeneous data 
	//data is stored in the form of object
	//can perfrom the operaion without using the utility classes
	//it follows List Interface
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList aL1=new ArrayList();
aL1.add(10);
aL1.add(30);
aL1.add(40);
aL1.add(50);
aL1.add(60);
System.out.println(aL1);

ArrayList aL2=new ArrayList();
aL2.add(20);
aL2.add("gaurav");
aL2.add('f');
aL2.add(18.5);
aL2.add(49.2f);
aL2.add("ks");
System.out.println(aL2);

System.out.println("******************************");
ArrayList aL3=new ArrayList();
//we can add entire collection to another collection
aL3.addAll(aL2);
aL3.add("krishna");
aL3.add('g');
aL3.add(30);
aL3.add(3.5);
//we can add element on the basis of index
aL3.add(2, 56);
//adding any element without index will aitomatically add the element to the rear end of collection 
aL3.add(76);
//adding entire collection at any index
aL3.addAll(1,aL2);
System.out.println(aL3);
	}
//homogeneuos and heterogeneous type of data is allowed
	//this data is stored in the collection as an object

}

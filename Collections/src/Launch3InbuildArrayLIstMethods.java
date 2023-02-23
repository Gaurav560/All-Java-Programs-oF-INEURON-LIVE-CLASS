import java.util.ArrayList;

public class Launch3InbuildArrayLIstMethods {
//addFirst and addLast method is not in list interface .it is in deque interface thus it is present 
	//in present in LinkedList.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aL1=new ArrayList();
		aL1.add(10);
		aL1.add(30);
		aL1.add(40);
		aL1.add(50);
		aL1.add(60);
		System.out.println(aL1);
		//inbuild methods
	boolean contain=aL1.contains(30);
	System.out.println(contain);
	Integer aInteger=aL1.indexOf(40);
	System.out.println(aInteger);
	System.out.println(aL1.isEmpty());
	aL1.ensureCapacity(10);
	System.out.println(aL1.size());
	aL1.trimToSize();
	System.out.println(aL1.size());
	System.out.println(aL1.getClass());
	aL1.clear();
	System.out.println(aL1);
	System.out.println(aL1.size());
	}

}

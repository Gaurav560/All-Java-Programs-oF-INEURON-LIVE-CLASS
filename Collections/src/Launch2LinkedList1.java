import java.util.LinkedList;

public class Launch2LinkedList1 {

	public static void main(String[] args) {
	//this class of collection follows list and deque interface
		//internally it implements Doubly LInked List
		//homogeneous and heterogeneous data can be stored in the form of object
		//no shifting of original data .only links will change and new node will be created
		//when element is added to rear end ArrayList is preferable.
		//for any other index element addition LinkedList is recommended.
		//Array is faster than ArrayList
		//duplciate elements can be inserted in both ArrayList and LInkedList

		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.add("gaurav sharma");
		l1.add(35.5f);
		l1.add(18.2);
		l1.add('s');
		System.out.println(l1);
		
		//adding to the first index
		l1.addFirst("shweta");
		//adding to the last index
		l1.addLast(" bharty");
		System.out.println(l1);
		System.out.println("*****************");
		LinkedList l2=new LinkedList();
		l2.add(200);
		l2.add("gauri");
		l2.add(35);
		l2.add(15.2f);
		System.out.println(l2);
		//adding a collection to other collection
		l2.addAll(2, l1);
		System.out.println(l2);
	}

}

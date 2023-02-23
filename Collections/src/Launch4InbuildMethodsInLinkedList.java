import java.util.LinkedList;

public class Launch4InbuildMethodsInLinkedList {
//duplicates are allowed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.add("gaurav sharma");
		l1.add(35.5f);
		l1.add(35.5f);
		l1.add(18.2);
		l1.add('s');
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		//accessing duplicates elements
		System.out.println(l1.indexOf(35.5f));
		System.out.println(l1.lastIndexOf(35.5f));
		//offerFirst and offerLastMethods
		//these method implications will be decided by jvm (not compulsory)
		l1.offerFirst(45);
l1.offerLast(75);
System.out.println(l1);
		//compulsory for jvm to implement 
		l1.addFirst(55);
		l1.addLast(87);
		System.out.println(l1);
		
		//peekFirst and pollFirst(both of them will fetch the data of first element of the collection but poll first will remove the first element and update and update the collection )
	l1.peekFirst();
	System.out.println(l1);
	l1.pollFirst();
	System.out.println(l1);
	l1.remove(0);//remove the element from that index
	System.out.println(l1);
	}

}

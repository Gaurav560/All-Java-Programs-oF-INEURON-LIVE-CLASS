import java.util.ArrayDeque;

public class Launch5ArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//in queue accessing of data through index  is not allowed 
		//internally it implements double ended queue
		//in double ended queue insertion and both can happen at front as well as rear end
		//addfirst ,addlast,offerfirst,offerlast these methods should be present in ArrayDeque
		//no method such as accessing based on any index od inserting based on any index
		//duplicates are allowed
		ArrayDeque ad1=new ArrayDeque();
		ad1.add(45);
		ad1.add("gs");
		ad1.add('g');
		ad1.add(45.6f);
		ad1.add(13.8);
		ad1.add(13.8);
		System.out.println(ad1);
		
		//inbuild methods
		//ad1.add(3,65);  =>not allowed. cannot insert anywhere through index
	}

}

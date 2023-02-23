package in.ineuron.main;

public class Strings {

	public static void main(String[] args) {
		//case-1
		
//		String s1="sachin";//stringobject s1 is immutable
//	    s1.concat("tendulkar");
//		System.out.println(s1);//o/p-sachin
//		
//		StringBuilder s1=new StringBuilder("sachin");//stringbuilder object s1 is of mutable type
//	    s1.append("tendulkar");
//		System.out.println(s1);//o/p-sachintendulkar
		
		
		//case-2
//		String s1="sachin";
//		String s2=new String("sachin");
//		System.out.println(s1==s2);//returns false as a output as == checks if s1 and s2 both points to the same object or not
//		System.out.println(s1.equals(s2));//returns true as .equals method compare the content present inside the string
//
//		

		//case-3
//		StringBuilder s1=new StringBuilder("sachin");
//		StringBuilder s2=new StringBuilder("sachin");
//		System.out.println(s1==s2);//returns false as a output as == checks if s1 and s2 both points to the same object or not
//		System.out.println(s1.equals(s2));//false as in StringBuilder .equals compares to the reference of objects and not content of object
		
		//case-4
//		String s1=new String("dhoni");
//		String s2=new String("dhoni");
//		System.out.println(s1==s2);//as ==compares that if s1 and s2 are referring to the same object or not 
//		String s3="dhoni";
//		String s4="dhoni";
//		System.out.println(s3==s4);//the memory allocated will be in constant pool and duplicate values are not allowed in constant pool so both s1 and s2 are referncing to same object in pool .thus this statement is true
		
		
		//case-5(very important concept .see notes)
//		String s =new String("sachin");
//		s.concat("tendulkar");
//		s=s.concat("IND");
//		s="sachintendulkar";
//		System.out.println(s);
		
		
		//new question
		String s1=new String("sachin");
		s1.concat("tendulkar");
		s1+="IND";
		String s2=s1.concat("MI");
		System.out.println(s1);
		System.out.println(s2);
	}

}

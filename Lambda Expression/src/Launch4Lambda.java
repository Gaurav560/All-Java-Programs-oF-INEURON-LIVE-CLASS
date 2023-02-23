interface SUb1
{
	int sub(int num);
}
public class Launch4Lambda {

	public static void main(String[] args) {
		
		//this code is written to tell that if you write RETURN statement in
		//Lambda expression body within a single line then curly braces is mandatory
		SUb1 sub= num ->{return num-3;};
         System.out.println(sub.sub(10));
	}

}

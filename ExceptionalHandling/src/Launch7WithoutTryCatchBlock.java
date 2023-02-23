
public class Launch7WithoutTryCatchBlock {

	public static void main(String[] args)
	{
	
		System.out.println("you have to work very hard");
			System.out.println(10/0);
			//after the above line these below lines wont be executed as
			//the program will end abruptly due to an exception caused by 10/0(Runtime exception :Arithmetic exception)
			System.out.println("risky code handled in this catch block");
			System.out.println("u have to take care of all your family.");

	}

}

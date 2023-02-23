import java.util.Scanner;

public class Atm {
	
	//This is just a basic code of how atm works .
	//i will update it further.
	
	//this is my current balance which gets updated after every transaction
	static int currentBalance=4500000;
	
	//use of long as number is very large
	static long accNO=37734589394L;
	
	//taking inputs from Scanner class on how much to withdraw or deposit in account
	Scanner sc=new Scanner(System.in);
	
	//method for Cash Withdraw
	public void withdrawl() 
	{
		System.out.println("Enter the amount you want to withdraw from your account :");
		int withDraw=sc.nextInt();
		
		//checking if withdrawal amount is lower or equal to currentBalance or not
		if (currentBalance>=withDraw) 
		{
		
			System.out.println("Please collect "+ withDraw  +"Rs. from the Atm Machine.");	
			currentBalance=currentBalance-withDraw;
		}
		else {
			System.out.println("your current balance is lower than your withdrawal amount.");
			System.out.println("Please withdraw less than or equals to current Balance.");
		}
		
		
		//updating the current balance 
		
		System.out.println("Your updated balance  is  :"+currentBalance);
		
		  
	 start();
		}
	
	
	
	
	//method for deposit of money
	public void deposit() 
	{
		System.out.println("enter the amount you want to deposit:");
		int depo=sc.nextInt();
		if (depo>0)
		{
			System.out.println(depo+"Rs. deposited in your account no."+accNO);	
		}
		else {
			System.out.println("404 fatal error. Please check your deposited amount");
		}
		
		
		//updating the current balance
		currentBalance=currentBalance+depo;
		System.out.println("Your updated balance  is :"+currentBalance);
	
	 start();
		}
	
	//method for CheckingBalance
	public void checkBalance()
	{
		System.out.println("Your  Balance is : "+currentBalance);
		
		
		 start();
		}
	
	//exit method
	public void exit() {
		System.out.println("Have a Wonderful Day. Thanks Happy to Serve you");
		System.exit(0);
	
	}
	public static void start()
	{

		
		System.out.println("WELCOME GAURAV SHARMA..");
		System.out.println("Press 1 for CheckBalance");
		System.out.println("Press 2 for Cash Withdrawl");
		System.out.println("Press 3 for Deposit");
		System.out.println("Press 4 for exit");
		Scanner sc=new Scanner(System.in);
	       int x=sc.nextInt();
	       
		//asking the user to type 1,2,3 or 4
	  repeat(x);
		
		
			
	}	
	public static void repeat(int k) 
	{
		Atm a1=new Atm();
		int i = k;
			if (i==1)
			{
				
				a1.checkBalance();
				
			}
			else if (i==2)
			{
				a1.withdrawl();
			}
			else if (i==3) {
				a1.deposit();
			}
			else if (i==4) {
				a1.exit();
			}
			
			//if someone throws an unknown integer other than 1,2,3,4
			else {
				System.out.println("Sir please Check your input .");
			}
		
		
	}
	
	//driver method
	public static void main(String[] args) 
	{
		start();
		
		//creating an object of Atm class to call different methods
		//such as CheckBalance ,Withdrawal,Deposit,exit
		
	
	}

}

import java.util.Scanner;

public class Calculator
{
//method to add two numbers
	public static void Add() 
	{
	
		Scanner sc=new Scanner(System.in);
			System.out.println("please enter the first number:");
			int num1=sc.nextInt();
			System.out.println("please enter the second number:");
			int num2=sc.nextInt();
			int res=num1+num2;
		System.out.println(" value of Addition of elements is: "+res);
		//sc.close();
		start();
	}
	
	
	
	
	public static void Multiply()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number:");
		int num1=sc.nextInt();
		System.out.println("please enter the second number:");
		int num2=sc.nextInt();
		int res=num1*num2;
		System.out.println("value of Multiplication of numbers is:"+res);
		start();
		//sc.close();
	}
	
	
	
	//method for finding subtract 
	public static void Subtract()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number:");
		int num1=sc.nextInt();
		System.out.println("please enter the second number:");
		int num2=sc.nextInt();
		//sc.close();
		int sub;
	if (num1>=num2)
	{
		sub=num1-num2;
	}
	else {
		sub=num2-num1;
	}
		System.out.println("the subtraction of two numbers is :"+sub);
		start();
		
	}
	
	
	
	//method for finding divide value of two numbers
	public static void Divide()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number:");
		int num1=sc.nextInt();
		System.out.println("please enter the second number:");
		int num2=sc.nextInt();
		//sc.close();
		float divide=0.0f;
		
		//removing infinity condition
		if (num2!=0)
		{
			divide=(float)num1/num2;
		}
		else
		{
			System.out.println("please provide value of num2 other than 0.");
			
		}
		
		System.out.println("value of division of two numbers is:"+divide);
		start();
	}
	
	
	//method for finding square root of a number
	public static void squareRoot()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number for which you want to find square root:");
		int num1=sc.nextInt();
		//sc.close();
		double sqrt=0;
		if (num1>=0) {
			sqrt=num1/2;
			double temp;
			do {
				temp=sqrt;
				sqrt=(temp+(num1/temp))/2;
			} while ((temp-sqrt)!=0);
		}
	
		System.out.println(sqrt);
		
		
		start();
		
	}
	
	
	
	//method for finding log value
	public static void logarithm()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number for which you want to find log(base10):");
		double num1=sc.nextInt();
	//	sc.close();
		double logValue=Math.log10(num1);
		System.out.println("the logValue of number having base 10 is: "+logValue);
		start();
		
	}
	
	
	//method for finding square
	public static void square()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number for which you want to find square :");
		int num1=sc.nextInt();
	//	sc.close();
		int square=num1*num1;
		System.out.println("the value of square is :"+square);
		start();
	}
	
	//method for finding cube
	public static void cube() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number for which you want to find cube:");
		int num1=sc.nextInt();
		//sc.close();
		int cube=num1*num1*num1;
		System.out.println("the  of cube the number is :"+cube);
		start();
	}
	
	//method for finding percentage
	public static void  percentage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number:");
		double num1=sc.nextInt();
		System.out.println("please enter the second number:");
		double num2=sc.nextInt();
		//sc.close();
		double percent=0;
		System.out.println("finding what percent is "+ num1 +" of "+num2);
		if (num1>=0&&num2>=0) 
		{
			percent= (num1/num2)*100;
		}
		else {
			System.out.println("please write positive values of num1 and num2");
		}
		System.out.println(num1+" is "+percent+"% of "+num2);
		start();
	}
	
	
	//method for finding simple interest
	public static void simpleInterest() 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("please enter the principal value:");
	int principal=sc.nextInt();
	System.out.println("please  enter the rate of interest:");
	int time=sc.nextInt();
	System.out.println("please enter the time for which loan is given:");
	int rateOfInterest=sc.nextInt();
	//sc.close();
	
		float si=0.0f;
		si=((principal*time*rateOfInterest)/100.0f);
		System.out.println("the simple interest is :"+si);
		start();
	}
	
	
	//method for finding compound interest
	public static void compoundInterest()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the principal value:");
		double principal=sc.nextInt();
		System.out.println("please  enter the time(in years )for which loan is given:");
		int time=sc.nextInt();
		System.out.println("please enter the rate of interest (annualy):");
		double rateOfInterest=sc.nextInt();
		System.out.println("please enter the no of times interest is compounded in a year:");
	double noOfTimesInterestIsCompoundedInAYear=sc.nextInt();
		//sc.close();
	double amount=0;
	if (rateOfInterest>=0&&time>=0&&principal>=0&&noOfTimesInterestIsCompoundedInAYear>=0)
	{
		double newRoi=rateOfInterest/100;
		System.out.println("rate of interest in decimal is:"+newRoi);
		 amount =principal*Math.pow((1+(newRoi/noOfTimesInterestIsCompoundedInAYear)), (noOfTimesInterestIsCompoundedInAYear*time));
		
	}
	else {
		System.out.println("please enter the positive values of all entities.");
	}
		
	    System.out.println("amount is :"+amount);
		double ci=amount-principal;
		System.out.println("the compound interest is :"+ci);
		start();
	}
	
	
	//method for exit
	public static void exit() 
	{
		System.out.println("Thanks for using the calculator .");
		System.exit(0);
		
		
	}
//	
	
	//start method -this method is recursively called in every method body
	public static void start() 
	{
	System.out.println("==================================");
		 System.out.println("press 1 for addition");
		 System.out.println("press 2 for multiplication.");
		 System.out.println("press 3 for  subtraction.");
		 System.out.println("press 4 for  Divide.");
		 System.out.println("press 5 for  squareRoot.");
		 System.out.println("press 6 for  square of a number");
		 System.out.println("press 7 for  cube of a number");
		 System.out.println("press 8 for  finding percentage");
		 System.out.println("press 9 for  finding simple interest.");
		 System.out.println("press 10 for  finding compound interest.");
		 System.out.println("press 11 for  finding log of a number(base 10):");
		 System.out.println("press 12 for  exit from the calculator");
		
		 Scanner sc=new Scanner(System.in);
		 int x=sc.nextInt();
		
		 //recursive call for repeat method
		repeat(x);
		//sc.close();
		
	}
	
	
	//method in which execution condition is kept
	public static void repeat(int input)
	{
		 
		if (input==1)
		{
			Add();
			
		}
		
		else if(input==2)
		{
			Multiply();
		}
		
		else if (input==3)
		
		{
			Subtract();
		}
		else if (input==4) 
		{
			Divide();
			
		}
		else if (input==5)
		{
			squareRoot();
		}
		else if (input==6)
		{
			square();
		}
		else if (input==7)
		{
			cube();
		}
		else if (input==8)
		{
		percentage();
			
		}
		else if (input==9) 
		{
		simpleInterest();	
		}
		else if (input==10)
		{
			
			compoundInterest();
			
		}
		else if(input==11) 
		{
			logarithm();
		}
		else {
			exit();
		}
	}
	
	
	//driver method
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the world of Calculator.");
		
    start();
	}

}

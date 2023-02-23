package in.ineuron.main;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ConversionCodeApp {

	public static void main(String[] args) throws Exception {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the date in format:: (dd-MM-yyyy)");
	String sdate=scanner.next();
	
	
	//for conversion of date from string to date formal we use a class SimpleDateFormat
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	//note:the date format is case sensitive .
	java.util.Date uDate=sdf.parse(sdate);
	
	long value=uDate.getTime();
	
	java.sql.Date sqlDate=new java.sql.Date(value);
	System.out.println("the string date is :"+sdate);
	System.out.println("the utility date is :"+uDate);
	System.out.println("the date is :"+sqlDate);
	
	//if dateString  is in the form yyyy-MM-dd then no need to first convert the date in 
	//utility date.we can directly convert the date in sql date
	System.out.println("enter the date in the format:: (yyyy-MM-dd)");
	String dateString=scanner.next();
	java.sql.Date sqlDate2=java.sql.Date.valueOf(dateString);
	System.out.println("sqlDate2 is :"+sqlDate2);
	
	}

}

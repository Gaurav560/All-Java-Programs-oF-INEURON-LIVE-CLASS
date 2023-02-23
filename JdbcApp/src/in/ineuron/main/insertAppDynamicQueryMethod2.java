package in.ineuron.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insertAppDynamicQueryMethod2 {

	public static void main(String[] args)throws Exception {
	
System.out.println("establishing the connection:");
String url="jdbc:mysql://localhost:3306/gauravdb";
String username="root";
String password="Lumia@540";
Connection connection=DriverManager.getConnection(url,username,password);
System.out.println("connection created succesfully");
System.out.println("creating statement object which will execute the query");
Statement statement=connection.createStatement();
System.out.println("statement object created successfully");

Scanner sc=new Scanner(System.in);
System.out.println("enter the name of the student: ");
String name=sc.nextLine();
System.out.println("enter the phoneNumber of the student: ");
String pnumber=sc.nextLine();
System.out.println("enter the age of the student: ");
int age=sc.nextInt();
name="'"+name+"'";
pnumber="'"+pnumber+"'";
System.out.println("writing the query ,executing it and processing the result:");
String sqlInsertDynamicQuery="insert into studentinfo(`name`,`pnumber`,`age`) values("+name+","+pnumber+","+age+")";
int noOfRowsAffected=statement.executeUpdate(sqlInsertDynamicQuery);
System.out.println("the no of rows affected is :"+noOfRowsAffected);
System.out.println("closing the resources....");
statement.close();
connection.close();
sc.close();
System.out.println("connection closed successfully...");



	}

}

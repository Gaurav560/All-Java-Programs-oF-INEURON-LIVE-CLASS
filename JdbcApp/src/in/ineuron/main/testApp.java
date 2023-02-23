package in.ineuron.main;


	import java.sql.*;
	class TestApp
	{
	public static void main (String []args)
	{
	Connection connection = null;
	Statement statement=null;
	ResultSet resultSet=null;
	try
	{
	System.out.println("loading and registering the driver ");
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded successfully.....");
	System.out.println("hooray u are too good to be true .");


	System.out.println("2ndStep establishing theconnection :");
	String url="jdbc:mysql://localhost:3306/gauravdb";
	String username="root";
	String password="Lumia@540";
	connection = DriverManager.getConnection(url,username,password);
	System.out.println("Connection established successfully");
	System.out.println("the implement class name is :"+connection.getClass().getName());

	System.out.println("3rd step creating statement and resultset object and sending the query");
	String sqlSelectQuery="select name,pnumber,age from studentinfo";
	statement=connection.createStatement();
	System.out.println("the implementation class name for statement interface is "+statement.getClass().getName());
	resultSet=statement.executeQuery(sqlSelectQuery);
	System.out.println("the implementation class name for resultSet interface  is "+resultSet.getClass().getName());

	System.out.println("Step 4:process the resultSet");
	System.out.println("name\tpnumber\t\tage");
	while(resultSet.next())
	{
	String name=resultSet.getString(1);
	String pnumber=resultSet.getString(2);
	Integer age=resultSet.getInt(3);
	System.out.println(name+"\t"+pnumber+"\t"+age);
	}
	}
	catch(ClassNotFoundException ce)
	{
	ce.printStackTrace();
	}
	catch(SQLException se)
	{
	se.printStackTrace();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	finally
	{
	if(connection!=null)
	{
	try
	{
	connection.close();
	}
	catch(SQLException se)
	{
	se.printStackTrace();
	}
	}
	}
	System.out.println("closing the database........");

	}
	}










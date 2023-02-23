package in.ineuron.main;

import java.sql.*;



public class selectApp {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	//program to demonstrate select operation using jdbc
		
		//step 1: load and register the driver(with jdbc4.x autoloading of driver class happens )
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loading the driver class");
		
		//Step 2: establish a connection
		System.out.println("establishing a connection with mysql databse");
		String url ="jdbc:mysql:///gauravdb";
		String username ="root";
		String password ="Lumia@540";
		System.out.println("creating a connection object");
		Connection connection =DriverManager.getConnection(url,username,password);
		System.out.println("the implement className for connection interface is  is :"+connection.getClass().getName());
		
		//Step 3: create a statement object 
	System.out.println("creating a statement object");
		Statement statement=connection.createStatement();
		System.out.println("the implement className for statement interface is  is :"+statement.getClass().getName());
	
		String sqlSelectQuery="select name,pnumber,age from studentinfo";

		//Step 4: execute the query and process the result
		System.out.println("creating a resultSet object");
		ResultSet resultSet=statement.executeQuery(sqlSelectQuery);
		System.out.println("the implement className for resultSet interface is  is :"+resultSet.getClass().getName());
		System.out.println("processing the resultSet");
		System.out.println("name\tpnumber\t\tage");
		while(resultSet.next()) {
			String name=resultSet.getString(1);
			String pnumber=resultSet.getString(2);
			int age=resultSet.getInt(3);
			System.out.println(name+"\t"+pnumber+"\t"+age);
		}
		//Step 5: handle the exceptions if arises
		//Already handled
		
		//Step 6: close the connection 
		System.out.println("closing the resources");
		resultSet.close();
		statement.close();
		connection.close();
		//note :every object in this is a resource.

	}

}

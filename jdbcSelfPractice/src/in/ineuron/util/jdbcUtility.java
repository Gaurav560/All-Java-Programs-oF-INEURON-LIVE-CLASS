package in.ineuron.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class jdbcUtility {
	
	//private constructor ko bana rahe hain taaki koi is class ka object bana ke iske method ko call nahi kar sake .
	private jdbcUtility(){}

	public static Connection jdbcGetConnection() throws IOException, SQLException
	{
		
		//connecting the application properties file with java utility file
		FileInputStream fis=new FileInputStream("E:\\Java_Programs_Eclipse\\jdbcSelfPractice\\application1.properties");
		Properties properties=new Properties();
		properties.load(fis);
		
		//establishing the connection 
		System.out.println("establishing jdbc connection ");
		Connection connection =DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		return connection;
	}
	
	
	//method to clean up the resources 
	public static  void CleanUp(Connection connection,Statement statement,ResultSet resultSet) throws SQLException
	{
		if (connection!=null) 
		{
			connection.close();
		}
		if(statement!=null) {
			statement.close();
		}
		if(resultSet!=null) {
	resultSet.close();
		}
		
		
	}
}

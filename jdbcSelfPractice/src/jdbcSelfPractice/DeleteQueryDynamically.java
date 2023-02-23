package jdbcSelfPractice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import in.ineuron.util.jdbcUtility;

public class DeleteQueryDynamically {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		Integer integer=null;
	try {
		connection=jdbcUtility.jdbcGetConnection();
		if (connection!=null) {
			statement=connection.createStatement();
		}
	
		
		if (statement!=null) {
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the record pid no u want to delete:");
			int pid=sc.nextInt();
		
			//String sqlInsertDynamicQuery="insert into brothers(`pid`,`name`,`age`,`address`,`phone`) values("+pid+",'"+name+"',"+age+",'"+address+"','"+phone+"')";
		
			integer=statement.executeUpdate("delete from brothers where pid="+pid+"");
		}
		if (integer!=null) {
			System.out.println("no of rows affected is :"+integer);
		}
		
	}
	catch (IOException ie) {
	ie.printStackTrace();
	}
	catch (SQLException se) {
		se.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			jdbcUtility.CleanUp(connection, statement, null);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	}

}

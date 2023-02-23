package in.ineuron.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.ineuron.utiliy.jdbcUtility;

public class PreparedStatementInsertAppDynamically {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		Integer noOfRowsAffected= null;
		Scanner sc=null;
		
	try {
		connection=in.ineuron.utility.jdbcUtility.jdbcGetConnection();
		String sqlInsertQuery=null;
		if (connection!=null) 
		{
		 sqlInsertQuery="insert into brothers(`pid`,`name`,`age`,`address`,`phone`) values(?,?,?,?,?)";
			pstmt=connection.prepareStatement(sqlInsertQuery);
		}
		if (pstmt!=null) {
			//use precompiled queries to set the values
			 sc= new Scanner(System.in);
			System.out.println("enter the pid:");
			int pid=sc.nextInt();
			System.out.println("enter the name of person:");
			String name=sc.next();
			System.out.println("enter the age of the person :");
			int age =sc.nextInt();
			System.out.println("enter the address of the person :");
			String address=sc.next();
			System.out.println("enter the phone number of the person :");
			String phone=sc.next();
			pstmt.setInt(1,pid);
			pstmt.setString(2,name);
			pstmt.setInt(3,age);
			pstmt.setString(4,address);
			pstmt.setString(5,phone);
			System.out.println(sqlInsertQuery);
			//executing the query
			noOfRowsAffected=pstmt.executeUpdate();
			System.out.println("the no of rows inserted is:"+noOfRowsAffected);
		}
		
		
	} catch (SQLException se) {
	se.printStackTrace();
	}catch (IOException ie) {
		ie.printStackTrace();
	}catch (Exception e) {
	e.printStackTrace();
	}finally {
		try {
			in.ineuron.utility.jdbcUtility.CleanUp(connection, pstmt, null);
			sc.close();
			System.out.println("closing the resources");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}

}

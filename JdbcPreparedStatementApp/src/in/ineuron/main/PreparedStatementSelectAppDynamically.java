package in.ineuron.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.ineuron.utiliy.jdbcUtility;

public class PreparedStatementSelectAppDynamically {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
	Scanner scanner=new Scanner(System.in);
		ResultSet resultSet=null;

		
	try {
		connection=in.ineuron.utility.jdbcUtility.jdbcGetConnection();
		String sqlSelectQuery=null;
		if (connection!=null) 
		{
		 sqlSelectQuery="select pid,name,age,address from brothers where pid>?";
			pstmt=connection.prepareStatement(sqlSelectQuery);
		}
		if (pstmt!=null) {
			//use precompiled queries to set the values
			System.out.println("enter the id of the students:");
            int pid=scanner.nextInt();
		pstmt.setInt(1, pid);
			//executing the query
			resultSet=pstmt.executeQuery();
			
		}
		if (resultSet!=null) {
			System.out.println("pid\tname\tage\taddress\tphone");
			while (resultSet.next()) {
			System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5));
//		if (resultSet.next()) {
//			System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5));
//		} else {
//System.out.println("record not found");
		}	
		}
		
		
		
	} catch (SQLException se) {
	se.printStackTrace();
	}catch (IOException ie) {
		ie.printStackTrace();
	}catch (Exception e) {
	e.printStackTrace();
	}finally {
		try {
			in.ineuron.utility.jdbcUtility.CleanUp(connection, pstmt, resultSet);
			scanner.close();
			System.out.println("closing the resources");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//the number of column in the select clause and ResultSet.getXXX() should be same.

	}

}

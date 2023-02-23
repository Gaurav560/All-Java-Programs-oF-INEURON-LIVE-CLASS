package in.ineuron.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Scanner;

import in.ineuron.utiliy.jdbcUtility;

public class PreparedStatementDeleteAppDynamically {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
	Scanner scanner=new Scanner(System.in);
	

		
	try {
		connection=in.ineuron.utility.jdbcUtility.jdbcGetConnection();
		String sqlDeleteQuery=null;
		if (connection!=null) 
		{
		 sqlDeleteQuery="delete from brothers where pid=?";
			pstmt=connection.prepareStatement(sqlDeleteQuery);
		}
		if (pstmt!=null) {
			//use precompiled queries to set the values
			System.out.println("enter the id of the students:");
            int pid=scanner.nextInt();
		pstmt.setInt(1, pid);
			//executing the query
			int rows=pstmt.executeUpdate();
			System.out.println("no of records deleted is :"+rows);
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
			scanner.close();
			System.out.println("closing the resources");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}

}

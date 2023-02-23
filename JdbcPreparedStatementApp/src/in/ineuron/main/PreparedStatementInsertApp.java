package in.ineuron.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.utiliy.jdbcUtility;

public class PreparedStatementInsertApp {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement pstmt=null;
		Integer noOfRowsAffected= null;
		
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
			pstmt.setInt(1,1);
			pstmt.setString(2,"gaurav");
			pstmt.setInt(3,24);
			pstmt.setString(4,"austria");
			pstmt.setString(5,"3653735735");
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
			System.out.println("closing the resources");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}

}

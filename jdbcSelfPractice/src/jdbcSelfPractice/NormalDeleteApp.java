package jdbcSelfPractice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import in.ineuron.util.jdbcUtility;

public class NormalDeleteApp {

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
			integer=statement.executeUpdate("delete from brothers where pid=7;");
		}
		if (integer!=null) {
			System.out.println("no of rows affected is :"+integer);
		}
		
	} catch (IOException ie) {
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

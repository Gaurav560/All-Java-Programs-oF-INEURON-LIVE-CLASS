package jdbcSelfPractice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.ineuron.util.jdbcUtility;

public class SelectQueryWithApplicationProperties {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
	try {
		connection=jdbcUtility.jdbcGetConnection();
		if (connection!=null) {
			statement=connection.createStatement();
		}
		if (statement!=null) {
			resultSet=statement.executeQuery("select * from brothers;");
		}
		
		if (resultSet!=null) {
			System.out.println("pid\tname\tage\taddress\tphone");
			while(resultSet.next())
			{
				System.out.println("\n");
				int pid=resultSet.getInt(1);
				String name=resultSet.getString(2);
				int age=resultSet.getInt(3);
				String address=resultSet.getString(4);
				String phone=resultSet.getString(5);
				System.out.printf(pid+"\t"+name+"\t"+age+"\t"+address+"\t"+phone);
			}
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
			jdbcUtility.CleanUp(connection, statement, resultSet);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}


	}

}

package in.ineuron.main;

import java.io.IOException;
import java.sql.*;

import in.ineuron.util.jdbcUtil;

public class InsertApp {
	public static void main(String[] args) {
		Connection connection =null;
		Statement statement =null;
		ResultSet resultSet =null;
		try {
			connection=jdbcUtil.getjdbcConnection();
			if (connection!=null) {
				statement=connection.createStatement();
			}
			if(statement!=null) {
				resultSet=statement.executeQuery("select name,pnumber,age from studentinfo");	
			}
			if (resultSet!=null) {
				System.out.println("name\tpnumber\t\tage");
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3));
				}
			}
		}
		catch(IOException ie)
		{ie.printStackTrace();}
		catch (SQLException se) {
		se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				jdbcUtil.cleanup(connection, statement, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			}
}

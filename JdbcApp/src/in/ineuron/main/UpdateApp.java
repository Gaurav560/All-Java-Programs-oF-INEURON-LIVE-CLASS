package in.ineuron.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApp {

	public static void main(String[] args) throws SQLException
	{

		
		System.out.println("establishing the connection:");
		String url="jdbc:mysql:///gauravdb";
		String userName ="root";
		String password="Lumia@540";
		Connection connection =DriverManager.getConnection(url,userName,password);
		
		System.out.println("Creating the statement object and execute the query");
		Statement statement =connection.createStatement();
		
		//create the resultSetObject and process the result.
		String sqlUpdateQuery="update studentinfo set name='shweta' where pnumber=9234676768 ";
		int noOfRowsUpdated=statement.executeUpdate(sqlUpdateQuery);
		System.out.println("the nof of rows updated is :"+noOfRowsUpdated);
		System.out.println("Closing the resources.");
		statement.close();
		connection.close();
	}

}

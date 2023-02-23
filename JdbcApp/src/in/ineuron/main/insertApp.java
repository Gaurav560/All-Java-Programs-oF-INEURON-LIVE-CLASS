package in.ineuron.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertApp {

	public static void main(String[] args) throws Exception {
		System.out.println("establishing the connection:");
		String url="jdbc:mysql:///gauravdb";
		String userName ="root";
		String password="Lumia@540";
		Connection connection =DriverManager.getConnection(url,userName,password);
		
		System.out.println("Creating the statement object and execute the query");
		Statement statement =connection.createStatement();
		String sqlInsertQuery ="insert into studentinfo(name,pnumber,age) values('gaurav','9523849635','24');";
		int noOfRowsAffected=statement.executeUpdate(sqlInsertQuery);
		System.out.println("the nof of rows affected is :"+noOfRowsAffected);
		System.out.println("closing the resources...");
		statement.close();
		connection.close();

	}

}

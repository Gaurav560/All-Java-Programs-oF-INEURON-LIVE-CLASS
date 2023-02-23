package in.ineuron.main;
import java.sql.*;


public class DeleteApp {
public static void main(String[] args) throws SQLException
{//deleting a record from the table 
	
	//autoloading of driver class will happen and register
	//part of the driver will be done by the static block in the driver class
	
	System.out.println("establishing the connection:");
	String url="jdbc:mysql:///gauravdb";
	String userName ="root";
	String password="Lumia@540";
	Connection connection =DriverManager.getConnection(url,userName,password);
	
	System.out.println("Creating the statement object and execute the query");
	Statement statement =connection.createStatement();
	
	//create the resultSetObject and process the result.
	String sqlDeleteQuery="delete from studentinfo where pnumber=9523849635 ";
	int noOfRowsDeleted=statement.executeUpdate(sqlDeleteQuery);
	System.out.println("the nof of rows deleted is :"+noOfRowsDeleted);
	System.out.println("Closing the resources.");
	statement.close();
	connection.close();
	}
}

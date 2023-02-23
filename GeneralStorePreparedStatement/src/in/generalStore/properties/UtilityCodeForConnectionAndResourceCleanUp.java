package in.generalStore.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UtilityCodeForConnectionAndResourceCleanUp {
public static Connection getJdbcConnection() throws SQLException,IOException
{
	FileInputStream fis=new FileInputStream("E:\\Java_Programs_Eclipse\\GeneralStorePreparedStatement\\src\\in\\generalStore\\utility\\app.properties");
	Properties properties= new Properties();
	properties.load(fis);
	Connection connection=DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),properties.getProperty("password"));
	return connection;
	
}
public static void CleanUpCodeForResources(Connection connection,Statement statement,ResultSet resultSet)throws SQLException
{
	if (connection!=null) {
		connection.close();
	}
	if (statement!=null) {
		statement.close();
	}
	if (resultSet!=null) {
		resultSet.close();
	}
	
	
}
}

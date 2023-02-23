package in.ineuron.utiliy;
import java.util.*;
import java.sql.*;
import java.io.*;
public class jdbcUtil12 {
	private jdbcUtil12(){}//MAKING CONSTRUCTOR PRIVATE jisse koi uska object bana ke use na karle
	//but static method ko hum class ke naam se call kar sakte hain.(normal case mein hum object bana ke kisi class ke method ko call karte hain.)
public static Connection getjdbcConnection() throws SQLException, IOException {
	
	FileInputStream fis=new FileInputStream("E:\\Java_Programs_Eclipse\\jdbcStandardApp\\application.properties");
	Properties properties=new Properties();
	properties.load(fis);
	System.out.println("establishing the connection:");
	Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
	System.out.println("connection created succesfully");
	return  connection;
}


public static void cleanup(Connection con,Statement stmnt,ResultSet rsltset) throws SQLException
{
	if (con!=null) {
		con.close();
	}
	if (stmnt!=null) {
		stmnt.close();
	}
	if (rsltset!=null) {
		rsltset.close();
	}
}
}

package jdbcSelfPractice;

import java.sql.*;


public class NormalSelectApp {

	
	public static void main(String[] args) throws Exception {
	Connection connection =null;
	Statement statement=null;
	ResultSet resultSet=null;
	//step 1 loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		

		//Step 2 creating connection object and establishing the connection 
		String url="jdbc:mysql:///juniorg";
		String username="root";
		String password="Lumia@540";
		connection=DriverManager.getConnection(url,username,password);
		
		//step 3 create statement object and execute the query
		String sqlSelectQuery="select * from brothers";
		statement=connection.createStatement();
		resultSet=statement.executeQuery(sqlSelectQuery);
		System.out.println("pid\tname\tage\taddress\t\tpnumber");
	;
		
		while (resultSet.next()) 
		{
			int pid=resultSet.getInt(1);
			String name=resultSet.getString(2);
			int age=resultSet.getInt(3);
			String address=resultSet.getString(4);
			String phone=resultSet.getString(5);
			System.out.println(pid+"\t"+name+"\t"+age+"\t"+address+"\t"+phone);
		}
		resultSet.close();
		statement.close();
		connection.close();
		

	}

}

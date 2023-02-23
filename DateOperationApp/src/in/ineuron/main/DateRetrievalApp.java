package in.ineuron.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.ineuron.utility.jdbcUtility;

public class DateRetrievalApp {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultset=null;
		Scanner scanner=null;
	try {
		connection=jdbcUtility.jdbcGetConnection();
		if (connection!=null) {
		String	sqlSelectQuery="select * from users where ID=?";
			preparedStatement = connection.prepareStatement(sqlSelectQuery);
			
		}
		if (preparedStatement!=null) {
			scanner=new Scanner(System.in);
			System.out.println("enter the id ofthe person you want to search :");
			int id=scanner.nextInt();
			preparedStatement.setInt(1, id);
			resultset= preparedStatement.executeQuery();
			
		}
		if (resultset!=null) {
			System.out.println("pid\tpname\tdob\t\tdom");
			if (resultset.next()) {
				int pid=resultset.getInt(1);
				String pname=resultset.getString(2);
				java.sql.Date sqlDate1=resultset.getDate(3);
				java.sql.Date sqlDate2=resultset.getDate(4);
				SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
				String dobString=sdf1.format(sqlDate1);
				String domString=sdf1.format(sqlDate2);
				System.out.println(pid+"\t"+pname+"\t"+dobString+"\t"+domString);
				
			}
			else {
				System.out.println("sorry no record found!");
			}
			
		}
	} catch (SQLException se) {
	se.printStackTrace();}
	catch(IOException ie)
	{ie.printStackTrace();}
	catch (Exception e) {
	e.printStackTrace();
	}finally {
		try {
			jdbcUtility.CleanUp(connection, preparedStatement, resultset);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

	}

}

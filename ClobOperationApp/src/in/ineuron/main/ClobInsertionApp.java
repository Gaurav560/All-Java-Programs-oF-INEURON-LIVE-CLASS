package in.ineuron.main;

import java.io.File;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.ineuron.utility.jdbcUtility;

public class ClobInsertionApp {

	public static void main(String[] args) {

		//Resources used
		Connection connection=null;
		PreparedStatement pstmt=null;
		Scanner scanner=null;
		
		
		//Variables used
	
		String name=null;
	String pdfLocation=null;

	try {
		
		connection=jdbcUtility.jdbcGetConnection();
		if (connection!=null) {
			String sqlInsertQuery="insert into cities(`name`,`history`) values(?,?)";
			pstmt=connection.prepareStatement(sqlInsertQuery);
			
		}
		if (pstmt!=null) {
			scanner=new Scanner(System.in);
			
			//collecting the inputs
			if (scanner!=null) {
				
				System.out.println("enter the cityName:");
				 name=scanner.next();
				
				System.out.println("enter the location of the pdf as string format :");
		 pdfLocation=scanner.next();
				
				
			
				//set the input values to Query
				pstmt.setNString(1, name);
				pstmt.setCharacterStream(2, new FileReader(new File(pdfLocation)));
			
				//execute the Query
				int noOfRowsAffected=pstmt.executeUpdate();
				System.out.println("no of rows inserted is :"+noOfRowsAffected);
		
			}
			
	
		
		
		
	}} catch (IOException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (Exception e) {
	e.printStackTrace();
	}finally {
		try {
			jdbcUtility.CleanUp(connection, pstmt, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
	}

}

package in.ineuron.main;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.ineuron.utility.jdbcUtility;

public class DateInsertionApp {

	public static void main(String[] args)  {
		
		
		//Resources used
		Connection connection=null;
		PreparedStatement pstmt=null;
		Scanner scanner=null;
		
		
		//Variables used
		java.sql.Date sqlDateOfBirth=null;
		java.sql.Date sqlDateOfMarrriage=null;
		String nameString=null;
		String dobString=null;
		String domString=null;
	try {
		
		connection=jdbcUtility.jdbcGetConnection();
		if (connection!=null) {
			String sqlInsertQuery="insert into users(`NAME`,`DOB`,`DOM`) values(?,?,?)";
			pstmt=connection.prepareStatement(sqlInsertQuery);
			
		}
		if (pstmt!=null) {
			scanner=new Scanner(System.in);
			
			//collecting the inputs
			if (scanner!=null) {
				
				System.out.println("enter the name:");
				 nameString=scanner.next();
				
				System.out.println("enter the dob::(yyyy-MM-dd)");
				 dobString=scanner.next();
				
				
				System.out.println("enter the dom::(dd-MM-yyyy)");
				 domString=scanner.next();
				 }
			
			//conversion of dates from string type to date type
			if (dobString!=null) {
				sqlDateOfBirth=java.sql.Date.valueOf(dobString);
					System.out.println("sqlDateOfBirth is :"+sqlDateOfBirth);
				}
			
			if (domString!=null) {
				
					SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
					java.util.Date uDate=sdf.parse(domString);
					long val=uDate.getTime();
				 sqlDateOfMarrriage=new java.sql.Date(val);
					System.out.println("sqlDateOfMarriage is:"+sqlDateOfMarrriage);
				}
				
				
				
			
				//set the input values to Query
				pstmt.setNString(1, nameString);
				pstmt.setDate(2, sqlDateOfBirth);
				pstmt.setDate(3, sqlDateOfMarrriage);
				
				//execute the Query
				int noOfRowsAffected=pstmt.executeUpdate();
				System.out.println("no of rows inserted is :"+noOfRowsAffected);
		
			}
			
	
		
		
		
	} catch (IOException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (ParseException e) {
	e.printStackTrace();}
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

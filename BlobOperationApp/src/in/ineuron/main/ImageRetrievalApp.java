package in.ineuron.main;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import in.ineuron.utility.jdbcUtility;

public class ImageRetrievalApp {

	public static void main(String[] args) {

		//Resources used
		Connection connection=null;
		PreparedStatement pstmt=null;
		Scanner scanner=null;
ResultSet resultset=null;
		
		
		//Variables used
	
	
	try {
		
		connection=jdbcUtility.jdbcGetConnection();
		if (connection!=null) {
			String sqlInsertQuery="select * from persons where id=?";
			pstmt=connection.prepareStatement(sqlInsertQuery);
			
		}
		if (pstmt!=null) {
			scanner=new Scanner(System.in);	
		//collecting the inputs
			if (scanner!=null) {
				System.out.println("enter the id for which you want to retrieve the image :");
				int id=scanner.nextInt();
				
				//set the input values to Query
				pstmt.setInt(1, id);
			
				//execute the Query
		resultset= pstmt.executeQuery();
		
			}
			if (resultset!=null) {
				if (resultset.next()) {
					System.out.println("id\tname\timage");
					int id1=resultset.getInt(1);
					String name=resultset.getString(2);
					InputStream is=resultset.getBinaryStream(3);
				
					
					File file=new File("copied.jpg");
					FileOutputStream fos=new FileOutputStream(file);
					
					
					//copying the data from input stream(is) to file outputStream(fos)
					IOUtils.copy(is, fos);
					
					
					//high performance -fast
//					byte [] b=new byte[1024];
//					while (is.read(b)>0) {
//						fos.write(b);
//						
//					}
					fos.close();
					
					
					//low performance -slow
//					int i=is.read();
//					while (i!=-1) {
//						fos.write(i);
//					i=is.read();	
//					}fos.close();
					System.out.println(id1+"\t"+name+"\t"+file.getAbsolutePath());
				}
				else {
					System.out.println("record not found.");
				}
				
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

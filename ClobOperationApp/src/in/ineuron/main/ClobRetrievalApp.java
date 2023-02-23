package in.ineuron.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.mysql.cj.protocol.Resultset;

import in.ineuron.utility.jdbcUtility;

public class ClobRetrievalApp {

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
			String sqlInsertQuery="select * from cities where id=?";
			pstmt=connection.prepareStatement(sqlInsertQuery);
			
		}
		if (pstmt!=null) {
			scanner=new Scanner(System.in);
			
			//collecting the inputs
			if (scanner!=null) {
				
				System.out.println("enter the id name for which you want to find out the history of the city::");
			int	 id=scanner.nextInt();
			
				//set the input values to Query
				pstmt.setInt(1, id);
				//execute the Query
			resultset=pstmt.executeQuery();
			}
			
}
		if (resultset!=null) {
			if (resultset.next()) {
				System.out.println("id\tcityName\thistory");	
				int id1=resultset.getInt(1);
				String name=resultset.getString(2);
			      Reader reader=resultset.getCharacterStream(3);
			      File file=new File("history_copied.pdf");
			  FileWriter fw=new FileWriter(file);
			      
			      //copying the data from is to fos
			  IOUtils.copy(reader, fw);
			  fw.close();
			  System.out.println(id1+"\t"+name+"\t"+file.getAbsolutePath());
			}
			else {
				System.out.println("no record found.");
			}
		
		}
		} catch (IOException | SQLException e) {
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

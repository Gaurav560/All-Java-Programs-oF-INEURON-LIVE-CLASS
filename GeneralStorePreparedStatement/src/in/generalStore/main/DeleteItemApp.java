package in.generalStore.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.generalStore.properties.UtilityCodeForConnectionAndResourceCleanUp;

public class DeleteItemApp {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		Integer noOfRowsAffectedInteger=null;
		Scanner scanner=null;
		try {connection=UtilityCodeForConnectionAndResourceCleanUp.getJdbcConnection();
		if (connection!=null) {
			String sqlDeleteQuery="delete from generalstore where ItemId=?";
			pstmt=connection.prepareStatement(sqlDeleteQuery);
			
		}
		if (pstmt!=null) {
			scanner=new Scanner(System.in);
			if (scanner!=null) {
				System.out.println("enter the id of the record you want to delete from the table:");
				int id=scanner.nextInt();
			pstmt.setInt(1,id);	
			}
			noOfRowsAffectedInteger=pstmt.executeUpdate();
			System.out.println("no of rows deleted is :"+noOfRowsAffectedInteger);
		}
		}
		catch(SQLException|IOException si) 
		{si.printStackTrace();}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				UtilityCodeForConnectionAndResourceCleanUp.CleanUpCodeForResources(connection, pstmt, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}scanner.close();
		}

	}

}

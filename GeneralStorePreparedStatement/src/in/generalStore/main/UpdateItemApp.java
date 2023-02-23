package in.generalStore.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.generalStore.properties.UtilityCodeForConnectionAndResourceCleanUp;

public class UpdateItemApp {

	public static void main(String[] args) {
	Connection connection=null;
	PreparedStatement pstmt=null;
	Integer noOfRowsAffected=null;
	Scanner scanner=null;
	
		try {
			connection=UtilityCodeForConnectionAndResourceCleanUp.getJdbcConnection();
			if (connection!=null) {
				String sqlUpdateQuery="update generalstore set ItemName='CloseUp' where ItemId=?";
				pstmt=connection.prepareStatement(sqlUpdateQuery);
				
			}
			if (pstmt!=null) {
				scanner=new Scanner(System.in);
				if (scanner!=null) {
					System.out.println("enter the id no for which you want to change ItemName::");
					int itemId=scanner.nextInt();
					pstmt.setInt(1, itemId);
				}
				noOfRowsAffected=pstmt.executeUpdate();
				System.out.println("no of rows updated is :"+noOfRowsAffected);
			}
		} catch (SQLException|IOException si) {
			si.printStackTrace();
		}
		catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				UtilityCodeForConnectionAndResourceCleanUp.CleanUpCodeForResources(connection, pstmt, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}scanner.close();
		}

	}

}

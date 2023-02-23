package in.generalStore.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.generalStore.properties.UtilityCodeForConnectionAndResourceCleanUp;

public class InsertItemApp {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		Scanner scanner=null;
	Integer noOfRowsInserted=null;
		try {
			connection=UtilityCodeForConnectionAndResourceCleanUp.getJdbcConnection();
		if (connection!=null) {
			String SqlInsertQuery="insert into generalstore(ItemName,ItemPrice,ItemQuantity) values(?,?,?)";
			pstmt=connection.prepareStatement(SqlInsertQuery);	
		}
			if (pstmt!=null) {
				scanner=new Scanner(System.in);
				if (scanner!=null) {
				
					System.out.println("enter the itemName::");
					String itemName=scanner.next();
					System.out.println("enter the itemPrice::");
					int itemPrice=scanner.nextInt();
					System.out.println("enter the itemQuantity::");
					int itemQuantity=scanner.nextInt();
				
				pstmt.setNString(1, itemName);
				pstmt.setInt(2, itemPrice);
				pstmt.setInt(3, itemQuantity);
			}}
			noOfRowsInserted=pstmt.executeUpdate();
			System.out.println("no fo rows inserted is :"+noOfRowsInserted);
			
		}catch (SQLException|IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				UtilityCodeForConnectionAndResourceCleanUp.CleanUpCodeForResources(connection, pstmt, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		scanner.close();
		}

	}

}

package in.generalStore.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import in.generalStore.properties.UtilityCodeForConnectionAndResourceCleanUp;

public class SelectItemApp {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rSet=null;
		try {
			connection=UtilityCodeForConnectionAndResourceCleanUp.getJdbcConnection();
		if (connection!=null) {
			String sqlSelectQuery="select * from generalstore";
			pstmt=connection.prepareStatement(sqlSelectQuery);

		}
		if (pstmt!=null) {
			rSet=pstmt.executeQuery();
			
		}
		if (rSet!=null) {
			System.out.println("ItemId\tItemName\tItemPrice\tItemQuantity");
			while(rSet.next()) {

			System.out.println(rSet.getInt(1)+"\t"+rSet.getString(2)+"\t\t"+rSet.getInt(3)+"\t\t"+rSet.getInt(4));
			}
			
		}
		} catch(SQLException|IOException si) {si.printStackTrace();}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				UtilityCodeForConnectionAndResourceCleanUp.CleanUpCodeForResources(connection, pstmt, rSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}

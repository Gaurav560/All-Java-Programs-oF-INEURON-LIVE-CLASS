package in.ineuron.main;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;
import in.ineuron.utility.jdbcUtil12;

public class csStoredProcedureMySqlApp {
	private static final String storedProcedureCall="{CALL P_GET_PRODUCT_BY_NAME(?,?)}";
	public static void main(String[] args) {
		Connection connection=null;
		CallableStatement cstmt=null;
		ResultSet resultset=null;
          Scanner scanner=null;
		String prod1 =null;
		String prod2 =null;
		boolean flag= false;
		
try {
	connection=jdbcUtil12.getjdbcConnection();
	 if (connection!=null) 
	 {
		cstmt=connection.prepareCall(storedProcedureCall);
	}
	 
	 scanner=new Scanner(System.in);
	 if (scanner!=null) {
		System.out.println("enter the NAME for which you want to get the details: ");
	prod1=scanner.next();
	System.out.println("enter the 2nd product name:");
	prod2=scanner.next();
	 }
	 
	 //setting the id
	 if (cstmt!=null) {
		 cstmt.setString(1,prod1);
		 cstmt.setString(2,prod2);
	}
	 

	 //run the stored procedure
	 if (cstmt!=null) {
	
		cstmt.execute();
	}
	 if (cstmt!=null) {
		 resultset=cstmt.getResultSet();
		
	}
	 //retrieve the result
	if (resultset!=null) {
		
		System.out.println("pid\tpname\tprice\tquantity");
		while (resultset.next()) {
			int id=resultset.getInt(1);
			String name=resultset.getString(2);
			int price=resultset.getInt(3);
			int qty=resultset.getInt(4);
			System.out.println(id+"\t"+name+"\t"+price+"\t"+qty);
		}	
	}
	if (flag) {
		System.out.println("record found");
	}
	else {
		System.out.println("record not found.");
	}	
}catch (SQLException|IOException e) {
e.printStackTrace();
} 
catch (Exception e) {
	e.printStackTrace();
}finally {
	try {
		jdbcUtil12.cleanup(connection, cstmt, resultset);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}scanner.close();
}
	}

}

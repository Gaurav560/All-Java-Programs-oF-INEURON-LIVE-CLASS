package in.ineuron.main;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import in.ineuron.utility.jdbcUtil12;

public class callableApp {

	public static void main(String[] args) {
		Connection connection=null;
		CallableStatement cstmt=null;
          Scanner scanner=null;
		Integer id=null;
		String storedProcedureCall="{CALL P_get_details_by_id(?,?,?)}";
try {
	connection=jdbcUtil12.getjdbcConnection();
	 if (connection!=null) 
	 {
		cstmt=connection.prepareCall(storedProcedureCall);
	}
	 
	 scanner=new Scanner(System.in);
	 if (scanner!=null) {
		System.out.println("enter the id for which you want to get the details: ");
	id=scanner.nextInt();
	 }
	 
	 //setting the id
	 if (cstmt!=null) {
		 cstmt.setInt(1,id);
	}
	 
//setting the datatypes of output values
	 if (cstmt!=null) {
cstmt.registerOutParameter(2, Types.INTEGER);
cstmt.registerOutParameter(3, Types.INTEGER);
		
	}
	 //run the stored procedure
	 if (cstmt!=null) {
	
		cstmt.execute();
	}
	 //retrieve the result
	 if (cstmt!=null) {
		 System.out.println("product price is :" +  cstmt.getInt(2));
		 System.out.println("product quantity is :"+cstmt.getInt(3));
		
	}
} 
catch (SQLException | IOException e) {	
	e.printStackTrace();
}catch (Exception e) {
e.printStackTrace();
}
finally {
	try {
		jdbcUtil12.cleanup(connection, cstmt,null);
	} catch (SQLException e) {
		e.printStackTrace();
	}scanner.close();
}

	}

}

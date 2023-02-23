package in.ineuron.main;
import java.util.Date;


class DateApp{
	public static void main(String []args) {

		Date uDate=new Date();
		System.out.println("utilitydate is :"+uDate);
		System.out.println("java.util.Date gives info about Date and time also");
		
		long value=uDate.getTime();
		System.out.println("information about date in milliseconds:"+value);
		
		System.out.println("java.sql.Date gives Date only ");
		java.sql.Date sqlDate=new java.sql.Date(value);
		System.out.println("sql date is :"+sqlDate);
		
	}
}



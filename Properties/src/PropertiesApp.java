import java.io.FileInputStream;
import java.util.Properties;


public class PropertiesApp {

	public static void main(String[] args) throws Exception
	{
	FileInputStream	fis=new FileInputStream("src\\application.properties");
	Properties properties=new Properties();
	properties.load(fis);
	String urlString=properties.getProperty("urlString");
    String usernameString=properties.getProperty("usernameString");
    String passwordString=properties.getProperty("passwordString");
	
System.out.println(urlString);
System.out.println(usernameString);
System.out.println(passwordString);
	}

}

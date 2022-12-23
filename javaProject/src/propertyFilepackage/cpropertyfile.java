package propertyFilepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class cpropertyfile {
	@Test
	
public void script() throws IOException
{

Properties prop=new Properties();
FileInputStream fis=new FileInputStream("./PropertyFile/credential.properties");
prop.load(fis);
String user=prop.getProperty("username");
String pass=prop.getProperty("password");
System.out.println(user+" "+pass);

}
}


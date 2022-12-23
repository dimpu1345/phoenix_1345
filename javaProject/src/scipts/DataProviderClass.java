package scipts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@DataProvider(name="SignupCredentials")
	public static String[][] data()
	{
		String arr[][]= {{"vade","vade@sambar.com","sumadhura","GD bar"},
				{"first","first@gmail.com","earth","earth"}};
		
		return arr;
	}

	
	@Test(dataProvider="SignupCredentials")
	public static void Test(String FN,String mail,String CA,String PA)
	{
		System.out.println(FN+" "+mail+" "+CA+" "+PA);
	}

}

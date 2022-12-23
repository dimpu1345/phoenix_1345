package scipts;

import org.testng.annotations.Test;

public class NormalcClass {
	@Test(dataProvider="SignupCredentials",dataProviderClass = DataProviderClass.class)
	public static void Test(String FN,String mail,String CA,String PA)
	{
		System.out.println(FN+" "+mail+" "+CA+" "+PA);
	}

}




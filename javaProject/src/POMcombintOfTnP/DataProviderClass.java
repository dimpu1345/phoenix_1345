package POMcombintOfTnP;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="signupdata")
	public String[][] data()
	{
		String[][] arr= {{"Ronaldo","Cristiano","cr7@gmail.com","Ballon D'or"}};
		return arr;
	}

}

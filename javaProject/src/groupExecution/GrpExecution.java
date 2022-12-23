package groupExecution;

import org.testng.annotations.Test;

public class GrpExecution {
	
	@Test(groups = {"Sanity","Regression"})
	public void eduloan()
	{
		System.out.println("For Education");
	}
	
	@Test(groups = {"Sanity","Regression"})
	public void marriageloan()
	{
		System.out.println("For Marriage");
	}
	@Test(groups = {"System","Regression"})
	public void gold()
	{
		System.out.println("For Gold...");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void carloan()
	{
		System.out.println("For cars...");
		
	}
}

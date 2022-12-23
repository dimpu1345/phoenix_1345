package javaPackage;

import org.testng.annotations.Test;

public class DependencyScript {
	@Test()
	public void signup()
	{
		System.out.println("HI I AM SIGNUP");
		
	}
	@Test(dependsOnMethods ="signup")
	public void login()
	{
		System.out.println("HI I AM lOGIN");
		
	}
	@Test(dependsOnMethods = {"signup","login"})
	public void cart()
	{
		System.out.println("HI I AM CART");
	}
	
	@Test(dependsOnMethods = {"signup","login"})
	public void logout()
	{
		System.out.println("HI I AM LOGOUT");
	}
	

}

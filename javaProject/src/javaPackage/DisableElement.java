package javaPackage;

import org.testng.annotations.Test;

public class DisableElement {
	@Test(priority = 1, invocationCount = 4,enabled = false)
	public void Signup()
	{
		System.out.println("HI I AM SIGNUP");
		
	}
	@Test(priority = 2,invocationCount = 2,enabled = true)
	public void login()
	{
		System.out.println("HI I AM lOGIN");
		
	}
	@Test(priority = 3,invocationCount = 2,enabled = false)
	public void cart()
	{
		System.out.println("HI I AM CART");
	}
	
	@Test(priority = 4,invocationCount = 1,enabled = true)
	public void logout()
	{
		System.out.println("HI I AM LOGOUT");
	}
	

}

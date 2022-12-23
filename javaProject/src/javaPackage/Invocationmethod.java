package javaPackage;

import org.testng.annotations.Test;

public class Invocationmethod {
	public class Priorityscript {
		@Test(priority = 1, invocationCount = 4)
		public void Signup()
		{
			System.out.println("HI I AM SIGNUP");
			
		}
		@Test(priority = 2,invocationCount = 2)
		public void login()
		{
			System.out.println("HI I AM lOGIN");
			
		}
		@Test(priority = 3,invocationCount = 2)
		public void cart()
		{
			System.out.println("HI I AM CART");
		}
		
		@Test(priority = 4,invocationCount = 3)
		public void logout()
		{
			System.out.println("HI I AM LOGOUT");
		}
		
}
}

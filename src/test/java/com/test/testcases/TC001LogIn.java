package com.test.testcases;

import org.testng.annotations.Test;

import com.test.pages.Login;

public class TC001LogIn {

	@Test
	public void run()
	{
		new Login()
		.invokeApp()
		.enterUsernamePassword()
		.signIn();
	}
	
}


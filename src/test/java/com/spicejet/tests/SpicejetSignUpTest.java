package com.spicejet.tests;

import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.SpiceWrappers;

public class SpicejetSignUpTest extends SeWrappers {
	SpiceWrappers sw= new SpiceWrappers();
	SeWrappers se= new SeWrappers();

	@Test
	
	public void signUpPage()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp functionality with valid credentials");
			sw.launchBrowser();
			sw.signupSpicejet("Shanmathi", "Saravanan", "India", "8903352653","shanmathisaravanan18@gmail.com", "Shan@123", "Shan@123");
		Reports.reportStep("PASS", "SignUp with valid credentials passed");

			screenshot("Signup Valid");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "SignUp failed");
			ex.printStackTrace();
		}	
	}
}
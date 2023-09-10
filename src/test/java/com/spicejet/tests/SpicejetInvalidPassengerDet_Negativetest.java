package com.spicejet.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.spicejet.pages.SpicejetInPassesgerDet_NegativePage;
import com.spicejet.utils.Reports;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.SpiceWrappers;

public class SpicejetInvalidPassengerDet_Negativetest extends SeWrappers
{
	SpiceWrappers sw= new SpiceWrappers();
	SeWrappers se= new SeWrappers();

	//negative test case
	@Test		
	public void SignUpInvalidCred()
	{
		try
		{
			Reports.setTCDesc("Booking Flight with invalid Passenger Details");
			sw.launchBrowser();
			sw.invalid_passengerDetails("9025128059", "Shan@123");
			sw.oneWayFlight(20);
			sw.bookingFlights("Shanmathi", "Saravanan", "9025128059", "shansarav12@gmail.com", "Bangalore","saro","saran","8903352653","sindhu","rohi","9994204226");
			Reports.reportStep("PASS", "InFormation is missing, Please Enter a Valid Passenger details");
			screenshot("Invalid Login");


		}
		catch(Exception ex)
		{
			//Reports.reportStep("FAIL", "Login failed");
			ex.printStackTrace();
		}
	}

	@AfterMethod
	public void closeBrowsers()
	{
		closeAllBrowsers();
	}
}
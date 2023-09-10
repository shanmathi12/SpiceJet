package com.spicejet.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.SpiceWrappers;

public class SpicejetBookingTest extends SeWrappers{
	SpiceWrappers sw= new SpiceWrappers();
	SeWrappers se= new SeWrappers();
	
	
@Test	
	public void BookingFlight()
	{
		try
		{
			
			Reports.setTCDesc("Validating Booking Flight functionality ");
			sw.launchBrowser();
			sw.loginSpicejet("9025128059", "Shan@123");
			sw.oneWayFlight(20);
			sw.bookingFlights("Shanmathi", "Saravanan", "9025128059", "shansarav12@gmail.com", "Bangalore","saro","saran","8903352653","sindhu","rohi","9994204226");
			//sw.dummyPayment("2222 4053 4324 8877","shanmathi", "08", "28", "123");
			Reports.reportStep("PASS", "Search with valid credentials passed");
			Thread.sleep(2000);
			screenshot("Flight Booking");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "Booking Flights failed");
			ex.printStackTrace();
		}
	}
@AfterMethod
public void closeBrowsers() throws InterruptedException
{
	Thread.sleep(3000);
	closeAllBrowsers();
}


}
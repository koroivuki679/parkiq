package parkIQ.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import parkIQ.pageObjects.DefaultPage;
import parkIQ.pageObjects.LoginPage;
import parkIQ.pageObjects.WelcomePage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest()
	{
		logger.info("URL is opened");

		DefaultPage dp = new DefaultPage(driver);
		LoginPage lp = new LoginPage(driver);
		WelcomePage wp = new WelcomePage(driver);

		dp.clickTracker();
		logger.info("The tracker form's clicked");

		logger.info("Inserting User Credentials");

		lp.fillCredentials(email, password);

		boolean isDisplayedLogo = wp.logoIsDisplayed();

		try
		{
			Assert.assertTrue(isDisplayedLogo);
			logger.info("Login Successful, located IC Logo");
		}catch (AssertionError ex)
		{
			logger.info("Login Unsuccessful");
			throw new AssertionError(ex);
		}
	}

}

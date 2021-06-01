package parkIQ.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import parkIQ.pageObjects.ForgotPasswordPage;
import parkIQ.pageObjects.LoginPage;

public class TC_ForgotPasswordTest_001 extends BaseClass{

  @Test
  public void forgotPasswordTest()
  {
    logger.info("URL is opened");

    LoginPage lp= new LoginPage(driver);
    lp.checkLogo();
    logger.info("Logo Displayed");
    lp.clickForgotPasswordLink();
    logger.info("Forgot Password Clicked. Redirecting to forgot password page");

    ForgotPasswordPage fp = new ForgotPasswordPage(driver);
    fp.checkTitle();
    logger.info("Forgot Password Title displayed");

    fp.setEmail(email);
    logger.info("Entered Email");

    fp.clickReset();
    logger.info("Reset Button Clicked. Redirect to Reset Password Confirmation Page");

    fp.checkPasswordResetPrompt();
    logger.info("Reset Prompt Displayed");


    if(driver.getPageSource().contains("An email has been sent to you. Click on the link it contains to reset your password."))
    {
      Assert.assertTrue(true);
      logger.info("Forgot Password test passed");

    }
    else {
      Assert.assertFalse(false);
      logger.info("Forgot Password test failed");
    }
  }

}

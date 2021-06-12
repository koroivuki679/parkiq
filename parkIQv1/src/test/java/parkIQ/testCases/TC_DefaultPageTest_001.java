package parkIQ.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import parkIQ.pageObjects.DefaultPage;

public class TC_DefaultPageTest_001 extends BaseClass{

  @Test
  public void testHeaderDisplayed() {
    logger.info("URL is opened");

    DefaultPage defaultPage = new DefaultPage(driver);
    boolean isDisplayed = defaultPage.formTitleDisplayed();
    try {
      Assert.assertTrue(isDisplayed);
      logger.info("Header 'INSPIRING CHAMPIONS' is displayed");

    } catch (AssertionError ex) {
      logger.info("Header 'INSPIRING CHAMPIONS' is not displayed");
      throw new AssertionError(ex);
    }
  }

  @Test (priority = 1)
  public void testFormOrderLinkDisplayedWithText()
  {
    DefaultPage defaultPage = new DefaultPage(driver);
    boolean isClickableDisplayed = defaultPage.linkOrderFormDisplayedWithText();

    try
    {
      Assert.assertTrue(isClickableDisplayed);
      logger.info("Link Order Form is displayed and clickable");
    } catch (AssertionError ex)
    {
      logger.info("Error locating order form link");
      throw new AssertionError(ex);
    }
  }

  @Test (priority = 2)
  public void testTrackerLinkDisplayedWithText()
  {
    DefaultPage defaultPage = new DefaultPage(driver);
    boolean isClickableDisplayed = defaultPage.linkTrackerDisplayedWithText();

    try
    {
      Assert.assertTrue(isClickableDisplayed);
      logger.info("The Tracker Link is displayed and clickable");

    } catch (AssertionError ex)
    {
      logger.info("Error locating The Tracker link");
      throw new AssertionError(ex);
    }
  }

}

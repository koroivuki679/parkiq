package parkIQ.pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import parkIQ.common.WebElementFunctions;

public class DefaultPage {

	 WebDriver ldriver;

	public DefaultPage(WebDriver rdriver) //a constructor; ldiver = local driver, rdriver = remote driver
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

		//Inspiring Champions Header
		@FindBy(xpath="//h1[contains(text(),'Inspiring Champions')]")
		@CacheLookup
		WebElement headerIC;
		
		@FindBy(xpath="//a[contains(text(),'Order Form')]")
		@CacheLookup
		WebElement linkOrderForm;
		
		@FindBy(xpath="//a[contains(text(),'The Tracker')]")
		@CacheLookup
		WebElement linkTheTracker;

		WebElementFunctions func = new WebElementFunctions();


		public boolean formTitleDisplayed()
		{
			func.pageLoad(ldriver);
			return func.verifyElementDisplayedWithText(headerIC, "INSPIRING CHAMPIONS");
		}

		public boolean linkOrderFormClickable()
		{
			return func.verifyElementIsClickable(linkOrderForm, ldriver);
		}

		public boolean linkTrackerDisplayedWithText()
		{
			return func.verifyElementDisplayedWithText(linkTheTracker, "The Tracker");
		}

		public boolean linkOrderFormDisplayedWithText()
		{
			return func.verifyElementDisplayedWithText(linkOrderForm, "Order Form");
		}

		public boolean linkTrackerClickable()
		{
			return func.verifyElementIsClickable(linkTheTracker, ldriver);
		}
		public void clickTracker()
		{
			linkTheTracker.click();
		}

		public void clickOrderForm()
		{
			linkOrderForm.click();
		}
}

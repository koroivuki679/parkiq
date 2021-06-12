package parkIQ.pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parkIQ.common.WebElementFunctions;

public class WelcomePage {

	 WebDriver ldriver;

	public WelcomePage(WebDriver rdriver) //a constructor; ldiver = local driver, rdriver = remote driver
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

		//WebElement txtEmail = ldriver.findElement(By.id("Email"));
		@FindBy(xpath="//body/form[@id='form1']/div[3]/div[1]/a[1]")
		@CacheLookup
		WebElement logo;

		WebElementFunctions func = new WebElementFunctions();

		public boolean logoIsDisplayed()
		{
			func.pageLoad(ldriver);
			return logo.isDisplayed();
		}
}

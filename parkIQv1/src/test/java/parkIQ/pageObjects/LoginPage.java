package parkIQ.pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import parkIQ.common.WebElementFunctions;

public class LoginPage {
	
	 WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) //a constructor; ldiver = local driver, rdriver = remote driver
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

		//WebElement txtEmail = ldriver.findElement(By.id("Email"));
		@FindBy(id="txtEmail")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(id="txtPassword")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(id="btnSubmit")
		@CacheLookup
		WebElement btnSubmit;

		WebElementFunctions func = new WebElementFunctions();

		public void fillCredentials(String user, String psswd)
		{
			func.pageLoad(ldriver);
			txtEmail.sendKeys(user);
			txtPassword.sendKeys(psswd);
			btnSubmit.click();
		}
}

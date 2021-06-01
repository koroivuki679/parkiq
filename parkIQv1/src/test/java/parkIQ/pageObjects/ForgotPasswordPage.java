package parkIQ.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {
  WebDriver ldriver;

  public ForgotPasswordPage(WebDriver rdriver) //a constructor; ldiver = local driver, rdriver = remote driver
  {
    this.ldriver = rdriver;
    PageFactory.initElements(rdriver, this);

  }


  @FindBy(id="Email")
  @CacheLookup
  WebElement txtEmail;

  @FindBy(xpath="//button[contains(text(),'RESET')]")
  @CacheLookup
  WebElement btnReset;

  @FindBy(xpath="//button[contains(text(),'CANCEL')]")
  @CacheLookup
  WebElement btnCancel;

  @FindBy(xpath="//a[contains(text(),'Sign Up Here')]")
  @CacheLookup
  WebElement linkSignUp;

  @FindBy(xpath = "//h2[contains(text(),'Forgot Password')]")
  @CacheLookup
  WebElement titleForgotPassword;

  @FindBy(xpath = "//h2[contains(text(),'Your password reset is on its way!')]")
  @CacheLookup
  WebElement passwordResetPrompt;


  public void setEmail(String uname) {
    txtEmail.sendKeys(uname);
  }

  public void clickReset()
  {
    btnReset.click();
  }

  public void clickCancel()
  {
    btnCancel.click();
  }

  public void clickSignUp()
  {
    linkSignUp.click();
  }

  public void checkTitle()
  {
    WebDriverWait waitElement = new WebDriverWait(ldriver, 20);
    waitElement.until(ExpectedConditions.visibilityOf(titleForgotPassword));
  }

  public void checkPasswordResetPrompt()
  {
    WebDriverWait waitElement = new WebDriverWait(ldriver, 20);
    waitElement.until(ExpectedConditions.visibilityOf(passwordResetPrompt));
  }



}

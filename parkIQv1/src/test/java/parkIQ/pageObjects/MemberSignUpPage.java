package parkIQ.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberSignUpPage {
  WebDriver ldriver;

  public MemberSignUpPage(WebDriver rdriver) //a constructor; ldiver = local driver, rdriver = remote driver
  {
    this.ldriver = rdriver;
    PageFactory.initElements(rdriver, this);
  }


  @FindBy(id="FirstName")
  @CacheLookup
  WebElement txtFirstName;

  @FindBy(id="LastName")
  @CacheLookup
  WebElement txtLastName;

  @FindBy(id="PhoneNumber")
  @CacheLookup
  WebElement txtPhoneNumber;

  @FindBy(id="Email")
  @CacheLookup
  WebElement txtEmail;

  @FindBy(id="Password")
  @CacheLookup
  WebElement txtPassword;

  @FindBy(id="ConfirmPassword")
  @CacheLookup
  WebElement txtConfirmPassword;

  @FindBy(id="IsAcceptTerms")
  @CacheLookup
  WebElement checkBoxAcceptTerms;

  @FindBy(xpath="//button[contains(text(),'SIGN UP')]")
  @CacheLookup
  WebElement btnSignUp;

  @FindBy(xpath="//button[contains(text(),'CANCEL')]")
  @CacheLookup
  WebElement btnCancel;

  @FindBy(xpath="//a[contains(text(),\"I'm a member - Sign In\")]")
  @CacheLookup
  WebElement linkSignIn;

  @FindBy(xpath="//a[contains(text(),'Need help?')]")
  @CacheLookup
  WebElement linkNeedHelp;





  public void setFirstName(String fname)
  {
    txtFirstName.sendKeys(fname);
  }

  public void setLastName(String lname)
  {
    txtLastName.sendKeys(lname);
  }

  public void setPhoneNumber(String phone)
  {
    txtPhoneNumber.sendKeys(phone);
  }

  public void setEmail(String email)
  {
    txtEmail.sendKeys(email);
  }

  public void setPassword(String password)
  {
    txtPassword.sendKeys(password);
  }

  public void setConfirmPassword(String cpassword)
  {
    txtConfirmPassword.sendKeys(cpassword);
  }

  public void checkBoxClick()
  {
    checkBoxAcceptTerms.click();
  }

  public void clickSignUp()
  {
    btnSignUp.click();
  }

  public void clickCancel()
  {
    btnCancel.click();
  }

  public void clickSignInLink()
  {
    linkSignIn.click();
  }

  public void clickNeedHelpLink()
  {
    linkNeedHelp.click();
  }

}
